/**
 * (Opcional) Imprima os primeiros números da série de Fibonacci até passar de
 * 100. A série de
 * Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc. Para calculá-la, o
 * primeiro elemento vale 0, o
 * segundo vale 1, e daí por diante. O n-ésimo elemento vale o (n-1)-ésimo
 * elemento somado ao (n-2)-* ésimo elemento (ex: 8 = 5 + 3).
 */
 class Exercicio6 {
    public static void main(String[] args) {
        int fibonacci = 0;
        int fibonacci2 = 1;
        int resultado = 0;
        for (int n = 0; n < 100; n++) {
            fibonacci=fibonacci2;
            fibonacci2=resultado;
            resultado = fibonacci + fibonacci2 ;
        }
        System.out.println(resultado);
    }
}