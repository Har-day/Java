package tarea;

public class Contenedor {

    String Nombre = "Perfume Paco Raban";
    String Color = "Plata", Forma = "Robot";
    float CapacidadEnMililitros = 500;
    Boolean SprayPresionado = false;

    public void mostrarRecipienteInicial() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Color: " + Color);
        System.out.println("Forma: " + Forma);
        System.out.println("Capacidad En ml: " + CapacidadEnMililitros);
        System.out.println("");
        System.out.println("");
        System.out.println("");

    }

    public void mostrarRecipienteEstado() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Capacidad En ml: " + CapacidadEnMililitros);
        System.out.println("SprayActivado?: " + SprayPresionado);
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    public void Abrir() {
        SprayPresionado = true;
        System.out.println("");
        System.out.println("");

    }

    public void Cerrar() {
        SprayPresionado = false;
        System.out.println("");
        System.out.println("");

    }

    public void AplicarDosis() {
        CapacidadEnMililitros -= 2;
        System.out.println("");
        System.out.println("");

    }

    public void RellenarCapacidad() {
        CapacidadEnMililitros = 500;
        System.out.println("");
        System.out.println("");

    }
}
