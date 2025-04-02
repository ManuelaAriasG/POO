public class cuentaBancaria {
    int numeroCuenta;
    double saldo;
    String titular;

    public cuentaBancaria(int numeroCuenta, double saldo, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(){
        System.out.println("Ha depositado un valor");
    }

    public void retirar(){
        System.out.println("Ha retirado un valor");
    }
}
