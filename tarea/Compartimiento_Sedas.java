/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;

/**
 *
 * @author AJIN
 */
public class Compartimiento_Sedas {

    String Nombre = "Seda Dental Bucarine";
    String Color = "Blanco", Forma = "Rectangular";
    float CapacidadEnMetros = 5;
    Boolean Abierto = false,Cortar=false;
        public void mostrarCSEstado() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Capacidad En Metros: " + CapacidadEnMetros);
        System.out.println("Abierto: " + Abierto);
            System.out.println("Corte: "+ Cortar);
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    public void mostrarCSInicial(){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Color: " + Color);
        System.out.println("Forma: " + Forma);
        System.out.println("Capacidad En Metros: " + CapacidadEnMetros);
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    public void Abrir() {
        Abierto= true;
        System.out.println("");
        System.out.println("");

    }
    public void UsarPorcion() {
        CapacidadEnMetros -= 0.2;
        System.out.println("");
        System.out.println("");

    }
    public void Cerrar() {
        Abierto = false;
        System.out.println("");
        System.out.println("");

    }
    public void Cortar() {
        Cortar = true;
        System.out.println("");
           Cortar = false;
        System.out.println("");

    }    
        public void RellenarCapacidad() {
        CapacidadEnMetros = 5;
        System.out.println("");
        System.out.println("");

    }
}

    

