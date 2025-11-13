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

    private String id;
    private Tiquete tiquete;
    private double subtotal;
    private double iva;
    private double total;

    public Factura(String id, Tiquete tiquete, double subtotal, double iva, double total) {
        this.id = id;
        this.tiquete = tiquete;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Tiquete getTiquete() {
        return tiquete;
    }

    public void setTiquete(Tiquete tiquete) {
        this.tiquete = tiquete;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" + "id=" + id + ", tiquete=" + tiquete + ", subtotal=" + subtotal + ", iva=" + iva + ", total=" + total + '}';
    }
    
    
                
    }

