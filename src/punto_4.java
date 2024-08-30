import javax.swing.JOptionPane;

public class punto_4 {
    public static void main(String[] args) {
        // Solicitar base y altura del cuadrilátero
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura de la figura: "));
        int base = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la base de la figura: "));
       //recorrer la filas y columnas
        for (int i = 0; i < altura; i++) { //altura
            for (int j = 0; j < base; j++) { //base
            	
                // Imprime asteriscos en los bordes del cuadrilátero
                if (i == 0 || i == altura - 1) { // Primera y última fila
                    System.out.print("*");
                } else if (j == 0 || j == base - 1) { // Primera y última columna
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Salto de línea al terminar una columna
        }
    }
}
