package tarea;

public class Tarea {

    public static void main(String[] args) {
        recipientes recipienteCrema = new recipientes();
        recipienteCrema.mostrarRecipienteInicial();
        recipienteCrema.mostrarRecipienteEstado();
        recipienteCrema.Abrir();
        recipienteCrema.mostrarRecipienteEstado();
        recipienteCrema.AplicarDosis();
        recipienteCrema.AplicarDosis();
        recipienteCrema.AplicarDosis();
        recipienteCrema.mostrarRecipienteEstado();
        recipienteCrema.Cerrar();
        recipienteCrema.mostrarRecipienteEstado();
        recipienteCrema.Abrir();
        recipienteCrema.mostrarRecipienteEstado();
        recipienteCrema.RellenarCapacidad();
        recipienteCrema.Cerrar();
        recipienteCrema.mostrarRecipienteEstado();
            System.out.println("");
       Herramienta LlaveInglesa= new Herramienta();
       LlaveInglesa.MostrarHerramientaInicial();
       LlaveInglesa.AbrirPinza();
       LlaveInglesa.MostrarHerramientaEstado();
       LlaveInglesa.CerrarPinza();
       LlaveInglesa.MostrarHerramientaEstado();
        System.out.println("");
       Teclado Razer= new Teclado();
       Razer.MostrarTecladoInicial();
       Razer.MostrarTecladoEstado();
       Razer.PresionarVocales();
       Razer.MostrarTecladoEstado();
       Razer.SoltarVocales();
       Razer.MostrarTecladoEstado();
           System.out.println("");
  Contenedor Perfume = new Contenedor();
   Perfume.mostrarRecipienteInicial();
        Perfume.mostrarRecipienteEstado();
        Perfume.Abrir();
        Perfume.mostrarRecipienteEstado();
        Perfume.AplicarDosis();
        Perfume.AplicarDosis();
        Perfume.AplicarDosis();
        Perfume.mostrarRecipienteEstado();
        Perfume.Cerrar();
        Perfume.mostrarRecipienteEstado();
        Perfume.Abrir();
        Perfume.mostrarRecipienteEstado();
        Perfume.RellenarCapacidad();
        Perfume.Cerrar();
        Perfume.mostrarRecipienteEstado();
            System.out.println("");
            
            Compartimiento_Sedas SedaBucarine = new Compartimiento_Sedas();
        SedaBucarine.mostrarCSInicial();
        SedaBucarine.mostrarCSEstado();
        SedaBucarine.Abrir();
        SedaBucarine.mostrarCSEstado();
        SedaBucarine.UsarPorcion();
        SedaBucarine.UsarPorcion();
        SedaBucarine.UsarPorcion();
        SedaBucarine.mostrarCSEstado();
        SedaBucarine.Cerrar();
        SedaBucarine.mostrarCSEstado();
        SedaBucarine.Abrir();
        SedaBucarine.mostrarCSEstado();
        SedaBucarine.RellenarCapacidad();
        SedaBucarine.Cerrar();
        SedaBucarine.mostrarCSEstado();
            System.out.println("");

           
    }

}
