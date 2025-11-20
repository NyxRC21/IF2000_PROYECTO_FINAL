/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import Clases.Reservacion;
import Clases.Avion;
import Clases.Factura;
import Clases.Pasajero;
import Clases.Tiquete;
import Clases.Vuelo;

/**
 * @author Daniel Ríos y Krisbel Madrigal
 */
public class InterfazBoleteria extends JFrame {
    
    private JTextField nombreField, idField, fechaField;
    private JComboBox<String> claseCombo, origenCombo, destinoCombo;
    private JTextArea outputArea;
    private Reservacion reservacion;
    private Avion avion;

    public InterfazBoleteria() {
        // Inicializa el avión
        avion = new Avion();

        setTitle("Sistema de Reservación de Tiquetes");
        setSize(600, 600); // Aumentado para acomodar más componentes
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        // Panel de título
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(70, 130, 180));
        titlePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel titleLabel = new JLabel("Reservación de Vuelos", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setForeground(Color.WHITE);
        titlePanel.add(titleLabel);

        // Panel de entrada con colores y espaciado
        JPanel inputPanel = new JPanel(new GridBagLayout());
        inputPanel.setBackground(new Color(173, 216, 230)); // Azul claro
        inputPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // Etiquetas y campos
        gbc.gridx = 0; gbc.gridy = 0;
        JLabel nombreLabel = new JLabel("Nombre del Pasajero:");
        nombreLabel.setFont(new Font("Arial", Font.BOLD, 12));
        inputPanel.add(nombreLabel, gbc);
        gbc.gridx = 1;
        nombreField = new JTextField(15);
        inputPanel.add(nombreField, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        JLabel idLabel = new JLabel("ID del Pasajero:");
        idLabel.setFont(new Font("Arial", Font.BOLD, 12));
        inputPanel.add(idLabel, gbc);
        gbc.gridx = 1;
        idField = new JTextField(15);
        inputPanel.add(idField, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        JLabel claseLabel = new JLabel("Clase:");
        claseLabel.setFont(new Font("Arial", Font.BOLD, 12));
        inputPanel.add(claseLabel, gbc);
        gbc.gridx = 1;
        claseCombo = new JComboBox<>(new String[]{"Ejecutiva", "Económica"});
        inputPanel.add(claseCombo, gbc);

        // Nuevos campos para origen, destino y fecha
        gbc.gridx = 0; gbc.gridy = 3;
        JLabel origenLabel = new JLabel("Origen:");
        origenLabel.setFont(new Font("Arial", Font.BOLD, 12));
        inputPanel.add(origenLabel, gbc);
        gbc.gridx = 1;
        origenCombo = new JComboBox<>(new String[]{"Costa Rica", "Panamá", "Noruega", "Filipinas", "China"});
        inputPanel.add(origenCombo, gbc);

        gbc.gridx = 0; gbc.gridy = 4;
        JLabel destinoLabel = new JLabel("Destino:");
        destinoLabel.setFont(new Font("Arial", Font.BOLD, 12));
        inputPanel.add(destinoLabel, gbc);
        gbc.gridx = 1;
        destinoCombo = new JComboBox<>(new String[]{"Costa Rica", "Panamá", "Noruega", "Filipinas", "China"});
        inputPanel.add(destinoCombo, gbc);

        gbc.gridx = 0; gbc.gridy = 5;
        JLabel fechaLabel = new JLabel("Fecha (YYYY-MM-DD):");
        fechaLabel.setFont(new Font("Arial", Font.BOLD, 12));
        inputPanel.add(fechaLabel, gbc);
        gbc.gridx = 1;
        fechaField = new JTextField(15);
        inputPanel.add(fechaField, gbc);

        gbc.gridx = 0; gbc.gridy = 6; gbc.gridwidth = 2; gbc.anchor = GridBagConstraints.CENTER;
        JButton reservarBtn = new JButton("Reservar Vuelo");
        reservarBtn.setFont(new Font("Arial", Font.BOLD, 14));
        reservarBtn.setBackground(new Color(34, 139, 34)); // Verde
        reservarBtn.setForeground(Color.WHITE);
        reservarBtn.setToolTipText("Haz clic para reservar tu vuelo");
        inputPanel.add(reservarBtn, gbc);

        // Área de salida con fuente monoespaciada
        outputArea = new JTextArea(10, 40);
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        outputArea.setBackground(new Color(240, 248, 255));
        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Resultado de la Reservación"));

        // Agregar paneles al frame
        add(titlePanel, BorderLayout.NORTH);
        add(inputPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        // Acción del botón
        reservarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText().trim();
                String id = idField.getText().trim();
                String clase = (String) claseCombo.getSelectedItem();
                String origen = (String) origenCombo.getSelectedItem();
                String destino = (String) destinoCombo.getSelectedItem();
                String fecha = fechaField.getText().trim();

                if (nombre.isEmpty() || id.isEmpty()) {
                    outputArea.setText("Error: Complete todos los campos.");
                    outputArea.setForeground(Color.RED); // Color rojo para errores
                    return;
                }

                //Origen y destino no pueden ser el mismo
                if (origen.equals(destino)) {
                    outputArea.setText("Error: El origen y destino no pueden ser el mismo lugar.");
                    outputArea.setForeground(Color.RED);
                    return;
                }

                // Nueva validación: Fecha no puede ser anterior a hoy
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                sdf.setLenient(false); // No permitir fechas inválidas
                try {
                    Date fechaSeleccionada = sdf.parse(fecha);
                    Date hoy = new Date(); // Fecha actual
                    if (fechaSeleccionada.before(hoy)) {
                        outputArea.setText("Error: La fecha no puede ser anterior a la fecha actual.");
                        outputArea.setForeground(Color.RED);
                        return;
                    }
                } catch (ParseException ex) {
                    outputArea.setText("Error: Formato de fecha inválido. Usa YYYY-MM-DD.");
                    outputArea.setForeground(Color.RED);
                    return;
                }

                // Crear vuelo basado en la selección
                Vuelo vuelo = new Vuelo(origen, destino, fecha, avion);
                reservacion = new Reservacion(vuelo);

                Pasajero pasajero = new Pasajero(nombre, id);
                if (reservacion.reservar(pasajero, clase)) {
                    Tiquete tiquete = reservacion.generarTiquete(pasajero, clase);
                    Factura factura = reservacion.generarFactura(tiquete);
                    outputArea.setForeground(Color.BLACK);
                    outputArea.setText("Reservación exitosa!\n\n" + vuelo.toString() + "\n" + pasajero.toString() + "\n\n" + tiquete.generarTiquete() + "\n\n" + factura.generarFactura());
                } else {
                    outputArea.setForeground(Color.RED);
                    outputArea.setText("Error: No hay disponibilidad en la clase " + clase + ".");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new InterfazBoleteria().setVisible(true);
        });
    }
}