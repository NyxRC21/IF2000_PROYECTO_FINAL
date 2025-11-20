/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
/**
 *
 * @author Daniel Ríos y Crisbel Madrigal
 */
public class Factura {

    private Tiquete tiquete;
    private double costo;
    
    public Factura(Tiquete tiquete) {
        this.tiquete = tiquete;
        this.costo = tiquete.getClase().equalsIgnoreCase("Ejecutiva") ? 1000.0 : 500.0;
    }

    public Tiquete getTiquete() {
        return tiquete;
    }

    public void setTiquete(Tiquete tiquete) {
        this.tiquete = tiquete;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }    
    
    public String generarFactura() {
        return "=== FACTURA ===\n" + tiquete.generarTiquete() + "\nCosto Total: $" + costo + "\n=================";
    }
}
