
public class punto_5 {
	public static void main(String[]args) {
		
		int [][] matrizUno = {
		    {1, 2, 3},
		    {4, 5, 6},
		    {7, 8, 9}
		};
		int [][] matrizDos = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9}
		};
		int n = matrizUno.length;
		
		int[][] resultado = new int[n][n];
			
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
		
		int espejoI = n-1-i;
		int espejoJ = n-1-j;
			resultado[i][j]= matrizUno[i][j] + matrizDos[espejoI][espejoJ];
		
		}
	}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				  System.out.print(resultado[i][j] + " ");
				  
			}
			System.out.println();
		}
	}
}