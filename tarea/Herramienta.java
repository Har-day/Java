package tarea;

public class Herramienta {

    String Nombre = "Llave Inglesa";
    String Color = "Plateado", Forma = "llave inglesa";
    Boolean PinzaAbierta = false;

    public void MostrarHerramientaInicial() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Color: "+Color);
        System.out.println("Forma: "+Forma);
        System.out.println("¿Pinza Abierta?: "+PinzaAbierta);
    }
        public void MostrarHerramientaEstado() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("¿Pinza Abierta?: "+PinzaAbierta);
    }
        public void AbrirPinza(){
            PinzaAbierta=true;
        }       
        public void CerrarPinza(){
            PinzaAbierta=false;
        }
}
