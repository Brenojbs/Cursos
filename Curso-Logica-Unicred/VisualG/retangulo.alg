Algoritmo "semnome"
//
//
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 1/5/2023
Var
// Se��o de Declara��es das vari�veis
  base, altura, area, perimetro, diagonal : real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
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