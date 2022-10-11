import javax.swing.JOptionPane;

public class QuizE1 {

	public static void main(String[] args) {
		String respuesta = JOptionPane.showInputDialog("Es ustes estudiantes?");
		if (respuesta.equals("s") || respuesta.equals("si") || respuesta.equals("S") || respuesta.equals("SI")
				|| respuesta.equals("Si")) {
			boolean respuesta1 = true;
			JOptionPane.showMessageDialog(null, respuesta1);
		} else {
			if (respuesta.equals("n") || respuesta.equals("no") || respuesta.equals("N") || respuesta.equals("NO")
					|| respuesta.equals("No")) {
				boolean respuesta1 = false;
				JOptionPane.showMessageDialog(null, respuesta1);
			} else {
				JOptionPane.showMessageDialog(null, "Vuelva a intentarlo");
			}

		}
	}

}