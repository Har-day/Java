
public class Parcial2E4 {

	public static void main(String[] args) {
		String[] strArr = new String[11];
		String separador = "";
		for (int i = 0; i <= strArr.length; i += 2) {
			System.out.print(separador + strArr[i]);
			separador = " , ";
		}
	}
}
