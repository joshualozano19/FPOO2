import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

class Cuenta{
    private String numeroCuenta;
    private String titular;
    private int edad;
    private double saldo;

    public Cuenta(String numeroCuenta, String titular, int edad, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
    }

    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    public String getTitular(){
        return titular;
    }
    public double getsaldo() {
        return saldo;
    }
    public void ingresarEfectivo(double cantidad){
        if(cantidad > 0){
            saldo += cantidad;
            JOptionPane.showMessageDialog(null, "Se ha ingresado el efectivo $" + saldo);
        }else{
            JOptionPane.showMessageDialog(null,"Cantidad inválida");
        }
    }

    public void retirarEfectivo(double cantidad){
        if(cantidad>0 && cantidad <= saldo){
            saldo -= cantidad;
            JOptionPane.showMessageDialog(null,"Retiro exitoso. Saldo actual: $"+saldo);
        }
        else{
            JOptionPane.showMessageDialog(null,"Saldo insuficiente");
        }
    }

    public void depositarEnOtraCuenta(Cuenta otraCuenta, double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            otraCuenta.ingresarEfectivo(cantidad);
            JOptionPane.showMessageDialog(null, "Depósito exitoso a la cuenta" + otraCuenta.getNumeroCuenta());
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente o cuenta inválida");
        }
    }
}
public class Main{
    private static Map<String, Cuenta> cuentas = new HashMap<>();
    public static void main(String[] args) {
        cuentas.put("12520", new Cuenta("12520", "Teresa Chavez", 22, 1500000));
        cuentas.put("25890", new Cuenta("90178", "Arturo de la Barrera", 35, 5670900));
        while(true) {
            String numeroCuenta = JOptionPane.showInputDialog("Ingrese su numero de cuenta");
            if (cuentas.containsKey(numeroCuenta)) {
                Cuenta cuenta = cuentas.get(numeroCuenta);
                menuPrincipal(cuenta);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la cuenta");
            }
        }
    }

    public static void menuPrincipal(Cuenta cuenta) {
        while (true) {
            String opcion = JOptionPane.showInputDialog("Bienvenido " + cuenta.getTitular() + "\n" + "" +
                    "1. Cunsultar saldo\n" +
                    "2. Ingresar efectivo\n" +
                    "3. Retirar efectivo\n" +
                    "4. Depositar a otra cuenta\n" +
                    "5. Salir");

            switch (opcion) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Saldo actual: $" + cuenta.getsaldo());
                    break;
                case "2":
                    double ingreso = Double.parseDouble(JOptionPane.showInputDialog("Ingresar cantidad a depositar: "));
                    cuenta.ingresarEfectivo(ingreso);
                    break;
                case "3":
                    double retiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad que desea retirar: "));
                    cuenta.retirarEfectivo(retiro);
                    break;
                case "4":
                    String cuentaDestino = JOptionPane.showInputDialog("Ingrese el número de cuenta destino");
                    if (cuentas.containsKey(cuentaDestino)){
                        double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a transferir: "));
                        cuenta.depositarEnOtraCuenta(cuentas.get(cuentaDestino), monto);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No se encontró la cuenta destino");
                    }
                    break;
                case "5":
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }
    }
}