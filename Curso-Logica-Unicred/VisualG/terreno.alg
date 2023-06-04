Algoritmo "semnome"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 1/5/2023
Var
// Seção de Declarações das variáveis
   largura, comprimento, precoMetroQ, area, preco : real
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
  escreval("Digite a largura do terreno: ")
   leia(largura)
   escreval("Digite o comprimento do terreno: ")
   leia(comprimento)

   area <- largura * comprimento

   escreval("Digite o valor do metro quadrado: ")
   leia(precoMetroQ)

   preco <- area * precoMetroQ

   escreval("Area do Terreno: ", area:3:2)
   escreval("Preco do terreno: ", preco:8:2)

Fimalgoritmo