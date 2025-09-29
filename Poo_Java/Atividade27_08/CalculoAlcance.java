import java.util.Scanner;
import static java.lang.Math.*;

public class CalculoAlcance {

    public static double selecionarVelocidade(Scanner sc) {
        System.out.println("Escolha o tanque:");
        System.out.println("1 - M1 Abrams (~1700 m/s)");
        System.out.println("2 - Obuseiro M109 (~600 m/s)");
        System.out.println("3 - Schwerer Gustav (~820 m/s)");
        System.out.print("Opção: ");

        return switch (sc.nextLine()) {
            case "1" -> 1700.0;
            case "2" -> 600.0;
            case "3" -> 820.0;
            default -> {
                System.out.println("Opção inválida, usando valor padrão (15 m/s).");
                yield 15.0;
            }
        };
    }

    public static double calcularAlcance(double v0, double angulo) {
        double rad = toRadians(angulo);
        return (v0 * v0 * sin(2 * rad)) / 9.8;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double v0 = selecionarVelocidade(sc);
        System.out.print("Digite o ângulo de lançamento (em graus): ");
        double angulo = sc.nextDouble();

        double alcance = calcularAlcance(v0, angulo) / 1000.0;
        System.out.printf("Para velocidade = %.1f m/s e ângulo = %.1f°, o alcance é de %.2f km%n",
                v0, angulo, alcance);

        sc.close();
    }
}
