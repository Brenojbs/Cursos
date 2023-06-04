Algoritmo "semnome"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 1/5/2023
Var
// Seção de Declarações das variáveis
  base, altura, area, perimetro, diagonal : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
  escreval("Base do retandulo: ")
  leia(base)
  escreval("Altura do retandulo: ")
  leia(altura)

  area <- base * altura
  perimetro <- 2 * (base + altura)
  diagonal <- RaizQ(base * base + altura * altura)


  escreval("Area: ", area:4:4)
  escreval("Perimetro: ", perimetro:4:4)
  escreval("Diagonal: ", diagonal:4:4)
Fimalgoritmo