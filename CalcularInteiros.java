import java.util.Scanner;

class CalcularInteiros { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite Três Números Inteiros Separados por Espaço: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        long produto = (long) a * b * c;
        System.out.println("O Produto dos Três Números é: " + produto);

        sc.close();
    }
}
