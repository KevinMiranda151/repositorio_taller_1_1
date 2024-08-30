import javax.swing.JOptionPane;
public class punto_3 {
	public static void main(String[]args) {

		//solicita la cantidad de numeros a evaluar
		 int cantidadNumeros = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de números a evaluar: "));
		
		 //guardar lista
		 int [] numeros = new int[cantidadNumeros];
		 
		 for (int i = 0; i < cantidadNumeros; i++) {
			 numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa los números a evaluar: "));
			 
		 }
		 int positivos = 0;
		 int negativos = 0;
		 int ceros = 0;
		 
		 for (int numero : numeros) {
			 if (numero > 0) {
				 positivos++;
			 }else if(numero < 0){
				 negativos++;
			 }else{
				 ceros++;
				 
			 }
		 }
		 float porcentajePositivos =((float) positivos / cantidadNumeros)*100; 
		 float porcentajeNegativos =((float) negativos / cantidadNumeros)*100; 
		 float porcentajeCeros =((float) ceros / cantidadNumeros)*100; 
		// Muestra los resultados
		 String mensaje = "Cantidad de números positivos: " + positivos +" "+ porcentajePositivos+"%" + "\n" +
                 "Cantidad de números negativos: " + negativos + " "+ porcentajeNegativos+"%" + "\n" +
                 "Cantidad de ceros: " + ceros +" "+ porcentajeCeros+"%";
		 JOptionPane.showInputDialog(mensaje);
	
		 
		
				
	}
	
}
