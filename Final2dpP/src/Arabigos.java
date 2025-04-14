import javax.swing.JOptionPane;
public class Arabigos{
    private int Arabigos;
    public Arabigos(){
        this.Arabigos = Arabigos;
    }

    public void ArabigosRomanos(){
        Arabigos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero arabigo"));
        if(Arabigos<=0){
            JOptionPane.showInputDialog(null,"No se puede digitar 0 o números negativos");
        }else{
            switch(Arabigos){
                case 1:
                    JOptionPane.showInputDialog("I");
                    return;
                case 2: JOptionPane.showInputDialog("II");
                return;
                case 3: JOptionPane.showInputDialog("III");
                return;
                case 4: JOptionPane.showInputDialog("IV");
                return;
                case 5: JOptionPane.showInputDialog("V");
                return;
                case 6: JOptionPane.showInputDialog("VI");
                return;
                case 7: JOptionPane.showInputDialog("VII");
                return;
                case 8: JOptionPane.showInputDialog("VIII");
                return;
                case 9: JOptionPane.showInputDialog("IX");
                return;
                case 10: JOptionPane.showInputDialog("X");
                return;
                case 11: JOptionPane.showInputDialog("XI");
                return;
                case 12: JOptionPane.showInputDialog("XII");
                return;
                case 13: JOptionPane.showInputDialog("XIII");
                return;
                case 14: JOptionPane.showInputDialog("XIV");
                return;
                case 15: JOptionPane.showInputDialog("XV");
                return;
                case 16: JOptionPane.showInputDialog("XVI");
                return;
                case 17: JOptionPane.showInputDialog("XVII");
                return;
                case 18: JOptionPane.showInputDialog("XVII");
                return;
                case 19: JOptionPane.showInputDialog("XIX");
                return;
                case 20: JOptionPane.showInputDialog("XX");
                return;
                case 21: JOptionPane.showInputDialog("XXI");
                return;
                case 22: JOptionPane.showInputDialog("XXII");
                return;
                case 23: JOptionPane.showInputDialog("XXIII");
                return;
                case 24: JOptionPane.showInputDialog("XXIV");
                return;
                case 25: JOptionPane.showInputDialog("XXV");
                return;
                case 26: JOptionPane.showInputDialog("XXVI");
                return;
                case 27: JOptionPane.showInputDialog("XXVII");
                return;
                case 28: JOptionPane.showInputDialog("XXVIII");
                return;
                case 29: JOptionPane.showInputDialog("XXIX");
                return;
                case 30: JOptionPane.showInputDialog("XXX");
                return;
                case 31: JOptionPane.showInputDialog("XXXI");
                return;
                case 32: JOptionPane.showInputDialog("XXXII");
                return;
                case 33: JOptionPane.showInputDialog("XXXIII");
                return;
                case 34: JOptionPane.showInputDialog("XXXIV");
                return;
                case 35: JOptionPane.showInputDialog("XXXV");
                return;
                case 36: JOptionPane.showInputDialog("XXXVI");
                return;
                case 37: JOptionPane.showInputDialog("XXXVII");
                return;
                case 38: JOptionPane.showInputDialog("XXXVIII");
                return;
                case 39: JOptionPane.showInputDialog("XXXIX");
                return;
                case 40: JOptionPane.showInputDialog("XL");
                return;
                case 41: JOptionPane.showInputDialog("XLI");
                return;
                case 42: JOptionPane.showInputDialog("XLII");
                return;
                case 43: JOptionPane.showInputDialog("XLIII");
                return;
                case 44: JOptionPane.showInputDialog("XLIV");
                return;
                case 45: JOptionPane.showInputDialog("XLV");
                return;
                case 46: JOptionPane.showInputDialog("XLVI");
                return;
                case 47: JOptionPane.showInputDialog("XLVII");
                return;
                case 48: JOptionPane.showInputDialog("XLVIII");
                return;
                case 49: JOptionPane.showInputDialog("XLIX");
                return;
                case 50: JOptionPane.showInputDialog("L");
            }
        }
    }
}
