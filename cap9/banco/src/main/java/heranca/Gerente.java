package heranca;
public class Gerente extends Funcionario{

    private int senha;
    private int numeroDeFuncionariosGerenciados;
    public Gerente(int senha, int numeroDeFuncionariosGerenciados) {
        this.senha = senha;
        this.setNumeroDeFuncionariosGerenciados(numeroDeFuncionariosGerenciados);
    }
    public Gerente() {
    }
    public int getSenha() {
        return this.senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    @Override
    public double getBonificacao() {
        return super.getBonificacao() + 1000;
    }
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }    
}