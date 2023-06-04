#include <stdio.h>
#include <string.h>

void limpar_entrada() {
    char c;
    while ((c = getchar()) != '\n' && c != EOF) {}
}

void main() {
    int quantidadeProduto, quant10, quant20, quantBetewn;
    char nome[50];
    double porcento, compra, venda, totalCompra, totalVenda;

    printf("Serao digitados dados de quantos produtos? ");
    scanf("%d", &quantidadeProduto);

    for (int i = 0; i < quantidadeProduto; i++) {

        printf("Produto %d: \n", i+1);

        printf("Nome: ");
        limpar_entrada();
        scanf("%s", nome);

        printf("Preço de compra: ");
        scanf("%lf", &compra);

        printf("Preço de venda: ");
        scanf("%lf", &venda);

        porcento = (( venda - compra) / compra * 100);

        totalCompra = totalCompra + compra;
        totalVenda = totalVenda + venda;

        if (porcento < 10.0) {
            quant10++;
        } else if (porcento < 20.0) {
            quantBetewn++;
        } else {
            quant20++;
        }
    }

    printf("\n RELATORIO:\n");
    printf("Lucro abaixo de 10%%: %d \n", quant10);
    printf("Lucro entre 10%% e 20%%: %d \n", quantBetewn);
    printf("Lucro acima de 20%%: %d\n", quant20);
    printf("Valor total de compra: %.2lf \n", totalCompra);
    printf("Valor total de venda: %.2lf \n", totalVenda);
    printf("Lucro total: %.2lf \n", totalVenda - totalCompra);
}