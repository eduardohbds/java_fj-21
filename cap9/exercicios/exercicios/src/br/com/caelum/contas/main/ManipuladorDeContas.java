package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
    private Conta conta;

    public void criaConta(Evento evento) {
        String tipo = evento.getSelecionadoNoRadio("tipo");
        
        if (tipo.equals("Conta Corrente")) {
            conta = new ContaCorrente();
        } else {
            conta = new ContaPoupanca();
        }
        this.conta.setAgencia(evento.getString("agencia"));
        this.conta.setNumero(evento.getInt("numero"));
        this.conta.setTitular(evento.getString("titular"));
    }
    
    public void deposita(Evento evento) {
        double valorDigitado = evento.getDouble("valorOperacao");
        if	(this.conta.getTipo().equals("Conta Corrente")){

        }
        this.conta.deposita(valorDigitado);
    }
    
    public void saca(Evento evento) {
        double valorDigitado = evento.getDouble("valorOperacao");
        if	(this.conta.getTipo().equals("Conta Corrente")){
            this.conta.saca(valorDigitado + 0.10);
        }
        this.conta.saca(valorDigitado);
    }
}
