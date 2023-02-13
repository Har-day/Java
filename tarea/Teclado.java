/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;

/**
 *
 * @author AJIN
 */
public class Teclado {

    String Nombre = "Razer Blackwidow V3", ColorBase = "Negro", ColorTeclas = "RGB";
    boolean TeclaA_Presionada = false;
    boolean TeclaE_Presionada = false;
    boolean TeclaI_Presionada = false;
    boolean TeclaO_Presionada = false;
    boolean TeclaU_Presionada = false;

    public void MostrarTecladoInicial() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Color Teclado: " + ColorBase + " Color Teclas: " + ColorTeclas);
        System.out.println("");
    }
        public void MostrarTecladoEstado() {
        System.out.println("Nombre: " + Nombre);
            System.out.println("Tecla A presionada?: "+TeclaA_Presionada);  
            System.out.println("Tecla E presionada?: "+TeclaE_Presionada);  
            System.out.println("Tecla I presionada?: "+TeclaI_Presionada);  
            System.out.println("Tecla O presionada?: "+TeclaO_Presionada);  
            System.out.println("Tecla U presionada?: "+TeclaU_Presionada);  
                    System.out.println("");

        }

    public void PresionarA() {
        TeclaA_Presionada = true;
    }
        public void SoltarA() {
        TeclaA_Presionada = false;
    }

    public void PresionarE() {
        TeclaE_Presionada = true;
    }
    public void SoltarE() {
        TeclaE_Presionada = false;
    }
    public void PresionarI() {
        TeclaI_Presionada = true;
    }
    public void SoltarI() {
        TeclaI_Presionada = false;
    }
    public void PresionarO() {
        TeclaO_Presionada = true;
    }
        public void SoltarO() {
        TeclaO_Presionada = false;
    }

    public void PresionarU() {
        TeclaU_Presionada = true;
    }
        public void SoltarU() {
        TeclaU_Presionada = false;
    }
      public void PresionarVocales(){
          PresionarA();
          PresionarE();
          PresionarI();
          PresionarO();
          PresionarU();
                  
      }
        public void SoltarVocales(){
          SoltarA();
          SoltarE();
          SoltarI();
          SoltarO();
          SoltarU();
                  
      }
}
