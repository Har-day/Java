 import javax.swing.JOptionPane;

public class WhileE5 {

	public static void main(String[] args) {
int n= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero entero a calcular el factorial"));
		double a=1;
		double i=1;
		while (n>=i) {
			a=a*i;
			i++;
		}
	System.out.println(a);
	}
}

/*import java.util.Scanner;
public class WhileE5 {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner( System.in );
		double factorial;
		 int num;
		 System.out.print("Introduce un número: ");
		 num=teclado.nextInt();
		 factorial=1; // es importante inicializarlo a 1, ya que multiplicará-
		 // por ejemplo: el factorial de 10 es:
		 // 10*9*8*7*6*5*4*3*2*1
		 for (int i=num;i>0;i--)
		 {
		 factorial=factorial*i;

		 }
		 System.out.println("El factorial de " + num + " es: " + factorial);

	}
*/