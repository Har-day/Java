
public class WhileE11 {

	public static void main(String[] args) {
		int n = 4, j = 1, i = 1;
		while (i <= n) {
			System.out.println();
			while (j <= i) {
				System.out.print(j + " ");
				j++;
			}
			j = 1;
			i++;
		}
		while (i >= 1) {
			System.out.println();
			j = 1;
			while (j < (i - 1)) {
				System.out.print(j + " ");
				j++;
			}
			i--;
		}
	}
}
