/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
/**
 *
 * @author Daniel Ríos y Crisbel Madrigal
 */
public class Tiquete {
    
    private Vuelo vuelo;
    private Pasajero pasajero;
    private String clase;
    
    public Tiquete(Vuelo vuelo, Pasajero pasajero, String clase) {
        this.vuelo = vuelo;
        this.pasajero = pasajero;
        this.clase = clase;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
    
    
    
    public String generarTiquete() {
        return "=== TIQUETE ===\n" + vuelo.toString() + "\n" + pasajero.toString() + "\nClase: " + clase + "\n=================";
    }
}