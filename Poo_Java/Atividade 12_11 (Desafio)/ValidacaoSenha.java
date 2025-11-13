import java.util.Scanner;


public class ValidacaoSenha {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Defina uma senha: ");
		String senhaDefinida = entrada.nextLine();
		
		String tentativa;
		
		int tentativasRestantes = 3;
		
		while (tentativasRestantes > 0) {
		    System.out.print("Digite a senha para confirmar: ");
		    tentativa = entrada.nextLine();
		    
		    if (tentativa.equals(senhaDefinida)) {
		        System.out.println("Acesso concedido.");
		        break;
		    } else {
		        tentativasRestantes--;
		        
		        if (tentativasRestantes > 0) {
		            System.out.println("Senha incorreta. Tente novamente.");
		            System.out.println("Tentativas restantes: " + tentativasRestantes);
		        } else {
		            System.out.println("Acesso bloqueado. Número máximo de tentativas excedido.");
		        }
		    }
		}
		entrada.close();
	}
}
