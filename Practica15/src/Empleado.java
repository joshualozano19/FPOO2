import javax.swing.JOptionPane;
import javax.swing.*;
public class Empleado {
    protected String nombre;
    protected int id;
    protected double Salario;
    public Empelado(String nombre, int id, double salario){
        this.nombre = nombre;
        this.id = id;
        this.Salario = salario;
    }

    public Empleado(String nombre, int id, double salario) {
    }

    public void mostrarInfo(){
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nId: " + id + "\nSalario: " + Salario);
    }
}
