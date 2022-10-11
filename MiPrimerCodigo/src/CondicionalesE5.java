import javax.swing.JOptionPane;

public class CondicionalesE5 {

	public static void main(String[] args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog("Digite los litros de agua consumidos en el mes"));
		int f = 60;
		int o2 = 30;
		int o3 = 50;
		if (a >= 0 && a <= 50) {
			JOptionPane.showMessageDialog(null, "El costo de su servicio de agua por este mes es de: $" + f);
		} else if (a > 50 && a <= 200) {
			JOptionPane.showMessageDialog(null,"El costo de su servicio de agua por este mes es de: $" + (f + ((a - 50) * o2)));
		} else if (a > 200) {
			JOptionPane.showMessageDialog(null,"El costo de su servicio de agua por este mes es de: $" + (f + (((a - 200) * o3) + (150 * o2))));

		}
		else 
			JOptionPane.showMessageDialog(null, "Digite un valor correcto la proxima vez");
			
	}
}
