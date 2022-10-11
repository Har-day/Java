import java.util.Scanner;

import javax.swing.JOptionPane;

public class swEjer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Se le hara  un cuestionario breve, responda 'si' o 'no'");
		
		System.out.println("Eres obediente ");		
		String c = sc.nextLine();			
		if (c.equals("si") ) {
			System.out.println("Tiene hambre");
			String b = sc.nextLine();
			if (b.equals("si")) {
				System.out.println("Tiene ropa");
				String v = sc.nextLine();
				if (v.equals("si")) {
					System.out.println("Tiene boca");
					String p = sc.nextLine();
					if (p.equals("si")) {
						System.out.println("Le gusta alguien");
						String l = sc.nextLine();
					} else {
						System.out.println("Gracias por ser parte de este formulario|");
					}
				} else {
					System.out.println("No se puede seguir con el formulario");
				}
			} else {
				System.out.println("No se puede seguir con el formulario");
			}
		} else {
			System.out.println("No se puede seguir con el formulario");
		}

	}
}
