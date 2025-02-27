import javax.swing.*;

public class Cuenta {
    private String numeroCuenta;
    private String titular;
    private int edad;
    private double saldo;

    public Cuenta(String numeroCuenta, String titular, int edad, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
    }

    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    public String getTitular(){
        return titular;
    }
    public int getEdad(){
        return edad;
    }
    public double getsaldo() {
        return saldo;
    }

    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setEdad(int edad){
        if(edad>0) {
            this.edad = edad;
        }
    }
    public void setsaldo(double saldo){
        if(saldo>0) {
            this.saldo = saldo;
        }
    }
    public void ingresarEfectivo(double cantidad){
        if(cantidad > 0){
            saldo += cantidad;
            JOptionPane.showMessageDialog(null, "Se ha ingresado el efectivo $" + saldo);
        }else{
            JOptionPane.showMessageDialog(null,"Cantidad inválida");
        }
    }

    public void retirarEfectivo(double cantidad){
        if(cantidad>0 && cantidad <= saldo){
            saldo -= cantidad;
            JOptionPane.showMessageDialog(null,"Retiro exitoso. Saldo actual: $"+saldo);
        }
        else{
            JOptionPane.showMessageDialog(null,"Saldo insuficiente");
        }
    }

    public void depositarEnOtraCuenta(Cuenta otraCuenta, double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            otraCuenta.ingresarEfectivo(cantidad);
            JOptionPane.showMessageDialog(null, "Depósito exitoso a la cuenta" + otraCuenta.getNumeroCuenta());
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente o cuenta inválida");
        }
    }

}
