/**
 * 5. No código do exercício anterior, aumente a quantidade de números que terão
 * os fatoriais impressos
 * até 20, 30 e 40. Em um determinado momento, além de esse cálculo demorar,
 * começará a mostrar
 * respostas completamente erradas. Por quê?
 */

class Exercicio5 {
    public static void main(String[] args) {
        long fatorial = 1;
        for (int n = 1; n <= 30; n++) {
            fatorial = fatorial * n;
        }
        System.out.println(fatorial);
    }
}