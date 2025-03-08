import javax.swing.*;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static ArrayList<Empleado>empleados = new ArrayList<>();
    public static void main(String[] args) {
        while(true){
            String[] opciones = {"Agregar Empleado", "Listar empleados, ","Salir"};
            int opcion = JOptionPane.showOptionDialog(null,"Seleccione una opcion: ","Gestión de Empleados",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opciones,opciones[0]);
            switch(opcion){
                case 0:
                    agregarEmpleado();
                    break;
                    case 1:
                        listarEmpleados();
                        break;
                        case 2:
                            System.exit(0);
                            break;
                            default:
                                break;
            }
        }
    }

    private static void agregarEmpleado(){
        String[] tipos = {"Conductor", "Administrativo"};
        int tipo = JOptionPane.showOptionDialog(null, "Seleccione el tipo de empleado:", "Tipo de Empleado",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tipos, tipos[0]);

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado:"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));

        if (tipo == 0) { // Conductor
            String licencia = JOptionPane.showInputDialog("Ingrese el tipo de licencia:");
            empleados.add(new Conductor(nombre, id, salario, licencia));
        } else if (tipo == 1) { // Administrativo
            String departamento = JOptionPane.showInputDialog("Ingrese el departamento:");
            empleados.add(new Administrativo(nombre, id, salario, departamento));
        }
    }

    private static void listarEmpleados() {
        if (empleados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
        } else {
            for (Empleado e : empleados) {
                e.mostrarInfo();
            }
        }
    }
}