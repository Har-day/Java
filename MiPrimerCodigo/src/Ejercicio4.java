import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digita el primer valor"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digita el segundo valor"));
		double N = Double.parseDouble(JOptionPane.showInputDialog("Digita el tercer valor"));
		double M = Double.parseDouble(JOptionPane.showInputDialog("Digita el cuarto valor"));
		
		JOptionPane.showMessageDialog(null, " El valor de x es: " + x + "\n El valor de y es: " + y + "\n El valor de N es: " + N + "\n El valor de M es: " + M);
		
		
	JOptionPane.showMessageDialog(null, "La suma x+y es: "+(x+y)+"\n La resta  x-y es: "+(x-y)+"\n La multiplicacion  x*y es: "+
																	(x*y)+"\n La division x/y es: "+(x/y)+"\n El residuo x%y es: "+(x%y));
	JOptionPane.showMessageDialog(null, "La suma N+M es: "+(N+M)+"\n La resta  N-M es: "+(N-M)+"\n La multiplicacion  N*M es: "+
																	(N*M)+"\n La division N/M es: "+(N/M)+"\n El residuo N%M es: "+(N%M));
	JOptionPane.showMessageDialog(null, "La suma x+N es: "+(x+N)+"\n La division y/M es: "+(y/M)+"\n El residuo y%M es: "+(x%y));
	JOptionPane.showMessageDialog(null, "El doble de x es: "+(x*2)+"\n El doble de y es: "+(y*2)+"\n El doble de N es: "+(N*2)+"\n El doble de M es: "+(M*2));
	JOptionPane.showMessageDialog(null, "La suma x+y+N+M es: "+(x+y+N+M)+"\n La multiplicacion x*y*N*M es: "+(x*y*N*M));
	}

	
}