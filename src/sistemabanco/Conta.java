package sistemabanco;
public class Conta {
    private double saldo = 0;
    
    public void depositar(double valor) {
        if (valor > 0) {
        saldo += valor;
        } else {
        System.out.println("Valor inválido!");
        }
    }
    
    public void sacar(double valor) {
        if (valor <= 0) {
        System.out.println("Valor inválido!");
        } else if (valor <= saldo) {
        saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public double getSaldo() {
        return saldo;
    }
}