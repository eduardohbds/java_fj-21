/**
 * (Opcional) Escreva um programa em que, dada uma variável x com algum valor
 * inteiro, temos um novo x de acordo com a seguinte regra:
 * Se x é par, x = x / 2 ;
 * Se x é impar, x = 3 * x + 1 ;
 * Imprime x ;
 * Se x é par, x = x / 2 ;
 * Se x é impar, x = 3 * x + 1 ;
 * Imprime x ;
 */
class Exercicio7 {
    public static void main(String[] args) {
        int x = 13;
        while (x!=1) {
            if (x%2==0) {
                x = x / 2;
            }else{
                x = 3 * x + 1;
            }
            System.out.print(x + "->");
        }
    }
}