public class Spartan2 extends Spartan{
    public Spartan2(String nombre, int salud, String arma, int escudo){
        super(nombre,salud,arma,150);
    }
    public void usarManejoAvanzado(){
        System.out.println(nombre+" Usa tacticas avanzadas y cuenta con mas escudos: ");
    }
}
