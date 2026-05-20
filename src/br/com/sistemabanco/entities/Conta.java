package br.com.sistemabanco.entities;
public class Conta {
    private double saldo = 0;
    private int numeroConta;
    private String titularConta;
    private boolean temLimiteCredito = false;

    public int getNumeroConta(){
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public String getTitularConta(){
        return titularConta;
    }
    public void setTitularConta(String titularConta){
        this.titularConta = titularConta;
    }
    public void depositar(double valor) {
        if (valor > 0) {
        saldo += valor;
        if (saldo>=10000) temLimiteCredito = true;
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

    public String isTemLimiteCredito() {
        if (temLimiteCredito) return "Você possui limite de crédito";
        else return "Você não possui limite de crédito";
    }
}