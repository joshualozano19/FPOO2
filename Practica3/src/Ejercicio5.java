import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int payasos, muñecas, peso_payasos = 112, peso_muñecas = 75;
        double peso_total_payasos, peso_total_muñecas;
        System.out.println("Digite la cantidad de payasos: ");
        payasos = sc.nextInt();
        System.out.println("Digite la cantidad de muñecas: ");
        muñecas = sc.nextInt();

        peso_total_payasos = peso_payasos * payasos;
        peso_total_muñecas = peso_muñecas * muñecas;

        System.out.println("El peso total de los payasos es: " + peso_total_payasos);
        System.out.println("El peso total de las muñecas es: " + peso_total_muñecas);
    }
}
