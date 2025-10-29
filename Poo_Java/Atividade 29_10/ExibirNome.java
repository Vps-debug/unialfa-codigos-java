import java.util.Scanner;
public class ExibirNome {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in); //Linha 6

        System.out.print("Digite seu nome: "); //Linha 8
       String nome = sc.next();
       System.out.println("O nome de usuário é: " +nome);
    }
}
