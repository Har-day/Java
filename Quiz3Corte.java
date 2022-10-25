import javax.swing.JOptionPane;

public class Quiz3Corte {

	public static void main(String[] args) {
		int a=0;
		int s =Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1,2,3,4 segun lo requiera:\n1. Ver numero mayor\n2. Ver numero menor\n3. Calcular la raiz cuadrada\n4. Elevar a una potencia"));
switch (s) {
	case 1:{
	int n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
	int n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
	NumeroMayor(n1,n2);
	JOptionPane.showMessageDialog(null, "El numero mayor es: "+NumeroMayor(n1,n2));
	}

	case 2:{
		int n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
		int n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
		NumeroMenor(n1,n2);
		JOptionPane.showMessageDialog(null, "El numero menor es: "+NumeroMenor(n1,n2));
	}
	case 3:{
		int n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el  numero"));
		RaizCuadrada(n1);
		JOptionPane.showMessageDialog(null, "La raiz cuadrada del numero "+n1+" es: "+RaizCuadrada(n1));
	}

	case 4:{
		int n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a elevar"));
		int n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la potencia del numero"));
		Potencia( n1,  n2);
		JOptionPane.showMessageDialog(null, "La respuesta es "+Potencia(n1,n2));

	}
}

	}

	private static int NumeroMayor(int n1, int n2) {
if (n1>n2) {
	return n1;
}else {
return n2;
}
	}
	private static int NumeroMenor(int n1, int n2) {
if (n1<n2) {
	return n1;
}else {
return n2;
}
	}
	private static double RaizCuadrada(int n1) {
		return Math.sqrt(n1);		
	}
	private static double Potencia(int n1, int n2) {
		return Math.pow(n1, n2);		
	}
}
