/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java;

/**
 *
 * @author LENOVO
 */
public class Servicio {
    private String tipo;
    private String nombreA;

    public String getTipo() {
        return tipo;
    }

    public String getNombreA() {
        return nombreA;
    }

    public Servicio(String tipo, String nombreA) {
        this.tipo = tipo;
        this.nombreA = nombreA;
    }
    public void mostrarDoc(){
        System.out.println("Tipo:"+getTipo()+ "Nombre: "+getNombreA());
    }
    
}
