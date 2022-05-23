
/**
 * InnerConta
 */
class Data {
    int dia;
    int mes;
    int ano;
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public Data() {
        this.dia = 00;
        this.mes = 00;
        this.ano = 0000;
    }

    void dataFormatada(){
        System.out.println("Data: " + dia + "/" + mes + "/" + ano);

    }


    
}
public class Conta {
    private static int id;
    private String nome;
    private double saldo;
    private Data dataDeAbertura; // qual é o valor default aqui?
    
    public Conta(String nome, double saldo, Data dataDeAbertura) {
        Conta.id = Conta.id + 1;
        this.nome = nome;
        this.saldo = saldo;
        this.dataDeAbertura = dataDeAbertura;
    }
    public Conta( double saldo, Data dataDeAbertura) {
        Conta.id = Conta.id + 1;
        this.saldo = saldo;
        this.dataDeAbertura = dataDeAbertura;
    }
    public Conta(){

    }

    public int getId() {
        return Conta.id;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getNome() {
        return this.nome;
    }

    public void getDataDeAbertura() {
        this.dataDeAbertura.dataFormatada();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    double deposita(double valor) {
        this.saldo += valor;
        return this.saldo;
    }

    double getRendimento() {
        return this.saldo * 0.1;
    }

    boolean transfere(Conta destino, double valor) {
        boolean retirou = this.saca(valor);
        // if (retirou == false) {
        // // não deu pra sacar!
        // return false;
        // } else {
        // destino.deposita(valor);
        // return true;
        // }
        if (retirou) {
            destino.deposita(valor);
            return retirou;
        }
        return false;
    }

    void recuperaDadosParaImpressao() {
        System.out.println("Id: " + getId());
        System.out.println("NOME: " + getNome());
        System.out.println("SALDO: " + "R$" + getSaldo());
        System.out.println("DIA: "+ this.dataDeAbertura.dia);
        System.out.println("MES: "+ this.dataDeAbertura.mes);
        System.out.println("ANO: "+ this.dataDeAbertura.ano);

    }
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.nome = "Danilo";
        c1.saldo = 100;
        Conta c2 = new Conta();
        c2.nome = "Danilo";
        c2.saldo = 100;
        if (c1 == c2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
    }
}
