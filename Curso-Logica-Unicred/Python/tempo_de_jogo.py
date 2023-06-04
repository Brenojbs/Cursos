

primeiroValor = int(input("Hora iniciada: "))

segundoValor = int(input("Hora terminada: "))

if primeiroValor == segundoValor:
    print(f"O JOGO DUROU {24} HORA(S)")
elif primeiroValor < segundoValor:
    print(f"O JOGO DUROU {segundoValor - primeiroValor} HORA(S)")

elif primeiroValor > segundoValor:
    print(f"O JOGO DUROU {24 - primeiroValor + segundoValor} HORA(S)")
