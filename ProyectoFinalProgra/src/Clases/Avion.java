/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
/**
 *
 * @author Daniel Ríos y Crisbel Madrigal
 */
public class Avion {
    
    private int asientosEjecutivos = 2; // Capacidad fija: 2 ejecutiva
    private int asientosEconomicos = 2; // Capacidad fija: 2 económica

    public Avion() {
        this.asientosEjecutivos = asientosEjecutivos;
        this.asientosEconomicos = asientosEconomicos;
    }

    public int getAsientosEjecutivos() {
        return asientosEjecutivos;
    }

    public void setAsientosEjecutivos(int asientosEjecutivos) {
        this.asientosEjecutivos = asientosEjecutivos;
    }

    public int getAsientosEconomicos() {
        return asientosEconomicos;
    }

    public void setAsientosEconomicos(int asientosEconomicos) {
        this.asientosEconomicos = asientosEconomicos;
    }
    
    public boolean verificarDisponibilidad(String clase) {
        if (clase.equalsIgnoreCase("Ejecutiva")) {
            return asientosEjecutivos > 0;
        } else if (clase.equalsIgnoreCase("Económica")) {
            return asientosEconomicos > 0;
        }
        return false;
    }
    public boolean reservarAsiento(String clase) {
        if (verificarDisponibilidad(clase)) {
            if (clase.equalsIgnoreCase("Ejecutiva")) {
                asientosEjecutivos--;
            } else if (clase.equalsIgnoreCase("Económica")) {
                asientosEconomicos--;
            }
            return true;
        }
        return false;
    }
}