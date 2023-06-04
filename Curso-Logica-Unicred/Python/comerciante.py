
nome: str

quantBetewn = 0
quant10 = 0
quant20 = 0

porcento = 0.00
compra = 0.00
venda = 0.00
totalCompra = 0.00
totalVenda = 0.00

quantidadeProduto = int(input("Serao digitados dados de quantos produtos? "))

for i in range(0, quantidadeProduto):

    print(f"Produto {i+1}: ")

    nome = input("Nome: ")

    compra = float(input("Preço de compra: "))

    venda = float(input("Preço de venda: "))

    porcento = (( venda - compra) / compra * 100)

    totalCompra = totalCompra + compra
    totalVenda = totalVenda + venda

    if (porcento < 10.0):
        quant10 = quant10+1
    elif (porcento < 20.0):
        quantBetewn = quantBetewn+1
    else: 
        quant20 = quant20+1


print(" RELATORIO: ")
print(f"Lucro abaixo de 10%: {quant10}")
print(f"Lucro entre 10% e 20%: {quantBetewn}")
print(f"Lucro acima de 20%: {quant20}")
print(f"Valor total de compra: {totalCompra:.2f}")
print(f"Valor total de venda: {totalVenda:.2f}")
print(f"Lucro total: {(totalVenda - totalCompra):.2f}")
