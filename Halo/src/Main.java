import javax.xml.crypto.dsig.spec.HMACParameterSpec;
public class Main {
    public static void main(String[] args) {
        // CREACIÓN DEL PRIMER OBJETO
        Spartan MasterChief = new Spartan("John", 100, 75, true);

        // INVOCACIÓN DE MÉTODOS
        MasterChief.mostrarInfo();
        MasterChief.atacar("Grunt");
        MasterChief.recargarArma(75);
        MasterChief.correr(true);

        //Intento de uso de un metodo Provado
        //MasterChief.consultarCortana();


        MasterChief.setNombre("Ivan Isay");
        MasterChief.mostrarInfo();
        System.out.println("Nuevo nombre: " + MasterChief.getNombre());

        // CREACIÓN DEL SEGUNDO OBJETO (corregido)
        Spartan NobleSix = new Spartan("Noble Six", 150, 20, true); // Se usó boolean en lugar de String

        // INVOCACIÓN DE MÉTODOS
        NobleSix.mostrarInfo();
        NobleSix.atacar("Grunt");
        NobleSix.recargarArma(10);
        NobleSix.correr(false);
    }
}