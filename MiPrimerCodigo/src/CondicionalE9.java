import javax.swing.JOptionPane;

public class CondicionalE9 {

	public static void main(String[] args) {
		int P = Integer.parseInt(
			JOptionPane.showInputDialog("Bienvenido al juego. Ingrese 1 para Piedra, 2 para Papel, 3 para Tijera"));
		int M = (int) (Math.random() * 3+1);
		if(M==1)
		JOptionPane.showMessageDialog(null, "Maquina selecciona Piedra");
		else {
			if (M==2)
				JOptionPane.showMessageDialog(null, "Maquina selecciona Papel");
			else {
				JOptionPane.showMessageDialog(null, "Maquina selecciona Tijeras");
			}
		}
		
		if (P == 1 && M == 1)
			JOptionPane.showMessageDialog(null, "Empate");
		if (P == 2 && M == 2)
			JOptionPane.showMessageDialog(null, "Empate");
		if (P == 3 && M == 3)
			JOptionPane.showMessageDialog(null, "Empate");
		if (P == 1 && M == 2)
			JOptionPane.showMessageDialog(null, "Gana Maquina");
		if (P == 1 && M == 3)
			JOptionPane.showMessageDialog(null, "Gana Jugador");
		if (P == 2 && M == 1) 																// 1 para Piedra, 2 para Papel, 3 para Tijera
			JOptionPane.showMessageDialog(null, "Gana Jugador");
		if (P == 2 && M == 3)
			JOptionPane.showMessageDialog(null, "Gana Maquina");
		if (P == 3 && M == 1)
			JOptionPane.showMessageDialog(null, "Gana Maquina");
		if (P == 3 && M == 2)
			JOptionPane.showMessageDialog(null, "Gana Jugador"); 
	}
}
