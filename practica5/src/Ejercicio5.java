import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char letra;
        String frase;
        int contador=0;
        System.out.println("Ingrese la frase: ");
        frase = sc.nextLine();
        System.out.println("Ingrese la letra: ");
        letra = sc.next().charAt(0);
        for(int i=0; i<frase.length(); i++){
            if(frase.charAt(i)==letra){
                contador++;
            }

        }
        System.out.println("La letra aparece "+contador+" Veces");
    }
}
