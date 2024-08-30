import javax.swing.JOptionPane;

public class punto_6 {
    public static void main(String[] args) {
        // Ingresar el tamaño del arreglo
        String sizeInput = JOptionPane.showInputDialog("Ingrese el número de elementos del arreglo:");
        int n = Integer.parseInt(sizeInput);

        // Declarar el arreglo
        int[] arreglo = new int[n];

        // Ingresar los elementos del arreglo
        for (int i = 0; i < n; i++) {
            String elementInput = JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1) + ":");
            arreglo[i] = Integer.parseInt(elementInput);
        }

        // Algoritmo de ordenamiento burbuja
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }

        // Preparar la salida del arreglo ordenado
        StringBuilder sortedArray = new StringBuilder("El arreglo ordenado es:\n");
        for (int num : arreglo) {
            sortedArray.append(num).append(" ");
        }

        // Mostrar el arreglo ordenado
        JOptionPane.showMessageDialog(null, sortedArray.toString());
    }
}
