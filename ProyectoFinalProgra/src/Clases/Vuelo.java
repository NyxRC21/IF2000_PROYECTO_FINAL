/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Daniel Ríos y Crisbel Madrigal
 */
public class Vuelo {
    private String numero;
    private String origen;
    private String destino;
    private Avion avion;

    public Vuelo(String numero, String origen, String destino, Avion avion) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.avion = avion;
    }

    public String getNumero() {
        return numero;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Avion getAvion() {
        return avion;
    }

    public boolean hayDisponibilidad(String clase) {
        return avion != null && avion.hayDisponibilidad(clase);
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "numero='" + numero + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", avion=" + (avion != null ? avion.getCodigo() : "N/A") +
                '}';
    }
}