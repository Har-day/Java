import java.util.Scanner;

import javax.swing.JOptionPane;

public class swEjercicio3 {
	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("De que figura desea hallar el -AREA- \n1.Circulo \n2.Rectangulo \n3.Cuadrado \n4.Rombo \n5.Triangulo"));
		switch(x) {
		case 1:
			Double r =Double.parseDouble(JOptionPane.showInputDialog("Ingrese su radio"));
			Double Arc = Math.PI*Math.pow(r, 2);
			JOptionPane.showMessageDialog(null, "El area del circulo es: "+ Arc);
		}
		
	}
}
