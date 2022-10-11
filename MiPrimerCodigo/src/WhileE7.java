import javax.swing.JOptionPane;

public class WhileE7 {

	public static void main(String[] args) {
		String c = JOptionPane.showInputDialog("Ingrese la contraseña");
		String c2 = JOptionPane.showInputDialog("Ingrese la contraseña de nuevo");
		while (!c.equals(c2)) {
			JOptionPane.showMessageDialog(null, "Contraseñas no coinciden, vuelva a intentarlo");
			c = JOptionPane.showInputDialog("Ingrese la contraseña");
			c2 = JOptionPane.showInputDialog("Ingrese la contraseña de nuevo");
		}
		;

	}

}
