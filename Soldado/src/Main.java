//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Spartan2 jefemaestro = new Spartan2("John",90,"Rifle de salto,",0);
        jefemaestro.mostrarInfo();
        jefemaestro.usarManejoAvanzado();
        jefemaestro.atacar("Convenant");
        jefemaestro.recibirDano(50);
        jefemaestro.recargarEscudo();

        Spartan3 noblesix  = new Spartan3("Benito Camelo",80,"Escudo",0);
        noblesix.mostrarInfo();
        noblesix.CamuflajeActivo();
        noblesix.atacar("Convenant");
        noblesix.recibirDano(50);
        noblesix.recargarEscudo();

        Spartan4 noble = new Spartan4("Carlos Cano",80,"Escudo",0);
        noble.mostrarInfo();
        noble.usarPropulsores();
        noble.atacar("Convenant");
        noble.recibirDano(50);
        noble.recargarEscudo();
    }
}