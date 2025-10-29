import java.util.Scanner;
public class MediaAritmetica {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in); //Linha 6

        System.out.print("Digite o primeiro número: "); //Linha 8
        double numero1 = sc.nextDouble();          //Linha 9

        System.out.print("Digite o segundo número: ");  //Linha 11
        double numero2 = sc.nextDouble();
        
        System.out.print("Digite o terceiro número: ");
        double numero3 =sc.nextDouble();
        double media;
        media = (numero1 + numero2 + numero3)/3;
        System.out.println("A media de tres números é: " + media);
    }
}
