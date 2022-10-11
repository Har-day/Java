import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double iva = 0.21 ;
		double a = Double.parseDouble(JOptionPane.showInputDialog("Digita el valor del producto"));	
		double b = (a*iva)+a;
		JOptionPane.showMessageDialog(null, "El valor del producto incluyendo el iva es " + b);
		}

	}

