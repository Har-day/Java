
import javax.swing.JOptionPane;

public class CondicionalesE10 {
	public static void main(String[] args) {
		double p = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso en kilogramos"));
		double gM = 3.7,  gV = 8.87,  gMa = 3.7, gJ = 24.79, gS = 10.44, gU = 8.87, gN = 11.15,gT=9.8;
		double m = (p / gT);
		int s= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del planeta en el cual calcularemos su nuevo peso"+"\n 1.Mercurio"+"\n 2.Venus"+"\n 3.Marte"+"\n 4.Jupiter"+"\n 5.Saturno"+"\n 6.Urano"+"\n 7.Neptuno"));
		if (s==1) {
			JOptionPane.showMessageDialog(null,
					"El peso en Mercurio es: " + (m * gM));
		}
		if (s==2) {
			JOptionPane.showMessageDialog(null,
					"El peso en Venus es: " + (m * gV));
		}		
		if (s==3) {
			JOptionPane.showMessageDialog(null,
					"El peso en Marte es: " + (m * gMa));
		}
		if (s==4) {
			JOptionPane.showMessageDialog(null,
					"El peso en Jupiter es: " + (m * gJ));
		}
		if (s==5) {
			JOptionPane.showMessageDialog(null,
					"El peso en Saturno es: " + (m * gS));
		}
		if (s==6) {
			JOptionPane.showMessageDialog(null,
					"El peso en Urano es: " + (m * gU));
		}
		if (s==7) {
			JOptionPane.showMessageDialog(null,
					"El peso en Neptuno es: " + (m * gN));
		}
		else {JOptionPane.showMessageDialog(null, "Ingrese una opcion valida de la lista");}

	}
}