import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
	double a = Double.parseDouble(JOptionPane.showInputDialog("Digita la velocidad en Km/h"));	
	JOptionPane.showMessageDialog(null, "La velocidad " + a + " Km/h es igual a: " + (a/3.6) + " m/s");
	}
}
