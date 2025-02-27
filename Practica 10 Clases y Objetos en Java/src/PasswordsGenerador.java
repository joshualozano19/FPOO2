import java.util.Random;

public class PasswordsGenerador{
    private int length;
    private boolean includeUppercase;
    private boolean includeSpecial;
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIKJLMNOPQRSTUVWXYZ";
    private static final String SPECIAL = "!@#$%^&*()-_=+<>?";
    private static final String NUMBERS = "0123456789";

    public PasswordsGenerador(int length, boolean includeUppercase, boolean includeSpecial){
        this.length = length;
        this.includeUppercase = includeUppercase;
        this.includeSpecial = includeSpecial;
    }

    public int getLength(){
        return length;
    }

    public boolean getIncludeUppercase(){
        return includeUppercase;
    }
    public boolean getIncludeSpecial(){
        return includeSpecial;
    }

    public String MostrarPassword(PasswordsGenerador passwordsGenerador){
        return passwordsGenerador.toString();
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
