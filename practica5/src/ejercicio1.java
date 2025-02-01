import java.util.Scanner;
public class ejercicio1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Digite un numero cualquiera: ");
        N = sc.nextInt();
        if(N<0){
            System.out.println("Numero invalido");
        }else{
            for(int i=1; i<=N; i+=2){
                System.out.print(i+", ");
            }
        }
    }
}
