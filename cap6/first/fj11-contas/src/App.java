public class App {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();
        conta.deposita(100.0);
        System.out.println(conta.getSaldo());
        
    }
}
