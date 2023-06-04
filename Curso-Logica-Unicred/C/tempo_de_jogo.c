#include <stdio.h>

void main() {
    int primeiroValor, segundoValor;
    printf("Hora iniciada: ");
    scanf("%d", &primeiroValor);
    printf("Hora terminada: ");
    scanf("%d", &segundoValor);

    if(primeiroValor == segundoValor) {
        printf("O JOGO DUROU %d HORA(S)", 24);
    } else if (primeiroValor < segundoValor) {

        printf("O JOGO DUROU %d HORA(S)", segundoValor - primeiroValor);

    }  else if (primeiroValor > segundoValor) {
        
        printf("O JOGO DUROU %d HORA(S)", (24 - primeiroValor + segundoValor));

    }
    

}