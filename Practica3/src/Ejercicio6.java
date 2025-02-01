import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, fraseInvertida = "";
        System.out.println("Ingrese una frase: ");
        frase = sc.nextLine();
        for(int i=frase.length()-1; i>=0; i--) {
            fraseInvertida += frase.charAt(i);
        }
        System.out.println("La frase invertida es: " + fraseInvertida);
        
    }
}
