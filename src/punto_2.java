
public class punto_2 {
    public static void main(String[] args) {
       
        String cadena = "fdsfbsjkdfsbssssdaaaqqaa";
        String subcadenaMaxima = encontrarSubcadenaUnica(cadena);
        System.out.println("La subcadena más larga sin caracteres repetidos es: " + subcadenaMaxima);
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
}
