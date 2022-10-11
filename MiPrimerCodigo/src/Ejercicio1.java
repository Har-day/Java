import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	int a = Integer.parseInt(JOptionPane.showInputDialog("Digita los grados que quieras convertir a radianes"));	
	double b = ((a*3.1416)/180);
	JOptionPane.showMessageDialog(null, "El valor de " + a + "Grados en Radianes es de: " + b);
	}

}
