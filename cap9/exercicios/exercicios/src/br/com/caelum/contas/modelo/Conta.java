package br.com.caelum.contas.modelo;

public class Conta {
    String agencia;
    int numero;
    String titular;
    double saldo;

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Conta(){

    }
    /**
     * @param agencia
     * @param numero
     * @param titular
     */
    public Conta(String agencia, int numero, String titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }
    public void setAgencia(String string) {
        this.agencia= string;
    }

    public void setNumero(int i) {
        this.numero= i;
    }

    public void setTitular(String string) {
        this.titular= string;
    }
    public String getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getTitular() {
        return this.titular;
    }
    public void deposita(double valorDigitado) {
        saldo += valorDigitado;
    }
    public void saca(double valorDigitado) {
        saldo -= valorDigitado;
    }
    public String getTipo() {
        return null;
    }

}
