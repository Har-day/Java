

import java.util.Scanner;

public class ForE4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Ingrese dos numeros: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if( num1 > num2) {
			for(int i = num1; i >= num2; i--) {
				sum = sum + i;				
			}
			System.out.println(sum);

		} else if(num1 < num2) {
			for(int i = num2; i >= num1; i--) {
				sum = sum + i;				
			}
			System.out.println(sum);

		} else {
			System.out.println("Ingrese un numero valido positivo y entero)");
		}


	}

}
