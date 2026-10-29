# ContaBanco

Exercício do bootcamp de Java da DIO: um programa de terminal que simula abrir uma conta bancária.

Ele pergunta o número da conta, a agência (com o dígito), o nome do cliente e o valor do depósito inicial, e responde com uma mensagem de boas-vindas que repete esses dados. Não guarda nada.

O nome do cliente é lido com `scanner.next()`, então só entra a primeira palavra. "Maria Silva" vira "Maria".

## Rodar

Precisa do JDK. Dentro de `ContaBanco`:

```
javac src/ContaTerminal.java
java -cp src ContaTerminal
```
