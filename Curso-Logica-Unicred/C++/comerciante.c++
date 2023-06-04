#include <bits/stdc++.h>

using namespace std;

int main() {
    int quantidadeProduto, quant10, quant20, quantBetewn;
    string nome;
    double porcento, compra, venda, totalCompra, totalVenda;

    cout<<"Serao digitados dados de quantos produtos? ";
    cin>>quantidadeProduto;

    for (int i = 0; i < quantidadeProduto; i++) {

        cout<<"Produto "<< i+1<<": "<<endl;

        cout<<"Nome: ";
        cin>>nome;

        cout<<"Preço de compra: ";
        cin>>compra;

        cout<<"Preço de venda: ";
        cin>>venda;

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

    cout<<"\n RELATORIO: "<< endl;
    cout<<"Lucro abaixo de 10%: "<< quant10 << endl;
    cout<<"Lucro entre 10% e 20%: "<< quantBetewn << endl;
    cout<<"Lucro acima de 20%: "<< quant20 << endl;
    cout<< fixed << setprecision(2) <<"Valor total de compra: "<< totalCompra<< endl;
    cout<< fixed << setprecision(2) <<"Valor total de venda: "<< totalVenda<< endl;
    cout<< fixed << setprecision(2) <<"Lucro total: "<< totalVenda - totalCompra<< endl;

    return 0;
}
