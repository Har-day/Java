import javax.swing.JOptionPane;

public class ForE1 {

	public static void main(String[] args) {
		int cn = Integer.parseInt(
				JOptionPane.showInputDialog("Indique cuantos numeros va a ingresar para calcular el promedio")),
				sum = 0;
		for (int c = 1; c <= cn; c++) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
			sum = sum + n;
		}
		JOptionPane.showMessageDialog(null, "El promedio de sus valores es: " + (sum / cn));
	}

}
