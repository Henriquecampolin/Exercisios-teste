package cincoJavaPCK;
import java.util.Scanner;
public class cincoJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        // Criar matriz de notas com 3 linhas (alunos) e 4 colunas (notas).. q	
        double[][] notas = new double[3][4];
        
        // Solicitar nomes e notas para cada aluno...
        String[] nomes = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do " + (i+1) + "º aluno: ");
            nomes[i] = sc.nextLine();
            
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a nota " + (j+1) + " do " + nomes[i] + ": ");
                notas[i][j] = Double.parseDouble(sc.nextLine());
            }
        }
        
        // Calcular média de cada aluno...
        double[] medias = new double[3];
        for (int i = 0; i < 3; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / 4;
        }
        
        // Encontrar aluno com maior e menor média..
        String alunoMaiorMedia = "";
        double maiorMedia = 0;
        String alunoMenorMedia = "";
        double menorMedia = Double.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                alunoMaiorMedia = nomes[i];
            }
            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
                alunoMenorMedia = nomes[i];
            }
        }
        
        // Imprimir todos resultados
        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i] + " - Média: " + medias[i]);
        }
        System.out.println("Aluno com a maior média: " + alunoMaiorMedia);
        System.out.println("Aluno com a menor média: " + alunoMenorMedia);
        
        sc.close();


	}

}
