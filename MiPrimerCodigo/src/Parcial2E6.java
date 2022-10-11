import java.util.Arrays;

import javax.swing.JOptionPane;

public class Parcial2E6 {

	public static void main(String[] args) {
		int contMaiz = 0;
		int contPapa = 0;
		int contYuca = 0;
		int[] parcelas = new int[20];
		System.out.println(Arrays.toString(parcelas)); // COSECHAR SIEMBRA Y DEJAR PARCELAS LIMPIAS
		System.out.print("[");
		for (int i = 0; i < parcelas.length; i++) {
			parcelas[i] = (int) Math.floor(Math.random() * 3 + 1); // 1 PARA MAIZ, 2 PARA PAPA Y 3 PARA YUCA
			System.out.print(parcelas[i] + ", ");
			if (parcelas[i] == 1) {
				contMaiz++;
			} else {
				if (parcelas[i] == 2) {
					contPapa++;
				} else {
					contYuca++;
				}
			}

		}
		System.out.println("]");
		System.out.println();
		JOptionPane.showMessageDialog(null, "Se sembraron:\n" + contMaiz + " semillas de maiz\n" + contPapa
				+ " semillas de papa\n" + contYuca + " semillas de yuca");
		contMaiz = 0;
		contPapa = 0;
		contYuca = 0;

		int s = Integer.parseInt(
				JOptionPane.showInputDialog("Desea cosechar y volver a sembrar en las parcelas? digite 1 para si"));
		parcelas = new int[20];
		System.out.println(Arrays.toString(parcelas));
		while (s == 1) {

			System.out.print("[");
			for (int j = 0; j < parcelas.length; j++) {
				parcelas[j] = (int) Math.floor(Math.random() * 3 + 1);

				System.out.print(parcelas[j] + ", ");
				if (parcelas[j] == 1) {
					contMaiz++;
				} else {
					if (parcelas[j] == 2) {
						contPapa++;
					} else {
						contYuca++;
					}
				}
			}
			System.out.println("]");
			System.out.println();
			JOptionPane.showMessageDialog(null, "Se sembraron:\n" + contMaiz + " semillas de maiz\n" + contPapa
					+ " semillas de papa\n" + contYuca + " semillas de yuca");
			contMaiz = 0;
			contPapa = 0;
			contYuca = 0;
			parcelas = new int[20];
			System.out.println(Arrays.toString(parcelas));

			s = Integer.parseInt(JOptionPane
					.showInputDialog("Desea cosechar y volver a sembrar en las parcelas? digite 1 para si "));

		}

	}

}
