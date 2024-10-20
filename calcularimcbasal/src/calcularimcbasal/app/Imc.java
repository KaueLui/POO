package calcularimcbasal.app;
import java.util.Scanner;

public class Imc {
 public static void main (String[] args) {
	 Scanner label = new Scanner(System.in);             		// Criando o Scanner para pegar informações no console
	 System.out.println("Qual seu nome?");
	 String nome = label.nextLine();
	 
	 System.out.println("Qual o seu peso?");
	 double kg = label.nextDouble();
	 
	 System.out.println("Qual sua altura?");
	 double m = label.nextDouble();
	 
	 double imc = kg/(m * m);
	 System.out.printf("%s, seu IMC é: %.2f\n", nome, imc);
	 
	 String tabela;                                     		// Condição para efetuar a tabela
	 if (imc < 19) {
         tabela = "Abaixo do Peso";
     } else if (imc >= 19 && imc < 25) {
         tabela = "Peso Normal";
     } else if (imc >= 25 && imc < 30) {
    	 tabela = "Sobrepeso";
     } else if (imc >= 30 && imc < 40) {
    	 tabela = "Obesidade do tipo I";
     } else {
    	 tabela = "Obesidade Mórbida";
     }
     System.out.println("Sua classificação de IMC é: " + tabela); 
     label.close();
 }
}
