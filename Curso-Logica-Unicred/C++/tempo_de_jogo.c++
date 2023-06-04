#include <bits/stdc++.h>

using namespace std;

int main() {
    int primeiroValor, segundoValor;
    cout<<"Hora iniciada: ";
    cin>>primeiroValor;
    cout<<"Hora terminada: ";
    cin>>segundoValor;

    if(primeiroValor == segundoValor) {
        cout<<"O JOGO DUROU 24 HORA(S)";
    } else if (primeiroValor < segundoValor) {

        cout<<"O JOGO DUROU "<< segundoValor - primeiroValor<<" HORA(S)"<< endl;

    }  else if (primeiroValor > segundoValor) {
        
        cout<<"O JOGO DUROU "<< (24 - primeiroValor + segundoValor)<<" HORA(S)"<< endl;

    }

    return 0;

}