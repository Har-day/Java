import javax.swing.JOptionPane;

public class Parcial2E3 {

	public static void main(String[] args) {

		int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

		System.out.println("Sus numeros son: ");

		for (int i = 0; i <= num; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}

	}
}