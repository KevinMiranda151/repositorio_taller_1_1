import javax.swing.JOptionPane;

public class punto_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tercer número:"));

        int mayor, medio, menor;

        // Determinar cuál es el mayor
        if (num1 > num2 && num1 > num3) {
            mayor = num1;
        } else if (num2 > num1 && num2 > num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        // Determinar cuál es el menor
        if (num1 < num2 && num1 < num3) {
            menor = num1;
        } else if (num2 < num1 && num2 < num3) {
            menor = num2;
        } else {
            menor = num3;
        }

        // Determinar cuál es el del medio
        if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
            medio = num1;
        } else if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
            medio = num2;
        } else {
            medio = num3;
        }

        // Mostrar los resultados
        JOptionPane.showMessageDialog(null, "Mayor: " + mayor + "\nMedio: " + medio + "\nMenor: " + menor);
	}

}
