#include <stdio.h>

void main() {
    double x, y;
    printf("Valor de X: ");
    scanf("%lf", &x);
    printf("Valor de Y: ");
    scanf("%lf", &y);

    if(x == 0 && y == 0) {
        printf("ORIGEM");
    } else if (x > 0 && y > 0) {

        printf("Q1");

    }  else if (x < 0 && y < 0) {
        
        printf("Q4");

    }  else if (x < 0 && y > 0) {
        
        printf("Q2");

    }  else if (x > 0 && y < 0) {
        
        printf("Q3");

    }  else if ((x > 0 || x < 0) && y == 0) {
        
        printf("Eixo X");

    }  else if (x == 0 && (y > 0 || y < 0)) {
        
        printf("Eixo Y");

    }
    

}