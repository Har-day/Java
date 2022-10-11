import java.util.Scanner;

public class ArraysE5 {

	public static void main(String[] args) {

		String[] Productos = { "Gomas", "Mentas", "Piruleta", "Bombom" };
		int[] Precio = { 1, 2, 3, 4 };
		int Ingresos = 0;
		Scanner sc = new Scanner(System.in);
	

		System.out.println(
				"Ingrese un numero: \n 1. Mostrar productos y precios \n 2. Vender Producto \n 3. Mostrar total de ingresos \n 4. Cambiar precio \n 5. Salir");
		int seleccion = sc.nextInt();
		while (seleccion != 5) {

			switch (seleccion) {

			case 1: {

				System.out.println("Usted eligió la opcion 1.");
				for (int i = 0; i < Productos.length; i++) {
					System.out.println(Productos[i] + " $" + Precio[i]);
				}
				break;

			}

			case 2: {

				System.out.println("Usted eligió la opcion 2.");
				System.out.println("Ingrese el numero del producto que va a vender \n 1." + Productos[0] + "\n 2."
						+ Productos[1] + "\n 3." + Productos[2] + "\n 4." + Productos[3]);
				seleccion = sc.nextInt();
				switch (seleccion) {

				case 1: {
					System.out.println("Ingrese cantidad de unidades");
					int u = sc.nextInt();
					int totalventa = u * Precio[0];
					Ingresos = Ingresos + totalventa;
					System.out.println("Total venta: $" + totalventa);
					break;
				}
				case 2: {
					System.out.println("Ingrese cantidad de unidades");
					int u = sc.nextInt();
					int totalventa = u * Precio[1];
					Ingresos = Ingresos + totalventa;
					System.out.println("Total venta: $" + totalventa);
					break;
				}
				case 3: {
					System.out.println("Ingrese cantidad de unidades");
					int u = sc.nextInt();
					int totalventa = u * Precio[2];
					Ingresos = Ingresos + totalventa;
					System.out.println("Total venta: $" + totalventa);
					break;
				}
				case 4: {
					System.out.println("Ingrese cantidad de unidades");
					int u = sc.nextInt();
					int totalventa = u * Precio[3];
					Ingresos = Ingresos + totalventa;
					System.out.println("Total venta: $" + totalventa);
					break;
				}
				}

				break;

			}

			case 3: {

				System.out.println("Usted eligió la opcion 3.");
				System.out.println("Total Ingresos: $" + Ingresos);
				break;

			}
			case 4: {

				System.out.println("Usted eligió la opcion 4.");

				System.out.println("Ingrese el numero del producto que va a cambiar su precio \n 1." + Productos[0]
						+ "\n 2." + Productos[1] + "\n 3." + Productos[2] + "\n 4." + Productos[3]);
				seleccion = sc.nextInt();

				switch (seleccion) {

				case 1: {
					System.out.println("Ingrese el nuevo precio");
					int NuevoPrecio = sc.nextInt();
					Precio[0] = NuevoPrecio;
					break;
				}
				case 2: {
					System.out.println("Ingrese el nuevo precio");
					int NuevoPrecio = sc.nextInt();
					Precio[1] = NuevoPrecio;
					break;
				}
				case 3: {
					System.out.println("Ingrese el nuevo precio");
					int NuevoPrecio = sc.nextInt();
					Precio[2] = NuevoPrecio;
					break;
				}
				case 4: {
					System.out.println("Ingrese el nuevo precio");
					int NuevoPrecio = sc.nextInt();
					Precio[3] = NuevoPrecio;
					break;
				}
				}

				break;

			}

			default: {

				System.out.println("Opcion incorrecta");

			}

			}
			System.out.println(
					"\n Ingrese un numero: \n 1. Mostrar productos y precios \n 2. Vender Producto \n 3. Mostrar total de ingresos \n 4. Cambiar precio \n 5. Salir");
			seleccion = sc.nextInt();
		}
	}

}