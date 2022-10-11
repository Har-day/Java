import javax.swing.JOptionPane;

public class TallerQuizFor5 {

	public static void main(String[] args) {
int tp1=0,tp2=0,tp3=0;
		for (int i=1;i<=5;i++) {
			JOptionPane.showMessageDialog(null, "Turno: "+i);
			int p1= Integer.parseInt(JOptionPane.showInputDialog("Jugador 1 Ingrese Cantidad de bolos derribados en el turno"));
			int p2= Integer.parseInt(JOptionPane.showInputDialog("Jugador 2 Ingrese Cantidad de bolos derribados en el turno"));
			int p3= Integer.parseInt(JOptionPane.showInputDialog("Jugador 3 Ingrese Cantidad de bolos derribados en el turno"));
			tp1=tp1+p1;
			tp2=tp2+p2;
			tp3=tp3+p3;
		}
		JOptionPane.showMessageDialog(null, "Despues de 5 turnos la puntuacion queda: \n Jugador 1: "+tp1+" bolos derribados \n Jugador 2: "+tp2+" bolos derribados \n Jugador 3: "+tp3+" bolos derribados");
	}
}
