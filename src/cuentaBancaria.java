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
        System.out.println (titular + " Ha depositado un valor en su cuenta: " + numeroCuenta);
    }

    public void retirar(){
        System.out.println (titular + " Ha retirado un valor en su cuenta: " + numeroCuenta);
    }
}
