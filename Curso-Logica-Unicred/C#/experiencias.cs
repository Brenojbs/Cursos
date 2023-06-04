using System;
using System.Globalization;

namespace experiencias
{
    class program
    {
        static void Main(string[] args)
        {
            int casosTest = 0;
            int cobaiaQuant = 0;
            int totalCobaias = 0;
            int coelho = 0;
            int rato = 0;
            int sapo = 0;

            char cobaia;


            CultureInfo ci = CultureInfo.InvariantCulture;

            Console.Write("Quantos casos de teste serao digitados? ");
            casosTest = int.Parse(Console.ReadLine());

            for (int i = 0; i < casosTest; i++) {
                Console.Write("Quantidade de cobaias: ");
                cobaiaQuant = int.Parse(Console.ReadLine());
            
                Console.Write("Tipo de cobaia: ");
                cobaia = char.Parse(Console.ReadLine());
            
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

            Console.WriteLine("Total: cobaias "+ totalCobaias);
            Console.WriteLine("Total de coelhos: "+ coelho);
            Console.WriteLine("Total de ratos: "+ rato);
            Console.WriteLine("Total de sapos: "+ sapo);
            Console.WriteLine("Percentual de coelhos: "+ (((double) coelho / totalCobaias) * 100).ToString("F2", ci));
            Console.WriteLine("Percentual de ratos: "+ (((double) rato / totalCobaias) * 100).ToString("F2", ci));
            Console.WriteLine("Percentual de sapos: "+ (((double) sapo / totalCobaias) * 100).ToString("F2", ci));
        }
    }

}
