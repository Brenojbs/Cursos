totalCobaias = 0
coelho = 0
rato = 0
sapo = 0


casosTest = int(input("Quantos casos de teste serao digitados? "))

for i in range(0, casosTest):
    cobaiaQuant = int(input("Quantidade de cobaias: "))

    cobaia = input("Tipo de cobaia: ")

    if cobaia == 'C':
        totalCobaias = totalCobaias + cobaiaQuant
        coelho = coelho + cobaiaQuant
    elif cobaia == 'R':
        totalCobaias = totalCobaias + cobaiaQuant
        rato = rato + cobaiaQuant            
    else:
        totalCobaias = totalCobaias + cobaiaQuant
        sapo = sapo + cobaiaQuant


print(f"Total: cobaias {totalCobaias}")
print(f"Total de coelhos: {coelho}")
print(f"Total de ratos: {rato}")
print(f"Total de sapos: {sapo}")
print(f"Percentual de coelhos: {((coelho / totalCobaias) * 100):.2f}")
print(f"Percentual de ratos: {((rato / totalCobaias) * 100):.2f}")
print(f"Percentual de sapos: {((sapo / totalCobaias) * 100):.2f}")