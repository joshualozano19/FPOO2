import java.util.Random;
import javax.swing.JOptionPane;
public class Main{
    public static void main(String[] args){
        String inputLength = JOptionPane.showInputDialog("Ingrese la longitud del password (mínimo 8, por defecto 8):");
        int length = (inputLength != null && inputLength.matches("\\d+")) ? Integer.parseInt(inputLength) : 8;
        length = Math.max(length, 8);

        int includeUppercaseOption = JOptionPane.showConfirmDialog(null,"¿Incluir mayúsculas?", "Opciones", JOptionPane.YES_NO_OPTION);
        boolean includeUppercase = (includeUppercaseOption == JOptionPane.YES_OPTION);

        int includeSpecialOption = JOptionPane.showConfirmDialog(null,"¿Incluir carcateres especiales","Opciones",JOptionPane.YES_NO_OPTION);
        boolean includeSpecial = (includeSpecialOption == JOptionPane.YES_OPTION);

        PasswordsGenerador generador = new PasswordsGenerador(length, includeUppercase, includeSpecial);
        String password = generador.generatePassword();
        JOptionPane.showMessageDialog(null, "Password generado: "+PasswordsGenerador.checkStrength(password));
        JOptionPane.showMessageDialog(null,"El password es: "+password);
    }
}
