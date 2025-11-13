/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.UUID;
/**
 *
 * @author Daniel Ríos y Crisbel Madrigal
 */
public class Tiquete {
    private String id;
    private Vuelo vuelo;
    private Pasajero pasajero;
    private String clase; // \"ejecutiva\" o \"economica\"
    private String asiento;

    public Tiquete(Vuelo vuelo, Pasajero pasajero, String clase, String asiento) {
        this.id = UUID.randomUUID().toString();
        this.vuelo = vuelo;
        this.pasajero = pasajero;
        this.clase = clase;
        this.asiento = asiento;
    }

    public String getId() {
        return id;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public String getClase() {
        return clase;
    }

    public String getAsiento() {
        return asiento;
    }

    @Override
    public String toString() {
        return "Tiquete{" +
                "id='" + id + '\'' +
                ", vuelo=" + vuelo.getNumero() +
                ", origen=" + vuelo.getOrigen() +
                ", destino=" + vuelo.getDestino() +
                ", pasajero=" + pasajero.getNombre() +
                ", clase='" + clase + '\'' +
                ", asiento='" + asiento + '\'' +
                '}';
    }
}
