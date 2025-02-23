import java.util.Random;
import javax.swing.JOptionPane;

class PasswordsGenerador{
    private int length;
    private boolean includeUppercase;
    private boolean includeSpecial;
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIKJLMNOPQRSTUVWXYZ";
    private static final String SPECIAL = "!@#$%^&*()-_=+<>?";
    private static final String NUMBERS = "0123456789";

    public PasswordsGenerador(int length, boolean includeUppercase, boolean includeSpecial){
        this.length = this.length;
        this.includeUppercase = this.includeUppercase;
        this.includeSpecial = this.includeSpecial;
    }

    public String generatePassword(){
        String caracteres = LOWERCASE + NUMBERS;
        if(includeUppercase) caracteres += UPPERCASE;
        if(includeSpecial) caracteres += SPECIAL;

        Random rand = new Random();
        StringBuilder password = new StringBuilder();
        for(int i = 0; i < caracteres.length(); i++){
            password.append(caracteres.charAt(rand.nextInt(caracteres.length())));
        }
        return password.toString();
    }
    public static String checkStrength(String password){
        int score = 0;
        if(password.matches(".*[a-z].*")) score++;
        if(password.matches(".*[A-Z].*")) score++;
        if(password.matches(".*[0-9].*")) score++;
        if(password.matches(".*[!@#$^&*()-_=+<>?].*")) score++;

        return switch(score){
            case 4 -> "Fuerte";
            case 3 -> "Moderado";
            case 2 -> "Débil";
            default -> "Muy débil";
        };
    }
}

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
    }
}
