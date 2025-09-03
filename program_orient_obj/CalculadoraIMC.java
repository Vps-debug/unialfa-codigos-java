import java.util.*;

public class CalculadoraIMC {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Peso (kg): ");
    double p = Double.parseDouble(s.next().replace(',', '.'));
    
    System.out.print("Altura (m): ");
    double a = Double.parseDouble(s.next().replace(',', '.'));
    
    double imc = p / (a * a);
    System.out.printf("IMC: %.2f%nClassificação: ", imc);
    
    System.out.println(
      imc < 18.5 ? "Abaixo do peso" :
      imc < 24.9 ? "Peso normal" :
      imc < 29.9 ? "Sobrepeso" :
      imc < 34.9 ? "Obesidade I" :
      imc < 39.9 ? "Obesidade II" : "Obesidade III"
    );

    s.close();
  }
}
