import javax.swing.JOptionPane;

public class WhileE8 {

	public static void main(String[] args) {
		int B = 400, nA, nM, A = 12;
		double pB = 96;
		double Im1 = B * pB;
		int InA = 1;
		int m = 1;
		double sum = 0;
		nA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de años"));
		nM = nA * A;
		while (m <= nM) {
			sum = sum + (((m - 1) * 400 * 0.5) + Im1);
			System.out.println("El ingreso del mes " + m + " es de: " + (((m - 1) * 400 * 0.5) + Im1) + "$");
			m++;
		}
		InA = (int) sum;
		JOptionPane.showMessageDialog(null, "El ingreso en " + nA + " años es de: " + InA + "$");
	}
}
