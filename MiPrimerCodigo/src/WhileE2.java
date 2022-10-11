
public class WhileE2 {

	public static void main(String[] args) {
		int a0 = 2;
		int sum = 0;
		while (a0 <= 100) {
			if (a0 % 2 == 0)
				System.out.print(a0 + "\n");
			sum = sum + a0;
			a0 = a0 + 2;
		}
		System.out.println("Sumatoria de los numeros pares del 2 al 100: " + sum);
	}
}
