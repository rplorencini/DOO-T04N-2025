import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void calculaPrecoTotal(Scanner sc)
    {
        int quantidade = 0;
        BigDecimal preco = new BigDecimal(0);
        System.out.println("Insira a quantidade da planta referida");
        quantidade = sc.nextInt();
        System.out.println("Insira o preço da planta referida");
        preco = sc.nextBigDecimal();
        System.out.println("Quantidade: " + quantidade + " Preço: " + preco);
        System.out.println("O Preço total é: R$ " + preco.multiply(new BigDecimal(quantidade)));
    }
    public static void menu (Scanner sc)
    {
        System.out.println(
                "------------------------ MENU ------------------------\n" +
                "1 - Cálcular Preço Total\n" +
                "2 - Calcular Troco\n" +
                "3 - Sair\n"
        );
        int option = sc.nextInt();
        switch(option)
        {
            case 1:
                calculaPrecoTotal(sc);
                menu(sc);
                break;
            case 2:
                System.out.println("Cálcular Preço Total");
                menu(sc);
                break;
            case 3:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Opção inválida");
                menu(sc);
                break;
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu(sc);
    }
}
