import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();
        if(numero < 0){
            System.out.println("El numero no puede ser negativo, digite otro numero");
        }else{
            for(int i=numero; i>=0; i--){
                System.out.print(i+", ");
            }
        }
    }
}
