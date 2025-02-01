import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, suma = 0;
        System.out.print("Ingrese el numero de n: ");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            suma += i;
            System.out.println(suma);

        }
        System.out.println("La suma de todos los numeros desde 1 hasta n es: "+suma);
    }
}
