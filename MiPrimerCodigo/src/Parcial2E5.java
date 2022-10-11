import javax.swing.JOptionPane;

public class Parcial2E5 {

	public static void main(String[] args) {
		String n = JOptionPane.showInputDialog("Ingrese una palabra");
		JOptionPane.showMessageDialog(null,
				"La palabra " + n + " tiene " + n.length() + " letras, caracteres y/o espacios");
	}
}
