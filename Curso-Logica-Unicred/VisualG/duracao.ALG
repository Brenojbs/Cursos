Algoritmo "duracao"
// 
//  
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 1/5/2023
Var
// Se��o de Declara��es das vari�veis
  segundos, minutos, horas, resto, duracao : inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
  escreval("Digite a duracao em segundos: ")
  leia(duracao)
  horas <- duracao \ 3600
  resto <- duracao % 3600
  minutos <- resto \ 60
  segundos <- resto % 60
  escreval(horas, ":", minutos, ":", segundos)
Fimalgoritmo