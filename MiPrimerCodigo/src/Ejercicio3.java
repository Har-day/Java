import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = Double.parseDouble(JOptionPane.showInputDialog("Digita tu peso en kilogramos"));	
		double b = Double.parseDouble(JOptionPane.showInputDialog("Digita tu estatura en metros"));	
		JOptionPane.showMessageDialog(null, "Tu indice de masa corporal es: "  + (a/(b*b)));
	}

}
