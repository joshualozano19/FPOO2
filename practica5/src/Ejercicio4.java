import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int altura;
        System.out.println("Digite la altura del triangulo: ");
        altura = sc.nextInt();
        for(int i=1; i<=altura; i+=2){
            for(int j=i; j>=1; j-=2){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
