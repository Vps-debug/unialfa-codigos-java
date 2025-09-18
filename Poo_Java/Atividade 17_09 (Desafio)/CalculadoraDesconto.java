import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Digite o valor do produto: ");
            double valorProduto = Double.parseDouble(reader.readLine());

            System.out.print("Digite o percentual de desconto: ");
            double percentualDesconto = Double.parseDouble(reader.readLine());

            double valorDesconto = valorProduto * percentualDesconto / 100;

            double valorComDesconto = valorProduto - valorDesconto;

            System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
            System.out.printf("Valor do produto com desconto: R$ %.2f\n", valorComDesconto);

        } catch (Exception e) {
            System.out.println("Erro na entrada de dados: " + e.getMessage());
        }
    }
}
