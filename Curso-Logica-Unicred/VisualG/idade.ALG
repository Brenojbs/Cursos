Algoritmo "idade"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 1/5/2023
Var
// Seção de Declarações das variáveis 
  idade1, idade2 : inteiro
  nome1, nome2 : caracter
  media : real
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
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
  
  escreval("A idade média de ", nome1, " e ", nome2, " é de ", media, " anos")

Fimalgoritmo