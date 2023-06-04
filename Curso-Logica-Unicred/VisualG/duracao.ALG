Algoritmo "duracao"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 1/5/2023
Var
// Seção de Declarações das variáveis
  segundos, minutos, horas, resto, duracao : inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
  escreval("Digite a duracao em segundos: ")
  leia(duracao)
  horas <- duracao \ 3600
  resto <- duracao % 3600
  minutos <- resto \ 60
  segundos <- resto % 60
  escreval(horas, ":", minutos, ":", segundos)
Fimalgoritmo