import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*JogoCampoMinado jogo = new JogoCampoMinado();
		jogo.jogo();*/
		//ordenaMatriz();
		JogoCampoMinado jogo = new JogoCampoMinado();
		jogo.jogo();
	}

	private static void menoresOuIguaisA5() {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("informe 10 números:");
			
			List<Integer> lista = new ArrayList();
			
			int numeroMenor = 0;
			int numeroMaior = 0;
			int numeroIgual = 0;
			
			for (int index = 0; index < 10; index++) {
				System.out.println("Digite o número " + (index + 1) + ": ");
				lista.add(scan.nextInt());
			}
		
			
			for (Integer numero : lista) {
				if (numero < 5) {
					numeroMenor++;
				} else if (numero > 5) {
					numeroMaior++;
				}
				numeroIgual++;
			}
		
			
			System.out.println("Quantidades de Numeros menores de 5: " + numeroMenor);
			System.out.println("Quantidades de Numeros iguais a 5: " + numeroIgual);
			System.out.println("Quantidades de Numeros maiores de 5: " + numeroMaior);
			
		} finally {
			scan.close();
		}

	}

	private static void parImpar() {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("informe 10 números:");			
			
			List<Integer> lista = new ArrayList();
			
			int par = 0;
			int impar = 0;
			
			for (int index = 0; index < 10; index++) {
				System.out.println("Digite o número " + (index + 1) + ": ");
				lista.add(scan.nextInt());
			}
		
			
			for (Integer numero : lista) {
				if (numero % 2 == 0) {
					par++;
				} else {
					impar++;
				}
			}
		
			
			System.out.println("Quantidades de Numeros Par: " + par);
			System.out.println("Quantidades de Numeros Impar: " + impar);			
		} finally {
			scan.close();
		}
	}

	private static void ordena10() {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("informe 10 números:");			

			List<Integer> lista = new ArrayList();

			for (int index = 0; index < 10; index++) {
				System.out.println("Digite o número " + (index + 1)+ ": ");
				lista.add(scan.nextInt());
			}

			List<Integer> listaOrdenada = orderCrescente(lista);

			for (int i = 0; i < listaOrdenada.size(); i++) {
				System.out.print(listaOrdenada.get(i) + " ");
			}			
		} finally {
			scan.close();
		}
	}

	private static List<Integer> orderDecrescente(List<Integer> lista) {
		/* Collections.sort(lista, Collections.reverseOrder()); */

		int auxiliar = 0;
		for (int i = 0; i < lista.size() - 1; i++) {
			for (int j = 1; j < lista.size() - 1; j++) {
				if (lista.get(j) < lista.get(j + 1)) {
					auxiliar = lista.get(j);
					lista.set(j, lista.get(j + 1));
					lista.set(j + 1, auxiliar);
				}
			}
		}
		return lista;
	}

	private static List<Integer> orderCrescente(List<Integer> lista) {
		/* Collections.sort(lista); */

		int auxiliar = 0;
		for (int i = 0; i < lista.size() - 1; i++) {
			for (int j = 1; j < lista.size() - 1; j++) {
				if (lista.get(j) > lista.get(j + 1)) {
					auxiliar = lista.get(j);
					lista.set(j, lista.get(j + 1));
					lista.set(j + 1, auxiliar);
				}
			}
		}
		return lista;
	}

	private static void parImparPrimo() {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("informe 10 números:");

			List<Integer> lista = new ArrayList();
			int par = 0;
			int impar = 0;
			int primos = 0;

			for (int index = 0; index < 10; index++) {
				System.out.println("Digite o número " + (index + 1)+ ": ");
				lista.add(scan.nextInt());
			}			

			for (Integer numero : lista) {
				if (numero == 1) {
					impar++;
					continue;
				}

				if (numero % 2 == 0) {
					par++;
					continue;
				}

				impar++;

				if (numeroEPrimo(numero)) {
					primos++;
				}
			}
			
			System.out.println("Quantidade de números par: " + par);
			System.out.println("Quantidade de números ímpar: " + impar);
			System.out.println("Quantidade de números ímpar e primos: " + primos);			
		} finally {
			scan.close();
		}
	}

	private static Boolean numeroEPrimo(Integer numero) {
		for (int index = 2; index < numero; index++) {
			if (numero % index == 0) {
				return false;
			}
		}
		return true;
	}

	private static void inverteFrase() {
		Scanner scan = new Scanner(System.in);
		try {
			String frase;

			System.out.print("Digite uma frase: ");

			frase = scan.nextLine();
			String invertida = "";

			/* System.out.println(new StringBuilder(frase).reverse().toString()); */

			for (int index = frase.length() - 1; index >= 0; index--) {
				invertida = invertida + frase.charAt(index);
			}

			System.out.println(invertida);
			
		} finally {
		scan.close();
		}
	}

	private static void contVogalConsoante() {
		Scanner scan = new Scanner(System.in);
		try {
			String frase;

			System.out.print("Digite uma frase: ");
			frase = scan.nextLine();
			
			int vogal = 0;
			int consoante = 0;

			for (int index = frase.length() - 1; index >= 0; index--) {
				
				if ('a' == frase.charAt(index) || 'e' == frase.charAt(index) || 'i' == frase.charAt(index)
						|| 'o' == frase.charAt(index) || 'u' == frase.charAt(index)) {
					vogal++;
					continue;
				}
				consoante++;
			}

			System.out.println("Quantidade de vogal: " + vogal);
			System.out.println("Quantidade de consoante: " + consoante);
		} finally {
			scan.close();
		}
	}

	private static void ordena5() {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("informe 5 números:");

			List<Integer> lista = new ArrayList();

			for (int index = 0; index < 5; index++) {
				System.out.println("Digite o número " + (index + 1)+ ": ");
				lista.add(scan.nextInt());
			}			

			List<Integer> listaOrdenada = orderDecrescente(lista);

			for (int i = listaOrdenada.size() - 1; i >= 0; i--) {
				System.out.print(listaOrdenada.get(i) + " ");
			}			
		} finally {
			scan.close();
		}
	}

	private static void verificaNumero() {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Digite o numero a ser verificado: ");

			int numero = scan.nextInt();
			boolean par = numero % 2 == 0;

			if (!par) {
				if (numero < 10) {
					System.out.println("Numero " + numero + " é impar e menor que 10.");
				} else if (numero > 10) {
					System.out.println("Numero " + numero + " é impar e maior que 10.");
				} else {
					System.out.println("Numero é " + numero + " e é impar.");
				}
			} else {
				if (numero < 10) {
					System.out.println("Numero " + numero + " é par e menor que 10.");
				} else if (numero > 10) {
					System.out.println("Numero " + numero + " é par e maior que 10.");
				} else {
					System.out.println("Numero é " + numero + " e é par.");
				}
			}
		} finally {
			scan.close();
		}
	}

	private static void numeroNaoPrimo() {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("informe 10 números:");

			List<Integer> lista = new ArrayList();
			int naoPrimos = 0;

			for (int index = 0; index < 10; index++) {
				System.out.println("Digite o número " + (index + 1)+ ": ");
				lista.add(scan.nextInt());
			}			

			for (Integer numero : lista) {
				if (numeroEPrimo(numero)) {
					continue;
				}
				naoPrimos++;
			}

			System.out.println("Quantidade de números que não são Primos: " + naoPrimos);
		} finally {
			scan.close();
		}
	}

	private static void ordenaMatriz() {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("informe uma Matriz de 5x5 números:");

			int[][] matriz = new int[5][5];

			for (int index = 0; index < 5; index++) {
				for (int j = 0; j < 5; j++) {
					System.out.println("Digite o número da linha " + (index + 1)+ " e da coluna " + (j + 1) + ": ");
					matriz[index][j] = scan.nextInt();
				}
			}

			List<Integer> lista = new ArrayList();

			for (int index = 0; index < 5; index++) {
				for (int j = 0; j < 5; j++) {
					lista.add(matriz[index][j]);
				}
			}

			int auxiliar = 0;

			for (int i = 0; i < lista.size() - 1; i++) {
				for (int j = 1; j < lista.size() - 1; j++) {
					if (lista.get(j) > lista.get(j + 1)) {
						auxiliar = lista.get(j);
						lista.set(j, lista.get(j + 1));
						lista.set(j + 1, auxiliar);
					}
				}
			}

			List<Integer> listaOrdenada = lista;

			int[][] matrizOrdenada = new int[5][5];

			int count = 0;

			for (int index = 0; index < 5; index++) {
				for (int j = 0; j < 5; j++) {
					matrizOrdenada[index][j] = listaOrdenada.get(count);
					count++;
				}
			}

			System.out.println("Matriz 5x5 ordenada em ordem crescente: ");

			for (int index = 0; index < 5; index++) {
				for (int j = 0; j < 5; j++) {
					System.out.print(matrizOrdenada[index][j]);
				}
				
				System.out.println("");
			}			
		} finally {
			scan.close();
		}	
	}

	private static void hierarquia() {
		Scanner scan = new Scanner(System.in);
		try {
			List<Integer> lista = new ArrayList();

			String letrasOrdenadas = "";

			int a = 0;
			int b = 0;
			int c = 0;

			for (int index = 0; index < 3; index++) {
				System.out.println("Digite o " + (index + 1)+ "º valor: ");
				lista.add(scan.nextInt());
			}

			a = lista.get(0);
			b = lista.get(1);
			c = lista.get(2);

			if (a > b) {
				letrasOrdenadas = letrasOrdenadas + "a >";
				if (b > c) {
					letrasOrdenadas = letrasOrdenadas + " b > c";
				} else if (c > b) {
					letrasOrdenadas = letrasOrdenadas + " c > b";
				}
			} else if (b > c) {
				letrasOrdenadas = letrasOrdenadas + "b >";
				if (a > c) {
					letrasOrdenadas = letrasOrdenadas + " a > c";
				} else if (c > a) {
					letrasOrdenadas = letrasOrdenadas + " c > a";
				}
			} else if (c > a) {
				letrasOrdenadas = letrasOrdenadas + "c >";
				if (a > b) {
					letrasOrdenadas = letrasOrdenadas + " a > b";
				} else if (c > a) {
					letrasOrdenadas = letrasOrdenadas + " b > a";
				}
			}			
			System.out.println("Letras ordenadas do maior para o menor: " + letrasOrdenadas);			
		} finally {
			scan.close();
		}


	}

}
