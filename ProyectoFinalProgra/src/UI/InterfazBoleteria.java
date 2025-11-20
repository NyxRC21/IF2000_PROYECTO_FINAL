/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Clases.Reservacion;
import Clases.Avion;
import Clases.Factura;
import Clases.Pasajero;
import Clases.Tiquete;
import Clases.Vuelo;
/**
 *
 * @author krisb
 */
public class InterfazBoleteria extends JFrame {
    
public class Main extends JFrame {
    private JTextField nombreField, idField;
    private JComboBox<String> claseCombo;
    private JTextArea outputArea;
    private Reservacion reservacion;

    public Main() {
        // Hardcodear un vuelo fijo
        Avion avion = new Avion();
        Vuelo vuelo = new Vuelo("Bogotá", "Medellín", "2023-10-15", avion);
        reservacion = new Reservacion(vuelo);

        setTitle("Sistema de Reservación de Tiquetes Aéreos");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel de entrada
        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        inputPanel.add(new JLabel("Nombre del Pasajero:"));
        nombreField = new JTextField();
        inputPanel.add(nombreField);
        inputPanel.add(new JLabel("ID del Pasajero:"));
        idField = new JTextField();
        inputPanel.add(idField);
        inputPanel.add(new JLabel("Clase:"));
        claseCombo = new JComboBox<>(new String[]{"Ejecutiva", "Económica"});
        inputPanel.add(claseCombo);
        JButton reservarBtn = new JButton("Reservar");
        inputPanel.add(reservarBtn);

        // Área de salida
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Acción del botón
        reservarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText().trim();
                String id = idField.getText().trim();
                String clase = (String) claseCombo.getSelectedItem();

                if (nombre.isEmpty() || id.isEmpty()) {
                    outputArea.setText("Error: Completa todos los campos.");
                    return;
                }

                Pasajero pasajero = new Pasajero(nombre, id);
                if (reservacion.reservar(pasajero, clase)) {
                    Tiquete tiquete = reservacion.generarTiquete(pasajero, clase);
                    Factura factura = reservacion.generarFactura(tiquete);
                    outputArea.setText("Reservación exitosa!\n\n" + vuelo.toString() + "\n" + pasajero.toString() + "\n\n" + tiquete.generarTiquete() + "\n\n" + factura.generarFactura());
                } else {
                    outputArea.setText("Error: No hay disponibilidad en la clase " + clase + ".");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }
}