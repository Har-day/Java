import javax.swing.JOptionPane;

public class WhileE9 {

	public static void main(String[] args) {
		double T0 = 20;
		double T = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura a alcanzar \n"));
		double t = ((T - T0) * 60) / 2;
		JOptionPane.showMessageDialog(null,
				"Para alcanzar la temperatura de " + T + " se necesitan de: " + t/3600 + " Minutos \n");
		int s = Integer.parseInt(JOptionPane.showInputDialog("¿Desea ingresar otra temperatura? 1. Si"));
		while (s == 1) {
			T = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura a alcanzar \n"));
			t = ((T - T0) * 60) / 2;
			JOptionPane.showMessageDialog(null,
					"Para alcanzar la temperatura de " + T + " se necesitan de: " + t/3600 + " Minutos \n");
		}
	}
}
