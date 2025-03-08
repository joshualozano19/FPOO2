import javax.swing.*;

public class Administrativo extends Empleado{
    private String Departamento;

    public Administrativo(String nombre, int id, double Salario, String Departamento){
        super(nombre, id, Salario);
        this.Departamento = Departamento;
    }

    @Override
    public void mostrarInfo(){
        JOptionPane.showMessageDialog(null, "Nombre: "+nombre+" \nID: "+id+" Salario: "+Salario+ "\nDepartamento: " + Departamento);
    }
}
