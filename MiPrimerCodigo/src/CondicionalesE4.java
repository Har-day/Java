import javax.swing.JOptionPane;

public class CondicionalesE4 {

	public static void main(String[] args) {
		int h = Integer.parseInt(JOptionPane.showInputDialog("Digita cantidad de horas trabajadas"));
		if (h <= 40 && h >= 0)
			JOptionPane.showMessageDialog(null, "El valor de su salario es de $ " + (h * 16));
		else if (h > 40)
			JOptionPane.showMessageDialog(null, "El valor de su salario es de $ " + ((40 * 16) + ((h - 40) * 20)));
		else
			JOptionPane.showMessageDialog(null, "Error digite una cantidad correcta");
	}
}