
public class punto_7 {
	public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.println("Arreglo original:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        rotarDerecha(numeros, k);

        System.out.println("\n\nArreglo después de rotación cíclica a la derecha " + k + " veces:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
 public static void rotarDerecha(int[] numeros, int k) {
        int n = numeros.length;
        
        k = k % n;


        for (int i = 0; i < k; i++) {
            
            int ultimo = numeros[n - 1];
         
            for (int j = n - 1; j > 0; j--) {
                numeros[j] = numeros[j - 1];
            }
        
            numeros[0] = ultimo;
        }
    }

}
