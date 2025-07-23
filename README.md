# ContaBanco

Projeto Java desenvolvido durante o bootcamp da DIO para simular a criação de uma conta bancária através do terminal.

## Funcionalidade

O programa solicita ao usuário as seguintes informações:
- Número da conta
- Agência (com dígito)
- Nome do cliente
- Valor inicial de depósito

Após inserir os dados, exibe uma mensagem de confirmação com as informações da conta criada.

## Como executar

1. Compile o arquivo Java:
```bash
javac src/ContaTerminal.java
```

2. Execute o programa:
```bash
java -cp src ContaTerminal
```

## Exemplo de uso

```
Digite o número da conta: 1021
Digite o número e digito da agência: 067-8
Digite o nome do cliente: Mario Andrade
Digite o valor a ser depositado: 237.48

Olá Mario Andrade, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
```
