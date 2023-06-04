using System;
using System.Globalization;

namespace comerciante
{
    class program
    {
        static void Main(string[] args)
        {
            string nome;

            int quantBetewn = 0;
            int quant10 = 0;
            int quant20 = 0;

            double porcento = 0.00;
            double compra = 0.00;
            double venda = 0.00;
            double totalCompra = 0.00;
            double totalVenda = 0.00;

            CultureInfo ci = CultureInfo.InvariantCulture;
        
            Console.Write("Serao digitados dados de quantos produtos? ");
            int quantidadeProduto = int.Parse(Console.ReadLine());
        
            for (int i = 0; i < quantidadeProduto; i++) {
        
                Console.WriteLine("Produto "+ i+1 +": ");
        
                Console.Write("Nome: ");
                nome = Console.ReadLine();
        
                Console.Write("Preço de compra: ");
                compra = double.Parse(Console.ReadLine());
        
                Console.Write("Preço de venda: ");
                venda = double.Parse(Console.ReadLine());
        
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
        
            Console.WriteLine("\n RELATORIO: ");
            Console.WriteLine("Lucro abaixo de 10%: "+ quant10 );
            Console.WriteLine("Lucro entre 10% e 20%: "+ quantBetewn );
            Console.WriteLine("Lucro acima de 20%: "+ quant20 );
            Console.WriteLine("Valor total de compra: "+ totalCompra.ToString("F2", ci));
            Console.WriteLine("Valor total de venda: "+ totalVenda.ToString("F2", ci));
            Console.WriteLine("Lucro total: "+ (totalVenda - totalCompra).ToString("F2", ci));
        }
    }

}
