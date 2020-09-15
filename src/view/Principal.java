package view;
import java.util.Arrays;
import controller.Threads;
public class Principal {
	public static void main(String[] args) {
		
		int[][] mat = new int[3][5];
		
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<5; j++) {
				mat[i][j] = (int) (Math.random() * (100 - 1)+1);
			}
		}
		System.out.println("Matriz preenchida: " + Arrays.deepToString(mat) + "\n");
		
		for (int i = 0; i<3; i++) {
			int[] vet = new int[5];
			for (int j = 0; j<5; j++) {
				vet[j] = mat[i][j];
			}
			System.out.println("Vetor a ser itinerado: " + Arrays.toString(vet));
			Threads calcVet = new Threads(vet, i);
			calcVet.run();
		}	
	}
}
