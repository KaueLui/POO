package calcularimcbasal.app;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner label = new Scanner(System.in);
        String opcao = "Menu"; // Guarda a opção
        
        do { // Loop
            System.out.println("[Menu]");
            System.out.println("[1] - Imc");
            System.out.println("[2] - Metabolismo Basal");
            System.out.println("[0] - Sair");
            System.out.print("Escolha uma das opção: ");
            opcao = label.next();

            switch (opcao) {
                case "1":
                	Imc(label);
                    break;
                case "2":
                    Basal(label);
                    break;
                case "0":
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (!opcao.equals("0"));

    }

		 public static void Imc (Scanner label) {           	 //Mesma função de Imc da atividade 1	
			 System.out.println("Qual o seu peso:");
			 double kg = label.nextDouble();
			 
			 System.out.println("Qual sua altura:");
			 double m = label.nextDouble();
			 
			 double imc = kg/(m * m);
			 System.out.printf("Seu IMC é: %.2f\n", imc);
			                                    		
			 if (imc < 19) {
				 System.out.println("Sua classificação: Abaixo do Peso");
		     } else if (imc >= 19 && imc < 25) {
		    	 System.out.println("Sua classificação: Peso Normal");
		     } else if (imc >= 25 && imc < 30) {
		    	 System.out.println("Sua classificação: Sobrepeso");
		     } else if (imc >= 30 && imc < 40) {
		    	 System.out.println("Sua classificação: Obesidade do tipo I");
		     } else {
		    	 System.out.println("Sua classificação: Obesidade Mórbida");
		     }
		 }

		public static void Basal(Scanner label) { 				//Mesma função de Imc da atividade 1	
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
		}
	}


