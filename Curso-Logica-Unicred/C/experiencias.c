#include <stdio.h>
#include <string.h>

void limpar_entrada() {
    char c;
    while ((c = getchar()) != '\n' && c != EOF) {}
}

void main() {
    int casosTest, cobaiaQuant, totalCobaias, coelho, rato, sapo;
    char cobaia;

    printf("Quantos casos de teste serao digitados? \n");
    scanf("%d", &casosTest);
    for (int i = 0; i < casosTest; i++) {
        printf("Quantidade de cobaias: \n");
        scanf("%d", &cobaiaQuant);

        limpar_entrada();

        printf("Tipo de cobaia: \n");
        scanf("%c", &cobaia);

        if (cobaia == 'C') {
            totalCobaias = totalCobaias + cobaiaQuant;
            coelho = coelho + cobaiaQuant;
        } else if (cobaia == 'R') {
            totalCobaias = totalCobaias + cobaiaQuant;
            rato = rato + cobaiaQuant;            
        } else if (cobaia == 'S') {
            totalCobaias = totalCobaias + cobaiaQuant;
            sapo = sapo + cobaiaQuant;
        }

    }

    printf("Total: %d cobaias \n", totalCobaias);
    printf("Total de coelhos: %d \n", coelho);
    printf("Total de ratos: %d \n", rato);
    printf("Total de sapos: %d \n", sapo);
    printf("Percentual de coelhos: %.2lf \n", (((double) coelho / totalCobaias) * 100));
    printf("Percentual de ratos: %.2lf \n", (((double) rato / totalCobaias) * 100));
    printf("Percentual de sapos: %.2lf \n", (((double) sapo / totalCobaias) * 100));
}