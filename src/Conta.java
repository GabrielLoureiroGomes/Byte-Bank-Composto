public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        System.out.println("Saldo insuficiente!");
        return false;
    }

    public boolean transferir(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        }
        System.out.println("Saldo insuficiente!");
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }
}