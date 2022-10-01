/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lista pacientes");
        Paciente pa = new Paciente("Felipe", "Vanegas", "Av 68 # 9-78", "malestar", "Dr.Vanegas", "Eps", "25-05-2022", 1, 'M');
        pa.mostrarA();
        Paciente pa1 = new Paciente("Jean", "Suarez", "carrera 20 # 3-15", "Dolor gastrointestinal", "Dr.Alvarez", "Hospital Central", "01-01-2022", 2, 'M');
        pa1.mostrarA();
        Paciente pa2 = new Paciente("Julian", "Hernandez", "Diagonal 7 # 5-16", "Consulta", "Dr.Perez", "Centro de salud", "20-9-2022", 3, 'M');
        pa2.mostrarA();
        Paciente pa3 = new Paciente("Luisa", "Diaz", "Calle 15 # 7-14", "Urgencias", "Dra.Bernal", "Hospital Central", "16-05-2022", 4, 'F');
        pa3.mostrarA();

        System.out.println("LISTA DE DOCTORES");
        Medico me = new Medico("DR." + "JOSE", "RAMIREZ");
        me.mostrarA();
        Medico me1 = new Medico("DR." + "RAUL", "JIMENEZ");
        me1.mostrarA();
        Medico me2 = new Medico("DRA." + "ROSA", "GONZALEZ");
        me2.mostrarA();
        Medico me3 = new Medico("DR." + "JUAN", "NEGRETE");
        me3.mostrarA();

        System.out.println("LISTA CENTROS DE SERVICIO");
        Servicio cs = new Servicio("HOSPITAL", "HOSPITAL CENTRAL");
        cs.mostrarDoc();
        Servicio cs1 =  new Servicio("CENTRO DE SALUD", "AGUAS");
        cs1.mostrarDoc();

    }

}
