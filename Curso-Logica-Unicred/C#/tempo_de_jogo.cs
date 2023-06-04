using System;

namespace tempo_de_jogo
{
    class program
    {
        static void Main(string[] args)
        {
            int primeiroValor = 0;
            int segundoValor = 0;

            Console.Write("Hora iniciada: ");
            primeiroValor = int.Parse(Console.ReadLine());

            Console.Write("Hora terminada: ");
            segundoValor = int.Parse(Console.ReadLine());

            if(primeiroValor == segundoValor) {
                Console.Write("O JOGO DUROU " + 24 + " HORA(S)");
            } else if (primeiroValor < segundoValor) {

                Console.Write("O JOGO DUROU " + (segundoValor - primeiroValor) + " HORA(S)");

            }  else if (primeiroValor > segundoValor) {

                Console.Write("O JOGO DUROU " + (24 - primeiroValor + segundoValor) + " HORA(S)");

            }
        }
    }

}
