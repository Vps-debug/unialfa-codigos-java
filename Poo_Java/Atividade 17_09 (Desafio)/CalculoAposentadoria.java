import java.util.Scanner;

public class CalculoAposentadoria {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            
            System.out.print("Digite a sua Idade: ");
            int idade = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite seu Sexo (M para Masculino, F para Feminino): ");
            String sexo = scanner.nextLine();

            System.out.print("Digite a Quantidade de anos de Contribuição: ");
            int anosContribuicao = Integer.parseInt(scanner.nextLine());

            int anosFaltando = 0;
            boolean temDireitoAposentadoria = false;

            
            if (sexo.equalsIgnoreCase("F")) {
                if (idade >= 60 && anosContribuicao >= 30) {
                    temDireitoAposentadoria = true;
                } else {
                    if (idade < 60) {
                        anosFaltando += 60 - idade;
                    }
                    if (anosContribuicao < 30) {
                        anosFaltando += 30 - anosContribuicao;
                    }
                }
            } else if (sexo.equalsIgnoreCase("M")) {
                if (idade >= 65 && anosContribuicao >= 35) {
                    temDireitoAposentadoria = true;
                } else {
                    if (idade < 65) {
                        anosFaltando += 65 - idade;
                    }
                    if (anosContribuicao < 35) {
                        anosFaltando += 35 - anosContribuicao;
                    }
                }
            } else {
                System.out.println("Sexo inválido. Use 'M' para Masculino ou 'F' para Feminino.");
                return;
            }

            
            if (temDireitoAposentadoria) {
                System.out.println("Você já tem o direito à Aposentadoria.");
            } else {
                System.out.println("Faltam " + anosFaltando + " Anos Para você se Aposentar.");
            }

        } catch (Exception e) {
            System.out.println("Erro na entrada de dados: " + e.getMessage());
        }
    }
}
