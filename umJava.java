package umJavaPCK;
import java.util.Scanner;
public class umJava {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      double[] numeros = new double[5];

	      for (int i = 0; i < 5; i++) {
	         System.out.printf("Digite o %dº número: ", i + 1);
	         numeros[i] = sc.nextDouble();
	      }

	      int contPar = 0;
	      int contImpar = 0;
	      double total = 0;

	      for (double num : numeros) {
	         if (num % 2 == 0) {
	            contPar++;
	         } else {
	            contImpar++;
	         }
	         total += num;
	      }

	      double media = total / numeros.length;

	      System.out.print("Números pares: ");
	      boolean haPar = false;
	      for (double num : numeros) {
	         if (num % 2 == 0) {
	            System.out.printf("%.2f ", num);
	            haPar = true;
	         }
	      }
	      if (!haPar) {
	         System.out.print("Não há números pares.");
	      }

	      System.out.print("\nNúmeros ímpares: ");
	      boolean haImpar = false;
	      for (double num : numeros) {
	         if (num % 2 != 0) {
	            System.out.printf("%.2f ", num);
	            haImpar = true;
	         }
	      }
	      if (!haImpar) {
	         System.out.print("Não há números ímpares.");
	      }

	      System.out.printf("\nMédia geral: %.2f", media);

	      sc.close();

	}

}
