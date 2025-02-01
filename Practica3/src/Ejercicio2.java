import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tu nombre completo por favor: ");
        String nombreCompleto = sc.nextLine();

        String minusculas = nombreCompleto.toLowerCase();
        String mayusculas = nombreCompleto.toUpperCase();
        String capitalizado = capitalizarPalabras(nombreCompleto);

        System.out.println("Nombre completo minusculas es: " + minusculas);
        System.out.println("Nombre completo mayusculas es: " + mayusculas);
        System.out.println("Nombre completo capitalizado es: " + capitalizado);
    }

    public static String capitalizarPalabras(String texto){
        String[] palabras = texto.toLowerCase().split(" ");
        StringBuilder resultado = new StringBuilder();

        for(String palabra : palabras) {
            if(!palabra.isEmpty()) {
                resultado.append(Character.toUpperCase(palabra.charAt(0))).append(palabra.substring(1)).append("");
            }
        }
        return resultado.toString().trim();
    }
}

