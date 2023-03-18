package tresJavaPCK;
import java.util.Scanner;
import java.util.ArrayList;
public class tresJava {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String Aluno;
		String informarNovoAluno = "S";
		Double Nota , Media;
		int L=1;
        int C=1;
        int Linha;
        int Col;
        	    
		String [][] dadosNome = new String[10][100];   // vai armazenar todos os nomes
	    Double [][] dadosNotas = new Double[10][100]; // Vai armazenar todos dados das notas
	    Double [][] dadosMedia = new Double[10][100]; // Vai armazenar todos dados das medias
	    Linha = 1;
        Col = 1;
        
        while (informarNovoAluno.equals("S") ) {
        	System.out.println("Informe o nome do Aluno : ");     	
        	Aluno = sc.next();
        
            dadosNome[L][C] = Aluno;
            Media = 0.0;
            
        	for (int i = 1; i < 5; i++) {
        		System.out.println("Informe a Nota "+i);  
        		Nota = sc.nextDouble();
        		Media = Media + Nota;
        		dadosNotas[Linha][Col] = Nota;
        		Col = Col + 1;
			}
        	
        	Media = Media / 4;
        	dadosMedia[Linha][1] = Media;
        	Media = 0.0;
        	L = L + 1;
        	Linha = Linha + 1;
        	
        	System.out.println("Deseja informar um novo aluno? (S ou N) : ");
        	informarNovoAluno = sc.next();
        	
		}
		
        for ( int i = 0 ; i<L ;i++) 
            for ( int j =0 ; j<=Col ;j++)
            {
            	if (dadosNome[i][j] != null) {
            		System.out.println("Aluno["+i+"]= "+dadosNome[i][j]);
            		
            	}
            	if (dadosNotas[i][j] != null) {
            		System.out.println("Nota= "+dadosNotas[i][j]);
            	}
            	
            	if (dadosMedia[i][j] != null) {
            		
            		System.out.println("Média Final= "+dadosMedia[i][j]);
            		
            		if (dadosMedia[i][j] >= 6) {
        				System.out.println("Aprovado");
        			} else {
        				System.out.println("Reprovado");
        			}
            	}
    			
    		
            }
		
	}
}

