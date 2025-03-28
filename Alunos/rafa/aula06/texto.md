Paradigmas de Programação: Imperativo vs. Declarativo
Introdução
Os paradigmas de programação representam diferentes abordagens para resolver problemas computacionais. Dois dos principais paradigmas são:
Paradigma Imperativo: Baseia-se em comandos sequenciais, modificando estados e controlando o fluxo da execução do programa. Exemplos incluem linguagens como Java e C.
Paradigma Declarativo: Foca em descrever o que deve ser feito, ao invés de como fazer. Exemplos incluem SQL e Prolog.
A seguir, será feita uma comparação entre dois trechos de código, um em Java (imperativo) e outro em Prolog (declarativo), para demonstrar como esses paradigmas atingem seus objetivos.
Código em Java (Paradigma Imperativo)
import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        int soma = num1 + num2;
        System.out.println("A soma é: " + soma);
        
        scanner.close();
    }
}
Explicação
Esse código segue o paradigma imperativo pois:
Declara variáveis e manipula estados explicitamente.
Executa operações em uma ordem específica.
Utiliza comandos sequenciais (entrada de dados, processamento e saída).
Código em Prolog (Paradigma Declarativo)
soma(X, Y, Resultado) :- Resultado is X + Y.
Explicação
Esse código segue o paradigma declarativo pois:
Não especifica como os valores são obtidos, apenas define uma relação entre eles.
A resolução é feita pelo motor de inferência do Prolog.
Foca no que deve ser computado, não no fluxo de controle.
Comparação
Característica	Java (Imperativo)	Prolog (Declarativo)
Controle de fluxo	Explicito, baseado em sequências e laços	Implícito, baseado em lógica e inferência
Manipulação de estado	Modificação direta de variáveis	Definição de regras e relações
Ordem de execução	Determinada pelo programador	Determinada pelo sistema de inferência
Aplicabilidade	Programas estruturados e orientados a objetos	Resolução de problemas lógicos e consultas
Conclusão
O paradigma imperativo é mais intuitivo para tarefas sequenciais, enquanto o paradigma declarativo se destaca em problemas que envolvem inferência lógica. A escolha do paradigma depende do contexto e dos requisitos do problema a ser resolvido.
