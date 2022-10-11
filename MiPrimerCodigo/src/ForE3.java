
public class ForE3 {

	public static void main(String[] args) {
		int sum = 0, cc=0;
		for (int c = 2; c <= 100; c = c + 2) {
			sum = sum + c;
			cc++;
		}
System.out.println("La sumatoria de los numeros pares del 1-100 es: "+sum+ " y el la sumatoria de: "+cc+" numeros.");
	}

}