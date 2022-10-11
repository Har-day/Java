import javax.swing.JOptionPane;

public class WhileE1 {

	public static void main(String[] args) {
double n= Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuantos numeros va a digitar para calcular el promedio"));
double cn=n;
double c=0;
while (n>0) {
	double v= Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor"));
	c=c+v;
	n--;
}
 	System.out.print(c);
	JOptionPane.showMessageDialog(null, "El promedio es: "+(c/cn));	
	}
}
