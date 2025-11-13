/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Daniel Ríos
 */
public class Avion {
    private String codigo;
    private boolean ejecutivo[];
    private boolean economico[];
    
    public Avion(String codigo){
        this.ejecutivo = ejecutivo;
        this.economico = economico;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean[] getEjecutivo() {
        return ejecutivo;
    }

    public boolean[] getEconomico() {
        return economico;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEjecutivo(boolean[] ejecutivo) {
        this.ejecutivo = ejecutivo;
    }

    public void setEconomico(boolean[] economico) {
        this.economico = economico;
    }
    
    public String toString (){
        return "Codigo{" +
                "ejecutivo='" + ejecutivo + '\'' +
                ", economico='" + economico + '\'' +
                '}';
    }
}
    
    

