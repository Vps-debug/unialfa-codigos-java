import java.util.Scanner;

public class CalculoVitorias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite a quantidade de pontos do líder: ");
        int pontosLider = scanner.nextInt();

        System.out.print("Digite a quantidade de pontos do time lanterna: ");
        int pontosLanterna = scanner.nextInt();

        
        int vitoriasNecessarias = (pontosLider - pontosLanterna + 2) / 3; 

       
        System.out.println("Número de vitórias necessárias: " + vitoriasNecessarias);
    }
}
