import java.util.Scanner;


public class ContadorCaracteresA {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = entrada.nextLine();
		
		int contador = 0;
		
		for (int i = 0; i < frase.length(); i++) {
		    char c = frase.charAt(i);
		    
		    if (c == 'a' || c == 'A') {
		        contador++;
		    }
		}
		
		System.out.println("A letra 'a' aparece " + contador + " vezes na frase.");
		
		entrada.close();
	}
}
