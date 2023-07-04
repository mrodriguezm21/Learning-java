public abstract class Cuenta {
    protected double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente();

    public Cuenta() {
    }

    public Cuenta (int agencia, int numero){
        this.agencia= agencia;
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void depositar(double monto) ;
    public boolean retirar(double monto){
        if (monto <= this.saldo){
        this.saldo -= monto;
        return true;
        } else {
            return false;
        }

    }  public boolean trasnferir(double monto, Cuenta destino){
        if (monto <= this.saldo){
        this.saldo -= monto;
        destino.depositar(monto);
        return true;
        } else {
            return false;
        }

    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

}
