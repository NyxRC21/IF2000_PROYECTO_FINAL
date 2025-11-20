/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Daniel Ríos y Crisbel Madrigal
 */
public class Reservacion {
    
    private Vuelo vuelo;
    
    public Reservacion(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }
    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    
    
    public boolean reservar(Pasajero pasajero, String clase) {
        if (!vuelo.getAvion().verificarDisponibilidad(clase)) {
            return false;
        }
        vuelo.getAvion().reservarAsiento(clase);
        return true;
    }
    public Tiquete generarTiquete(Pasajero pasajero, String clase) {
        return new Tiquete(vuelo, pasajero, clase);
    }
    public Factura generarFactura(Tiquete tiquete) {
        return new Factura(tiquete);
    }
}