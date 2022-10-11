import javax.swing.JOptionPane;

public class QuizE2 {

	public static void main(String[] args) {
		String s = JOptionPane
				.showInputDialog("Ingrese 'C' si desea convertir de C->F o 'F' si desea convertir de F->C");

		if (s.equals("c") || s.equals("C")) {
			double Grados = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de grados"));
			double Grados_F = (9 * (Grados / 5) + 32);
			JOptionPane.showMessageDialog(null,
					"La conversion de " + Grados + "°C a grados Fahrenheit es: " + Grados_F);
		} else {
			if (s.equals("f") || s.equals("F")) {
				double Grados = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de grados"));
				double Grados_C = 5 * (Grados - 32) / 9;
				JOptionPane.showMessageDialog(null,
						"La conversion de " + Grados + "F a grados Celsiud es: " + Grados_C);
			} else {
				JOptionPane.showMessageDialog(null,
						"Ejecute el programa de nuevo y esta vez ingrese una opcion valida");
			}
		}

	}
}