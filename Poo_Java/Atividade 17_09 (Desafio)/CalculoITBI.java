import java.util.Scanner;

public class CalculoITBI {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Digite o valor da transação do imóvel: ");
            double valorTransacao = scanner.nextDouble();

            System.out.print("Digite o valor venal do imóvel: ");
            double valorVenal = scanner.nextDouble();

            System.out.print("Digite o percentual do imposto: ");
            double percentualImposto = scanner.nextDouble();

            
            double maiorValor = Math.max(valorTransacao, valorVenal);

            
            double valorImposto = maiorValor * percentualImposto / 100;

           
            System.out.printf("Valor do imposto a ser pago: R$ %.2f%n", valorImposto);
        } catch (Exception e) {
            System.out.println("Erro na entrada de dados: " + e.getMessage());
        }
    }
}
