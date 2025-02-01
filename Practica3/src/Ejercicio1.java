import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas_trabajadas, pago_hr;
        double horas_trabajadas_total, pago_total;
        System.out.println("Ingrese horas trabajadas: ");
        horas_trabajadas = sc.nextInt();
        System.out.println("Ingrese el pago por hora: ");
        pago_hr = sc.nextInt();
        pago_total = pago_hr * horas_trabajadas;
        System.out.println("El pago total de horas trabajadas: " + pago_total);

    }
}
