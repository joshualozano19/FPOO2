import javax.swing.*;

public class Conductor extends Empleado{
    private String Licencia;

    public Conductor(String nombre, int id, double salario, String licencia){
        super(nombre, id, salario);
        this.Licencia = licencia;
    }

    @Override
    public void mostrarInfo(){
        JOptionPane.showMessageDialog(null, "Nombre: "+nombre+"\nID: "+id+"\nSalario: "+Salario+"\nLicencia: "+Licencia);
    }

}
