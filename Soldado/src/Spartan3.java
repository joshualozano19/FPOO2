public class Spartan3 extends Spartan{
    public Spartan3(String nombre, int salud, String arma, int escudo){
        super(nombre,salud,arma,80);
    }

    public void CamuflajeActivo(){
        System.out.println(nombre+" Camuflaje activo para volverse invisible: ");
    }
}
