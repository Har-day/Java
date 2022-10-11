import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digita el caracter dependiendo de la figura a la cual le quieras encontrar el area, '1' Circulo, '2' Triangulo o '3' Cuadrado"));
		if (a == 1) {
			double r = Double.parseDouble(JOptionPane.showInputDialog("Digite el radio de su circulo"));
			JOptionPane.showMessageDialog(null, "El area de su circulo es: " + (Math.PI * Math.pow(r, 2)));
		} else if (a == 2) {
			double b = Double.parseDouble(JOptionPane.showInputDialog("Digite la base de su triangulo"));
			double h = Double.parseDouble(JOptionPane.showInputDialog("Digite la altura de su triangulo"));
			JOptionPane.showMessageDialog(null, "El area de su triangulo es es: " + ((b * h) / 2));
		} else if (a == 3) {
			double l = Double.parseDouble(JOptionPane.showInputDialog("Digite el lado de tu cuadrado"));
			JOptionPane.showInternalMessageDialog(null, "El area de su cuadrado es:" + Math.pow(l, 2));
		} else {
			JOptionPane.showMessageDialog(null,"Caracter Incorrecto, Ejecute el programa nuevamente y esta vez indique un caracter correcto");
		}
	}
}
