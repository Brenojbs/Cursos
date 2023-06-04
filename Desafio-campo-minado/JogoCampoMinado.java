import java.util.Random;
import java.util.Scanner;

public class JogoCampoMinado {
	public void jogo() {
        Random random = new Random();

        int[][] matrizInicial = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        boolean[][] bombas = new boolean[5][5];

        char[][] matrizDeJogadas = new char[5][5];

        for (int index = 0; index < 5; index++) {
            for (int j = 0; j < 5; j++) {
            	matrizDeJogadas[index][j] = '?';
            };
        };

        boolean perdeu = true;

        for (int index = 0; index < 5; index++) {
        	int bombaLinha = random.nextInt(5);
        	int bombaColuna = random.nextInt(5);
        	if(!bombas[bombaLinha][bombaColuna]) {
        		bombas[bombaLinha][bombaColuna] = true;
        	}
        };

        // Seta as dicas na Matriz
        for (int linha = 0; linha < 5; linha++) {
        	for (int coluna = 0; coluna < 5; coluna++) {
        		if (bombas[linha][coluna]) {
        			for (int i = - 1; i < 2; i++) {
        				for (int j = -1; j < 2; j++) {
                            if (!(i == 0 && j == 0)) {
                            	if (linha + i >= 0 && linha + i < 5 && coluna + j >= 0
                            			&& coluna + j < 5 && !(bombas[linha + i][coluna + j])) {

                            		matrizInicial[linha + i][coluna + j]++;
                            	}
        					 }
        				}
        			}
        		}
        	}
		}

        Scanner scan = new Scanner(System.in);
        System.out.println("Vamos jogar, Campo Minado!!");

        do {
			int jogadaLinha;
			int jogadaColuna;

			System.out.print("Digite a Linha entre 1 e 5: ");
			jogadaLinha = scan.nextInt() -1;
			System.out.print("Digite a Coluna entre 1 e 5: ");
			jogadaColuna = scan.nextInt() -1;

			if ((jogadaColuna > 4 || jogadaLinha > 4) || (jogadaColuna < 0 || jogadaLinha < 0)) {
				System.out.println("Jogada invalida! Tente novamente!");
				continue;
			}

			if ('?' != matrizDeJogadas[jogadaLinha][jogadaColuna]) {
				System.out.println("Jogada repetida! Tente outra!");
			}

			if (bombas[jogadaLinha][jogadaColuna]) {
				perdeu = false;
				break;
			}

			matrizDeJogadas[jogadaLinha][jogadaColuna] = Character.forDigit(matrizInicial[jogadaLinha][jogadaColuna], 10);

	        for (int index = 0; index < 5; index++) {
	            for (int j = 0; j < 5; j++) {
	            	System.out.print(matrizDeJogadas[index][j]);
	            };
	            System.out.println("");
	        };

	        int count = 0;

	        for (int index = 0; index < 5; index++) {
	            for (int j = 0; j < 5; j++) {
	            	if (matrizDeJogadas[index][j] != '?') {
						count++;
					}
	            };
	        };

            if (count == 25) {
				break;
			}

        } while (perdeu);
        scan.close();

      if(!perdeu) {
    	  System.out.println("Game Over!");
      } else {
    	  System.out.println("Você ganhou!!!");
      }
	}
}
