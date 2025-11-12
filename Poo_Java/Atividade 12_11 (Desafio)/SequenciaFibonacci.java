import java.util.Scanner;


public class SequenciaFibonacci {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro N: ");
		int n = entrada.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		
		System.out.println("Sequência de Fibonacci com " + n + " números:");
		
		if (n == 1) {
		    System.out.println(primeiro);
		}
		else if (n >= 2) {
		    System.out.print(primeiro + ", " + segundo);
		    
		    for (int i = 3; i <= n; i++) {
		        int proximo = primeiro + segundo;
		        
		        System.out.print(", " + proximo);
		        primeiro = segundo;
		        segundo = proximo;
		    }
		    System.out.println();
		}
		else {
		    System.out.println("Por favor, digite um número maior que zero.");
		}
		
		entrada.close();
	}
}
