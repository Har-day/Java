package campeonato;

	import java.util.InputMismatchException;
	import java.util.Random;
	import java.util.Scanner;
	

	public class campeonato {
		// VARIABLES DE USO GLOBAL
		static Scanner sn = new Scanner(System.in); // variable para leer por consola
		static int equipo, equipo2; // leer el equipo que se est� administrando
		static int gol1, gol2;

		// CARGAR EQUIPOS
		static String[] nombreEquipos = { "RobinHood F.C", "Carabobo F.C", "Semen Paang F.C", "Huachipato F.C",
				"Abuelos F.C.", "Lim�n F.C." };

		static int[][] numeroDelJugador = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 },
				{ 5, 12, 13, 14, 16, 17, 20, 30, 32, 34, 35, 39, 41, 42, 43, 47, 50 },
				{ 1, 3, 4, 5, 6, 7, 8, 9, 23, 25, 32, 33, 35, 36, 39, 49, 50 },
				{ 2, 6, 9, 11, 17, 22, 23, 25, 26, 27, 28, 29, 35, 38, 42, 47, 48 },
				{ 1, 2, 4, 10, 11, 19, 21, 23, 25, 28, 40, 41, 42, 45, 46, 47, 48 },
				{ 7, 8, 9, 15, 16, 20, 21, 22, 25, 26, 36, 37, 39, 40, 41, 42, 43 } };
		static String[][] nombresJugadores = {
				{ "Jean Flynn", "Ricky Guzman", "Nicole Stewart", "Albert Munoz", "Linda Irwin", "Amanda Larsen",
						"Regina Kim", "Melissa Hall", "Jessica Fernandez", "Heather Harrison", "Omar Delacruz",
						"Brandon Simpson", "Stephanie Donovan", "David Reeves", "Tyler Jackson", "James Schneider",
						"George Terry" },
				{ "John Adams", "Sabrina Wright", "Collin Taylor", "Frank Smith", "Kelli Cantu", "William Williams",
						"Rachel Weaver", "Sheila Garcia", "Shannon Shelton", "Henry Crosby", "Dustin Flores", "Tracy Ray",
						"Chelsea Hernandez", "Kelli Hamilton", "William Griffin", "Kathryn Diaz DDS", "Sarah Barrera" },
				{ "Andrew Harrison", "Bethany Smith", "Denise Gonzales", "Kevin Melton", "Billy Cook", "Rebecca Floyd",
						"Sarah Johnson", "Alvin White", "Tony Gray", "Deborah Andrade", "Jeremy Reynolds",
						"Miss Lisa Wilson", "Ross Jackson", "Nicole Weber", "Michael Jackson", "Christina Garcia",
						"Katelyn Young" },
				{ "Cesar Hanson", "Melissa Webster", "Douglas Freeman", "Lisa Butler", "Jennifer Roberson",
						"Kevin Harrison", "Michael Cline", "Mark Matthews", "Mark Lin", "Megan Gardner", "Danielle Reed MD",
						"Robert Daniel", "Jessica Johnson", "Catherine Chaney", "Jacqueline Giles", "Michael Phillips",
						"Frank Grant" },
				{ "Bianca Garcia", "Thomas Santos", "John Murphy", "Kurt Dunn", "David Frank", "Shelly Johnson",
						"Derrick Snyder", "Susan Higgins", "Ronald Zavala", "Karen Barrett", "Jennifer Williams",
						"Logan Walton", "Julie Bass", "Debra Anderson", "Brian Bond", "Kelli Evans", "Russell Johnson" },
				{ "Michael Powell", "Michael Davis", "Craig Fisher", "Angela Powers", "Matthew Henry", "Joshua Kaiser",
						"Christopher Barnes", "Steven Garrett PhD", "Tyler Brown", "David Oliver", "Curtis Shepherd",
						"Harry Frost", "Priscilla Jackson", "Gail Sanchez", "Joan Pruitt", "Curtis Lane", "Alec Allen" } };

		static String[][] posicionesJugadores = {
				{ "Volante lateral", "Delantero Punta", "Interior Izquierdo", "Portero Ppal", "Interior Derecho",
						"Portero Suplente", "Volante central", "Mediocentro", "Media punta", "Defensa Central",
						"Defensa Lateral", "Delantero General", "Delantero Extremo", "Volante creativo",
						"Mediocentro defensivo", "Centrocampista", "Delantero Centro" },
				{ "Delantero General", "Delantero Centro", "Centrocampista", "Delantero Extremo", "Portero Suplente",
						"Volante central", "Mediocentro", "Volante creativo", "Portero Ppal", "Media punta",
						"Interior Derecho", "Defensa Central", "Defensa Lateral", "Mediocentro defensivo",
						"Volante lateral", "Interior Izquierdo", "Delantero Punta" },
				{ "Defensa Central", "Interior Derecho", "Delantero Punta", "Delantero Extremo", "Portero Suplente",
						"Defensa Lateral", "Volante lateral", "Volante central", "Mediocentro defensivo", "Centrocampista",
						"Delantero Centro", "Mediocentro", "Delantero General", "Media punta", "Volante creativo",
						"Interior Izquierdo", "Portero Ppal" },
				{ "Centrocampista", "Mediocentro", "Volante central", "Defensa Lateral", "Defensa Central",
						"Delantero General", "Delantero Centro", "Volante creativo", "Interior Izquierdo",
						"Interior Derecho", "Delantero Punta", "Delantero Extremo", "Portero Suplente", "Media punta",
						"Portero Ppal", "Mediocentro defensivo", "Volante lateral" },
				{ "Delantero Centro", "Delantero Extremo", "Interior Izquierdo", "Portero Ppal", "Media punta",
						"Interior Derecho", "Portero Suplente", "Volante lateral", "Volante central", "Centrocampista",
						"Delantero General", "Defensa Lateral", "Delantero Punta", "Mediocentro defensivo",
						"Defensa Central", "Mediocentro", "Volante creativo" },
				{ "Defensa Lateral", "Delantero General", "Mediocentro", "Media punta", "Defensa Central",
						"Volante central", "Delantero Centro", "Centrocampista", "Portero Ppal", "Portero Suplente",
						"Volante creativo", "Volante lateral", "Mediocentro defensivo", "Interior Derecho",
						"Interior Izquierdo", "Delantero Punta", "Delantero Extremo" } };

		static String[][] estadoJugadores = {
				{ "Principal", "Principal", "Principal", "Principal", "Principal", "Principal", "Principal", "Principal",
						"Principal", "Principal", "Principal", "Suplente", "Suplente", "Suplente", "Suplente", "Suplente",
						"Suplente" },
				{ "Principal", "Principal", "Principal", "Principal", "Principal", "Principal", "Principal", "Principal",
						"Principal", "Principal", "Principal", "Suplente", "Suplente", "Suplente", "Suplente", "Suplente",
						"Suplente" },
				{ "Principal", "Principal", "Principal", "Principal", "Principal", "Principal", "Principal", "Principal",
						"Principal", "Principal", "Principal", "Suplente", "Suplente", "Suplente", "Suplente", "Suplente",
						"Suplente" },
				{ "Principal", "Principal", "Principal", "Principal", "Principal", "Principal", "Principal", "Principal",
						"Principal", "Principal", "Principal", "Suplente", "Suplente", "Suplente", "Suplente", "Suplente",
						"Suplente" },
				{ "Principal", "Principal", "Principal", "Principal", "Principal", "Principal", "Principal", "Principal",
						"Principal", "Principal", "Principal", "Suplente", "Suplente", "Suplente", "Suplente", "Suplente",
						"Suplente" },
				{ "Principal", "Principal", "Principal", "Principal", "Principal", "Principal", "Principal", "Principal",
						"Principal", "Principal", "Principal", "Suplente", "Suplente", "Suplente", "Suplente", "Suplente",
						"Suplente" } };

		static int camisetasCapitanes[] = { 999, 999, 999, 999, 999, 999 };

		static int tablaPosiciones[][] = new int[6][7]; // El consecutivo de las columnas es para almacenar los valores de
														// partidos jugados, ganados, empatados, perdidos, goles a favor,
														// goles en contra, y puntos

		static int resultados[][] = new int[6][6];

		// INICIO DE FUNCIONES O PROCEDIMIENTOS

		static public void pressAnyKeyToContinue() {

			Scanner teclado = new Scanner(System.in);
			System.out.println("Presione ENTER para continuar...");
			try {
				teclado.nextLine();
			} catch (Exception e) {
			}
		}

		public static void mostrarVectores(String vectorString1[]) {
			for (int i = 0; i < vectorString1.length; i++) {
				System.out.print(i + ":" + vectorString1[i] + ", ");
			}
			System.out.println(" ");
		}

		public static void mostrarEquipo(int equipo) {
			System.out.println("   Nombre Jugador    Numero Camiseta        Posici�n     Estado ");
			String capitan;

			for (int i = 0; i < nombresJugadores[equipo].length; i++) {
				if (camisetasCapitanes[equipo] == numeroDelJugador[equipo][i])
					capitan = "CAPITAN";
				else
					capitan = "";
				System.out.printf("%20s %12d %20s %10s %10s\n", nombresJugadores[equipo][i], numeroDelJugador[equipo][i],
						posicionesJugadores[equipo][i], estadoJugadores[equipo][i], capitan);
			}
		}

		public static int encontrarJugadorXnumero(int equipo, int numero) {
			int encontrado = -1;
			for (int i = 0; i < numeroDelJugador[equipo].length; i++) {
				if (numeroDelJugador[equipo][i] == numero) {
					encontrado = i;
				}
			}
			return encontrado;
		}

		public static boolean eliminarJugador(int equipo, int numero) {
			boolean resultado = false;
			int indice;
			indice = encontrarJugadorXnumero(equipo, numero);
			if (indice != -1) {
				resultado = true;
				nombresJugadores[equipo][indice] = "*************";
				numeroDelJugador[equipo][indice] = 999;
				posicionesJugadores[equipo][indice] = "***********";
				estadoJugadores[equipo][indice] = "***********";
			}
			;
			return resultado;
		}

		public static void mostrarTablaPosiciones() {

			// SECCION PARA ORDENAR LA TABLA DE POSICIONES
			int[][] tablaOrdenada = new int[6][7];
			String[] nombresOrdenados = new String[6];
			int temp;
			String tempS;
			tablaOrdenada = tablaPosiciones;
			nombresOrdenados = nombreEquipos;
			for (int i = 0; i < tablaOrdenada.length; i++) {
				for (int j = i + 1; j < tablaOrdenada.length; j++) {
					if (tablaOrdenada[j][6] > tablaOrdenada[i][6]) {
						for (int k = 0; k < tablaOrdenada[i].length; k++) {

							temp = tablaOrdenada[i][k]; // seccion para intercambiar la tabla de posiciones
							tablaOrdenada[i][k] = tablaOrdenada[j][k];
							tablaOrdenada[j][k] = temp;

							tempS = nombresOrdenados[i]; // seccion para intercambiar los nombres de equipos
							nombresOrdenados[i] = nombresOrdenados[j];
							nombresOrdenados[j] = tempS;

						}
					}
				}
			}

			// SECCION PARA IMPRIMIR
			System.out.println(
					"|        Equipo       | Jugados | Ganados | Empatados | Perdidos | GolesAfavor | GolesEnContra | Puntos |");
			System.out.println(
					"|---------------------|---------|---------|-----------|----------|-------------|---------------|--------|");
			for (int i = 0; i < tablaOrdenada.length; i++) {
				System.out.printf("|%21s| %7d | %7d | %9d | %8d |%12d | %13d | %6d |\n", nombresOrdenados[i],
						tablaOrdenada[i][0], tablaOrdenada[i][1], tablaOrdenada[i][2], tablaOrdenada[i][3],
						tablaOrdenada[i][4], tablaOrdenada[i][5], tablaOrdenada[i][6]);
			}
			System.out.println(
					"|---------------------|---------|---------|-----------|----------|-------------|---------------|--------|");
		}

		public static void mostrarResultados() {
			System.out.println("RESULTADOS:");
			for (int i = 0; i < resultados.length - 1; i++) {
				for (int j = i + 1; j < resultados.length; j++) {
					if (i != j) {
						if (resultados[i][j] != -1) {
							System.out.printf("\t%20s:%2d - %2d:%20s\n", nombreEquipos[i], resultados[i][j],
									resultados[j][i], nombreEquipos[j]);
						} else {
							System.out.printf("\t%20s SIN JUGAR CONTRA %20s\n", nombreEquipos[i], nombreEquipos[j]);
						}
					}
				}
			}

		}

		public static void iniciarJuego() {
			for (int i = 0; i < resultados.length; i++) {
				for (int j = 0; j < resultados.length; j++) {
					resultados[i][j] = -1; // -1 significa que no han jugado el equipo i con el equipo j
				}
				for (int j = 0; j < tablaPosiciones[0].length; j++) {
					tablaPosiciones[i][j] = 0;
				}
			}
		}

		public static void actualizarTablaResultados(int equipo1, int equipo2, int GolesEquipo1, int GolesEquipo2) {
			if (equipo1 == equipo2) {
				System.out.println("ERROR, los equipos deben ser diferentes!!!");
			} else {
				resultados[equipo1][equipo2] = GolesEquipo1;
				resultados[equipo2][equipo1] = GolesEquipo2;

				tablaPosiciones[equipo1][0]++;
				tablaPosiciones[equipo2][0]++;
				tablaPosiciones[equipo1][4] += GolesEquipo1;
				tablaPosiciones[equipo2][4] += GolesEquipo2;
				tablaPosiciones[equipo1][5] += GolesEquipo2;
				tablaPosiciones[equipo2][5] += GolesEquipo1;

				if (GolesEquipo1 == GolesEquipo2) {
					tablaPosiciones[equipo1][2]++;
					tablaPosiciones[equipo2][2]++;
					tablaPosiciones[equipo1][6] += 1;
					tablaPosiciones[equipo2][6] += 1;
				} else if (GolesEquipo1 > GolesEquipo2) {
					tablaPosiciones[equipo1][1]++;
					tablaPosiciones[equipo2][3]++;
					tablaPosiciones[equipo1][6] += 3;
				} else {
					tablaPosiciones[equipo1][3]++;
					tablaPosiciones[equipo2][1]++;
					tablaPosiciones[equipo2][6] += 3;
				}
			}
		}

		// PROGRAMA PRINCIPAL

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			iniciarJuego();
			boolean salir = false;
			int opcion; // Guardaremos la opcion del usuario

			while (!salir) {
				System.out.println("  ***  MENU PRINCIPAL  ***");
				System.out.println("1. Administrar un equipo");
				System.out.println("2. Mostrar tabla de posiciones");
				System.out.println("3. Mostrar listado de resultados de la jornada");
				System.out.println("4. Iniciar Juego");
				System.out.println("5. Ingresar un resultado y marcador final");
				System.out.println("6. Simular campeonato");
				System.out.println("7. Salir");

				System.out.println("Escribe una de las opciones: _");
				opcion = sn.nextInt();

				switch (opcion) {
				case 1:
					boolean salir2 = false;
					int opcion2;
					System.out.println("Estos son los equipos disponibles:");
					mostrarVectores(nombreEquipos);
					System.out.print("Ingrese el n�mero del equipo que desea administrar: _");
					equipo = sn.nextInt();
					while (!salir2) {

						System.out.println("\n- MENU ADMINISTRAR EL EQUIPO: " + nombreEquipos[equipo] + " -");
						System.out.println("1. Ver jugadores y sus posiciones");
						System.out.println("2. Cambiar posici�n de un jugador");
						System.out.println("3. Eliminar un Jugador");
						System.out.println("4. Ingresar un nuevo jugador");
						System.out.println("5. Sustituir jugadores");
						System.out.println("6. Elegir un capit�n");
						System.out.println("7. Cambiar estado");
						System.out.println("8. Volver al menu anterior");
						System.out.println("Escribe una de las opciones: _");
						opcion2 = sn.nextInt();

						int indice, Njugador;
						int Njugador2, indice2;
						switch (opcion2) {
						case 1:
							mostrarEquipo(equipo);
							pressAnyKeyToContinue();
							break;
						case 2:
							System.out.print("Indique el n�mero de camiseta del jugador que desea cambiar");
							Njugador = sn.nextInt();
							indice = encontrarJugadorXnumero(equipo, Njugador);
							sn.nextLine();
							if (indice != -1) {
								System.out.println("La posici�n actual del jugador " + Njugador + " "
										+ nombresJugadores[equipo][indice] + " es " + posicionesJugadores[equipo][indice]);
								System.out.println("Escriba la nueva camiseta del jugador: ");
								posicionesJugadores[equipo][indice] = sn.nextLine();
								System.out.println("                 Cambio realizado!!!");
							} else {
								System.out.println("El equipo " + nombreEquipos[equipo]
										+ " no tiene un jugador con el n�mero " + Njugador);
							}
							pressAnyKeyToContinue();
							break;
						case 3:
							System.out.print("Indique el n�mero de casmiseta del jugador que desea eliminar");
							Njugador = sn.nextInt();
							if (eliminarJugador(equipo, Njugador)) {
								System.out.println("Eliminaci�n culminada!!!");
							} else {
								System.out.println("N�mero de jugador no existe");
							}
							pressAnyKeyToContinue();
							break;
						case 4:
							indice = encontrarJugadorXnumero(equipo, 999);
							if (indice != -1) {
								System.out.print("N�mero de camiseta del jugador: ");
								Njugador = sn.nextInt();
								if (encontrarJugadorXnumero(equipo, Njugador) == -1) {
									sn.nextLine();
									numeroDelJugador[equipo][indice] = Njugador;
									System.out.println("Nombre del Jugador: ");
									nombresJugadores[equipo][indice] = sn.nextLine();
									System.out.println("Posici�n del Jugador: ");
									posicionesJugadores[equipo][indice] = sn.nextLine();
									System.out.println("Estado del Jugador: ");
									estadoJugadores[equipo][indice] = sn.nextLine();
									System.out.println("Ingreso Exitoso....");
								} else {
									System.out.println("Ya existe un jugador con este n�mero en su camiseta!!!");
								}
							} else {
								System.out.println(
										"La plantilla de Jugadores est� Llena, debe eliminar un jugador para poder ingresar un nuevo!!!");
							}
							pressAnyKeyToContinue();
							break;
						case 5:
							System.out.println("Indique el n�mero de camiseta del Jugador a sustituir: ");
							Njugador = sn.nextInt();
							indice = encontrarJugadorXnumero(equipo, Njugador);
							if (indice != -1) {
								System.out.println("Indique el n�mero de camiseta del Jugador que ingresa: ");
								Njugador2 = sn.nextInt();
								indice2 = encontrarJugadorXnumero(equipo, Njugador2);
								if (indice2 != -1) {
									System.out.println("El estado Actual del jugador " + Njugador + " es "
											+ estadoJugadores[equipo][indice] + " y del jugador " + Njugador2 + " es "
											+ estadoJugadores[equipo][indice2]);
									if (estadoJugadores[equipo][indice] == "Principal"
											&& estadoJugadores[equipo][indice2] == "Suplente") {
										estadoJugadores[equipo][indice] = "Suplente";
										estadoJugadores[equipo][indice2] = "Principal";
										System.out.println("Sustituci�n Exitosa!!!");
										System.out.println("Los jugadores tienen como estado -> " + Njugador
												+ ":Suplente      " + Njugador2 + ":Principal");
									} else {
										System.out.println(
												"El estado de los jugadores no es compatible para realizar la sustituci�n de jugadores!!!");
									}
								}
							} else {
								System.out.println("No existe un jugador con el n�mero de camiseta ingresado!!!");
							}
							pressAnyKeyToContinue();
							break;
						case 6:
							System.out.println("Indique el número de camiseta del Jugador que ser� CAPITAN: ");
							Njugador = sn.nextInt();
							indice = encontrarJugadorXnumero(equipo, Njugador);
							if (indice != -1) {
								camisetasCapitanes[equipo] = Njugador;
								System.out.println("Asignaci�n de Capitan Exitosa....!");
							} else {
								System.out.println("El equipo " + nombreEquipos[equipo]
										+ " no tiene un jugador con el n�mero de camiseta " + Njugador);
							}
							pressAnyKeyToContinue();
							break;
						case 7:
							System.out.print("Indique el número de camiseta del jugador que desea cambiar su estado");
							Njugador = sn.nextInt();
							indice = encontrarJugadorXnumero(equipo, Njugador);
							sn.nextLine();
							if (indice != -1) {
								System.out.println("El estado actual del jugador " + Njugador + " "
										+ nombresJugadores[equipo][indice] + " es " + estadoJugadores[equipo][indice]);
								System.out.println("Escriba el nuevo estado del jugador (Principal, Suplente, otro): ");
								estadoJugadores[equipo][indice] = sn.nextLine();
								System.out.println("                 Cambio de estado Exitoso!!!");
							} else {
								System.out.println("El equipo " + nombreEquipos[equipo]
										+ " no tiene un jugador con el n�mero " + Njugador);
							}
							pressAnyKeyToContinue();
							break;
						case 8:
							salir2 = true;
							break;
						default:
							System.out.println("Solo numeros entre 1 y 8");
						}
					}
					break;
				case 2:
					mostrarTablaPosiciones();
					pressAnyKeyToContinue();
					break;
				case 3:
					mostrarResultados();
					pressAnyKeyToContinue();
					break;
				case 4:
					iniciarJuego();
					System.out.println("Tablas de posiciones y resultados inicializadas en cero!!!");
					pressAnyKeyToContinue();
					break;
				case 5:

					mostrarVectores(nombreEquipos);
					System.out.println("Ingrese el n�mero del primer equipo del partido: ");
					equipo = sn.nextInt();
					System.out.println("Ingrese el n�mero del segundo equipo del partido: ");
					equipo2 = sn.nextInt();
					if (equipo * equipo2 > -1 && equipo * equipo2 < 26) {
						System.out.printf("Ingrese los goles anotados por el equipo %2d:%20s: _", equipo,
								nombreEquipos[equipo]);
						gol1 = sn.nextInt();
						System.out.printf("Ingrese los goles anotados por el equipo %2d:%20s: _", equipo2,
								nombreEquipos[equipo2]);
						gol2 = sn.nextInt();
						actualizarTablaResultados(equipo, equipo2, gol1, gol2);
					} else {
						System.out
								.println("Los n�meros de los equipos son Iguales, No se puede actualizar este marcador...");
					}

					pressAnyKeyToContinue();
					break;
				case 6:
					Random r = new Random();
					for (int i = 0; i < resultados.length - 1; i++) {
						for (int j = i + 1; j < resultados.length; j++) {
							gol1 = r.nextInt(6);
							gol2 = r.nextInt(6);
							actualizarTablaResultados(i, j, gol1, gol2);
							System.out.println("Generaci�n Exitosa de la Simulaci�n ...");
						}
					}
					pressAnyKeyToContinue();
					break;
				case 7:
					salir = true;
					System.out.println("Hasta pronto!!!");
					break;
				default:
					System.out.println("Solo n�meros entre 1 y 7");
				}

			}

		}

	}



