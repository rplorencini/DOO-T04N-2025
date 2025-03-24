# Paradigmas de Programação: Imperativo vs. Declarativo

Os paradigmas de programação se dividem em várias categorias, destacando-se o imperativo e o declarativo. O imperativo, como Java, detalha passo a passo como resolver um problema, manipulando estados e variáveis. Já o declarativo, como Prolog, foca no que precisa ser feito, deixando a linguagem chegar ao resultado desejado ou "se virar nos 30".

## Comparação entre Java e Prolog

### Java (Imperativo)

```java
while (menu) {
    System.out.println("[1] - Calcular Preço Total");
    int escolha = scanner.nextInt();
    switch (escolha) {
        case 1: precoTotal(); break;
        case 2: troco(); break;
        case 3: menu = false; break;
        default: System.out.println("Opção inválida!");
    }
}
```

Um loop de menu para uma calculadora básica, no java, controle é manual, com loops e condições seguindo cada ação.

### Prolog (Declarativo)

```prolog
preco_total(Preco, Quantidade, Total) :- Total is Preco * Quantidade.
troco(ValorPago, Custo, Troco) :- Troco is ValorPago - Custo.

menu :-
    write('[1] - Calcular Preço Total'), nl,
    write('[2] - Calcular Troco'), nl,
    write('[3] - Sair'), nl,
    read(Opcao),
    executar(Opcao).

executar(1) :-
    write('Digite o preço unitário: '), read(Preco),
    write('Digite a quantidade: '), read(Quantidade),
    preco_total(Preco, Quantidade, Total),
    write('Preço total: '), write(Total), nl, menu.

executar(2) :-
    write('Digite o valor pago: '), read(ValorPago),
    write('Digite o custo: '), read(Custo),
    troco(ValorPago, Custo, Troco),
    write('Troco: '), write(Troco), nl, menu.

executar(3) :- write('Saindo...'), nl.
executar(_) :- write('Opção inválida!'), nl, menu.
```

O Prolog apenas declara relações e deixa a execução por conta própria.

## Resumo

- **Java:** Controle total, passo a passo.
- **Prolog:** Só diz o que quer e a linguagem faz o resto.

Java é ótimo para controle direto, enquanto Prolog brilha onde lógica e relações são prioridade.
