
public class CondicionalesE8 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * (10 - 0 + 1) + 0);
		if ((a % 2) == 0)
			System.out.println("El Numero aleatorio es: " + a + " y es par");
		else {
			System.out.println("El Numero aleatorio es: " + a + " y es impar");
		}

	}

}
