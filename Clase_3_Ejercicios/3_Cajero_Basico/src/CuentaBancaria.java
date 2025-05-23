public class CuentaBancaria {
    
    String titular;
    int saldo;

    public CuentaBancaria(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(int deposito) {
        this.saldo = saldo + deposito;
    }

    public void retirar(int retirada) {
        this.saldo = saldo + retirada;
    }

    public int consultarSaldo() {
        return this.saldo;
    }

}
