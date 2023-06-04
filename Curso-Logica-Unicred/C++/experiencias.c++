#include <bits/stdc++.h>
using namespace std;


int main() {
    int casosTest, cobaiaQuant, totalCobaias, coelho, rato, sapo;
    string cobaia;

    cout<<"Quantos casos de teste serao digitados? "<< endl;
    cin>>casosTest;
    for (int i = 0; i < casosTest; i++) {
        cout<<"Quantidade de cobaias: "<< endl;
        cin>>cobaiaQuant;

        cout<<"Tipo de cobaia: "<< endl;
        cin>>cobaia;

        if (cobaia == "C") {
            totalCobaias = totalCobaias + cobaiaQuant;
            coelho = coelho + cobaiaQuant;
        } else if (cobaia == "R") {
            totalCobaias = totalCobaias + cobaiaQuant;
            rato = rato + cobaiaQuant;            
        } else if (cobaia == "S") {
            totalCobaias = totalCobaias + cobaiaQuant;
            sapo = sapo + cobaiaQuant;
        }

    }

    cout<<"Total: "<<totalCobaias<<" cobaias "<< endl;
    cout<<"Total de coelhos: "<<coelho<< endl;
    cout<<"Total de ratos: "<<rato<< endl;
    cout<<"Total de sapos: "<<sapo<< endl;
    cout<<"Percentual de coelhos: "<<(((double) coelho / totalCobaias) * 100)<< endl;
    cout<<"Percentual de ratos: "<<(((double) rato / totalCobaias) * 100)<< endl;
    cout<<"Percentual de sapos: "<<(((double) sapo / totalCobaias) * 100)<< endl;

    return 0;
}
