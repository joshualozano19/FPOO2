import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

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
            String opcion = JOptionPane.showInputDialog("Bienvenida " + cuenta.getTitular() + "\n" + "" +
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