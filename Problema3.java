package problema3;
import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] moedas = { "Real R$", "Dolar $", "Euro E" };
        Double valorConvertido = 0.0;

        System.out.println("Escolha a moeda de Origem");
        for (int i = 1; i <= moedas.length; i++) {
            System.out.printf("(%d) - %s%n", i, moedas[i-1]);
        }
        System.out.print("Insira uma das opções acima: ");
        int escolhaOrigem = sc.nextInt();

        System.out.println();
        System.out.println("Escolha a moeda de Destino");
        for (int i = 1; i <= moedas.length; i++) {
            if(i != escolhaOrigem){
                System.out.printf("(%d) - %s%n", i, moedas[i-1]);
            }
        }
        System.out.print("Insira uma das opções acima: ");
        int escolhaDestino = sc.nextInt();

        System.out.println();
        System.out.print("Insira o valor a ser convertido: ");
        Double valor = sc.nextDouble();

        switch (escolhaOrigem - 1) {
            case 0:
                switch (escolhaDestino - 1) {
                    case 1: // Dollar
                        valorConvertido = valor * 0.20;
                        break;

                    case 2: // Euro
                        valorConvertido = valor * 0.18;
                        break;
                    default: 
                      System.out.println("Insira uma moeda de destino válida");
                        break;
                }
                break;

            case 1:
                switch (escolhaDestino - 1) {
                    case 0: // Real
                        valorConvertido = valor * 5.0;
                        break;

                    case 2: // Euro
                        valorConvertido = valor * 0.92;
                        break;
                    default: 
                        System.out.println("Insira uma moeda de destino válida");
                        break;
                }
                break;

            case 2:
                switch (escolhaDestino - 1) {
                    case 0: // Real
                        valorConvertido = valor * 5.44;
                        break;

                    case 1: // Dólar
                        valorConvertido = valor * 1.09;
                        break;
                    default: 
                        System.out.println("Insira uma moeda de destino válida");
                        break;
                }
                break;

            default:
                System.out.println("Insira uma moeda de origem válida");
                break;
        }

        System.out.printf("O valor convertido é: %.2f %s", valorConvertido, moedas[escolhaDestino-1]);

        sc.close();
    }
}
