Algoritmo "idade"
// 
//  
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 1/5/2023
Var
// Se��o de Declara��es das vari�veis 
  idade1, idade2 : inteiro
  nome1, nome2 : caracter
  media : real
Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
  escreval("Dados da primeira pessoa: ")
  escreva("Nome: ")
  leia(nome1)
  escreva("Idade: ")
  leia(idade1)
  escreval("Dados da segunda pessoa: ")
  escreva("Nome: ")
  leia(nome2)
  escreva("Idade: ")
  leia(idade2)
  
  media <- ((idade1 + idade2) / 2)
  
  escreval("A idade m�dia de ", nome1, " e ", nome2, " � de ", media, " anos")

Fimalgoritmo