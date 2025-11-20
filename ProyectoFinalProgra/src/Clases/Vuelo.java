/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Daniel Ríos y Crisbel Madrigal
 */

public class Vuelo{
    
    private String origen;
    private String destino;
    private String fecha;
    private Avion avion;
    
    public Vuelo(String origen, String destino, String fecha, Avion avion) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.avion = avion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }
    
    @Override
    public String toString() {
        return "Vuelo: " + origen + " -> " + destino + " (" + fecha + ")";
    }
}