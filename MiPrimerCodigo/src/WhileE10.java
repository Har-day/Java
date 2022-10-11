import javax.swing.JOptionPane;

public class WhileE10 {
	public static void main(String[] args) {
		int i = 1, j = 1,n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		while (i <= n) {
			while (j <= i) {
				System.out.print(i);
				j++;
			}
			i++;
			j = 1;
			System.out.println("");
		}
	}
}
