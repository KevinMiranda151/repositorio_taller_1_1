import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        // Llamar a todos los ejercicios
        ejercicio_1();
        ejercicio_2();
        ejercicio_3();
        ejercicio_4();
        ejercicio_5();
        ejercicio_6();
        ejercicio_7();
    }

    public static void ejercicio_1() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ejercicio 1: Ordenar tres números.\nIngresa el primer número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tercer número:"));

        int mayor, medio, menor;

        if (num1 > num2 && num1 > num3) {
            mayor = num1;
        } else if (num2 > num1 && num2 > num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        if (num1 < num2 && num1 < num3) {
            menor = num1;
        } else if (num2 < num1 && num2 < num3) {
            menor = num2;
        } else {
            menor = num3;
        }

        if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
            medio = num1;
        } else if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
            medio = num2;
        } else {
            medio = num3;
        }

        JOptionPane.showMessageDialog(null, "Ejercicio 1: Ordenar tres números.\nMayor: " + mayor + "\nMedio: " + medio + "\nMenor: " + menor);
    }

    public static void ejercicio_2() {
        String cadena = "fdsfbsjkdfsbssssdaaaqqaa";
        String subcadenaMaxima = encontrarSubcadenaUnica(cadena);
        JOptionPane.showMessageDialog(null, "Ejercicio 2: Subcadena única.\nLa subcadena más larga sin caracteres repetidos es: " + subcadenaMaxima);
    }

    public static String encontrarSubcadenaUnica(String s) {
        int longitudMaxima = 0;
        String subcadenaMaxima = "";

        for (int i = 0; i < s.length(); i++) {
            boolean[] caracteresVisitados = new boolean[256];
            StringBuilder subcadenaActual = new StringBuilder();

            for (int j = i; j < s.length(); j++) {
                char caracter = s.charAt(j);

                if (caracteresVisitados[caracter]) {
                    break;
                }

                caracteresVisitados[caracter] = true;
                subcadenaActual.append(caracter);
            }

            if (subcadenaActual.length() > longitudMaxima) {
                longitudMaxima = subcadenaActual.length();
                subcadenaMaxima = subcadenaActual.toString();
            }
        }

        return subcadenaMaxima;
    }

    public static void ejercicio_3() {
        int cantidadNumeros = Integer.parseInt(JOptionPane.showInputDialog("Ejercicio 3: Evaluar positivos, negativos y ceros.\nIngresa la cantidad de números a evaluar:"));

        int[] numeros = new int[cantidadNumeros];
        for (int i = 0; i < cantidadNumeros; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número " + (i + 1) + ":"));
        }

        int positivos = 0, negativos = 0, ceros = 0;

        for (int numero : numeros) {
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        float porcentajePositivos = ((float) positivos / cantidadNumeros) * 100;
        float porcentajeNegativos = ((float) negativos / cantidadNumeros) * 100;
        float porcentajeCeros = ((float) ceros / cantidadNumeros) * 100;

        String mensaje = "Ejercicio 3: Evaluar positivos, negativos y ceros.\nCantidad de números positivos: " + positivos + " (" + porcentajePositivos + "%)\n" +
                         "Cantidad de números negativos: " + negativos + " (" + porcentajeNegativos + "%)\n" +
                         "Cantidad de ceros: " + ceros + " (" + porcentajeCeros + "%)";
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void ejercicio_4() {
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Ejercicio 4: Dibujar un cuadrilátero.\nIngresa la altura de la figura:"));
        int base = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la base de la figura:"));

        StringBuilder figura = new StringBuilder();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    figura.append("*");
                } else {
                    figura.append(" ");
                }
            }
            figura.append("\n");
        }

        JOptionPane.showMessageDialog(null, "Ejercicio 4: Dibujar un cuadrilátero.\n" + figura.toString());
    }

    public static void ejercicio_5() {
        int[][] matrizUno = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matrizDos = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = matrizUno.length;

        int[][] resultado = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int espejoI = n - 1 - i;
                int espejoJ = n - 1 - j;
                resultado[i][j] = matrizUno[i][j] + matrizDos[espejoI][espejoJ];
            }
        }

        StringBuilder resultadoString = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultadoString.append(resultado[i][j]).append(" ");
            }
            resultadoString.append("\n");
        }

        JOptionPane.showMessageDialog(null, "Ejercicio 5: Suma de matrices espejos.\n" + resultadoString.toString());
    }
    public static void ejercicio_6() {
        
        String sizeInput = JOptionPane.showInputDialog("Ingrese el número de elementos del arreglo:");
        int n = Integer.parseInt(sizeInput);

      
        int[] arreglo = new int[n];

      
        for (int i = 0; i < n; i++) {
            String elementInput = JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1) + ":");
            arreglo[i] = Integer.parseInt(elementInput);
        }

       
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }

       
        StringBuilder sortedArray = new StringBuilder("El arreglo ordenado es:\n");
        for (int num : arreglo) {
            sortedArray.append(num).append(" ");
        }

        
        JOptionPane.showMessageDialog(null, sortedArray.toString());
    }
    public static void ejercicio_7() {
        int[] numeros = {1, 2, 3, 4, 5};
        int k = 2;

        rotarDerecha(numeros, k);

        StringBuilder resultado = new StringBuilder();
        for (int num : numeros) {
            resultado.append(num).append(" ");
        }

        JOptionPane.showMessageDialog(null, "Ejercicio 7: Rotación cíclica a la derecha.\n" +
                                          "Arreglo después de rotar " + k + " veces:\n" + resultado.toString());
    }public static void rotarDerecha(int[] numeros, int k) {
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
