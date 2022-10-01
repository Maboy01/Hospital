/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java;

/**
 *
 * @author LENOVO
 */
public class Paciente extends Persona {

    private String direccion;
    private String motivoA;
    private String medico;
    private String centroAtt;
    private String fecha;
    private int codigo;
    private char sexo;

    public Paciente(String direccion, String motivoA, String medico, String centroAtt, String fecha, int codigo, char sexo, String nombre, String apellido) {
        super(nombre, apellido);
        this.direccion = direccion;
        this.motivoA = motivoA;
        this.medico = medico;
        this.centroAtt = centroAtt;
        this.fecha = fecha;
        this.codigo = codigo;
        this.sexo = sexo;
    }

    public void mostrarA() {
        System.out.println("Nombre: " + getNombre() + "\nApellido: " + getApellido() + "\nDireccion: " + direccion + "\nMotivo Consulta: " + motivoA + "\nMedico: " + medico + "\nCentro de atencion: " + centroAtt + "\nfecha: " + fecha + "\nCodigo: " + codigo + "\nSexo: " + sexo);

    }

}
