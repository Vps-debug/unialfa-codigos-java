import java.util.Scanner;

public class CalculoNota {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Digite a Nota da Primeira Prova: ");
            double notaProva1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Digite a Nota da Segunda Prova: ");
            double notaProva2 = Double.parseDouble(scanner.nextLine());

            System.out.print("Digite a Nota do Trabalho: ");
            double notaTrabalho = Double.parseDouble(scanner.nextLine());

            
            double media = (notaProva1 + notaProva2 + notaTrabalho) / 3;

            
            String resultado = (media >= 6) ? "Aprovado" : "Reprovado";

            
            System.out.printf("Média: %.2f%nResultado final: %s%n", media, resultado);

        } catch (Exception e) {
            System.out.println("Erro na entrada de dados: " + e.getMessage());
        }
    }
}
