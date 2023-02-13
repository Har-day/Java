package tarea;

public class recipientes {

    String Nombre = "Recipiente de Crema";
    String Color = "Verde", Forma = "Cilindrica";
    float CapacidadEnMililitros = 100;
    Boolean Abierto = false;

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
        System.out.println("Abierto: " + Abierto);
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    public void Abrir() {
        Abierto = true;
        System.out.println("");
        System.out.println("");

    }

    public void Cerrar() {
        Abierto = false;
        System.out.println("");
        System.out.println("");

    }

    public void AplicarDosis() {
        CapacidadEnMililitros -= 1;
        System.out.println("");
        System.out.println("");

    }

    public void RellenarCapacidad() {
        CapacidadEnMililitros = 100;
        System.out.println("");
        System.out.println("");

    }
}
