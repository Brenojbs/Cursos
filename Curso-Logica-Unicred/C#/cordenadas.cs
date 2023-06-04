using System;
using System.Globalization;

namespace cordenadas
{
    class program
    {
        static void Main(string[] args)
        {
            double x = 0.00;
            double y = 0.00;

            Console.Write("Valor de X: ");
            x = double.Parse(Console.ReadLine());

            Console.Write("Valor de Y: ");
            y = double.Parse(Console.ReadLine());
        
            if(x == 0 && y == 0) {
                Console.WriteLine("ORIGEM");
            } else if (x > 0 && y > 0) {
        
                Console.WriteLine("Q1");
        
            }  else if (x < 0 && y < 0) {
                
                Console.WriteLine("Q4");
        
            }  else if (x < 0 && y > 0) {
                
                Console.WriteLine("Q2");
        
            }  else if (x > 0 && y < 0) {
                
                Console.WriteLine("Q3");
        
            }  else if ((x > 0 || x < 0) && y == 0) {
                
                Console.WriteLine("Eixo X");
        
            }  else if (x == 0 && (y > 0 || y < 0)) {
                
                Console.WriteLine("Eixo Y");
        
            }
    
        }
    }

}
