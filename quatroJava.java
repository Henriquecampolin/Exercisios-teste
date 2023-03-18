package quatroJavaPCK;
import java.util.Iterator;
import java.util.Scanner;
public class quatroJava {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		int tamanho = 5;
		int v[] = new int [tamanho];
		int i;
		
		for(i=0; i<tamanho; i++) {
		 System.out.print("Informe o numero "+(i+1)+"º");
		 v[i] = scr.nextInt();
		}
		System.out.println("O numero do indice 3 (posição) é:"+(v[2]));
		

		

	}

}
