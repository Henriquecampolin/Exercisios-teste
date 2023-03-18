package doisJavaPCK;
import java.util.Scanner;
public class doisJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         int maiorNumero = 0 , menorNumero = 999999999;
	      for (int i = 0; i < 5; i++) {
	         System.out.printf("Digite o %dº número: ", i + 1);
	         
	         int valorInformado = sc.nextInt();
	         
	         if(valorInformado > maiorNumero) {
	        	 maiorNumero = valorInformado;//sc.nextDouble();
	         }
	         if(valorInformado < menorNumero) {
	        	 menorNumero = valorInformado;
	        	 
	         }
	                  
	      }
	      
	      System.out.println("O menor numero é "+menorNumero);
	      System.out.println("O maior numero é "+maiorNumero);

	      sc.close();
	}

}
