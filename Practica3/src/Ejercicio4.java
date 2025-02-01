import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        String nombreMayuscula = nombre.toUpperCase();
        int numeroletras = nombre.replace(" ", "").length();

        System.out.println(nombreMayuscula + " tiene " + numeroletras + " letras.");

    }
}
