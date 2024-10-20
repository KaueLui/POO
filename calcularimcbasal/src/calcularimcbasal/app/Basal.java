package calcularimcbasal.app;
import java.util.Scanner;

public class Basal {
	public static void main(String[] args) {
		Scanner label = new Scanner(System.in);
		
		System.out.println("[M] - Masculino || [F] - Feminino");
		char genero = label.next().charAt(0);
		
		System.out.println("Qual sua idade?");
		int idade = label.nextInt();
		
		System.out.print("Qual seu peso?");
	    double peso = label.nextDouble();
	    
	    double basal = 0;
	   
        if (genero == 'M' || genero == 'm') {
            if (idade >= 18 && idade <= 30) {
            	basal = 15 * peso + 679;
            } else if (idade <= 60) {
            	basal = 12 * peso + 879;
            } else {
            	basal = 13 * peso + 487;
            }
        } else if (genero == 'F' || genero == 'f') {
            if (idade >= 18 && idade <= 30) {
            	basal = 14 * peso + 487;
            } else if (idade <= 60) {
            	basal = 9 * peso + 829;
            } else {
            	basal = 10 * peso + 596;
            }
        } else {
            System.out.println("Gênero inválido.");
        }

        System.out.println("Seu metabolismo basal é: " + basal + " Kcal");

        label.close();
	}
}
