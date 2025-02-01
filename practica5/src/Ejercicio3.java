import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, tabla=0;
        System.out.println("Dime un numero: ");
        n = sc.nextInt();
        for(int i=1; i<=10; i++){
            tabla = n*i;
            System.out.println(n+" * "+i+" = "+tabla);
        }
    }
}
