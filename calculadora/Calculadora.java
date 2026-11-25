package calculadora;

/**
 * Classe responsavel por realizar operacoes matematicas basicas
 * para o modulo de calculos financeiros do aplicativo FinancApp.
 *
 * @author Rodrigo Seishi Suzuki Kitazono
 * @version 2.0
 */
public class Calculadora {

    /**
     * Armazena o resultado da ultima operacao executada.
     */
    private int ultimoResultado = 0;

    /**
     * Executa uma operacao matematica basica entre dois numeros inteiros.
     *
     * @param primeiroOperando Primeiro valor inteiro da operacao.
     * @param segundoOperando  Segundo valor inteiro da operacao.
     * @param operador         Simbolo da operacao desejada ("+", "-", "*", "/").
     * @return O resultado inteiro da operacao, ou {@code 0} em caso de divisao por zero ou operador invalido.
     */
    public int calc(int primeiroOperando, int segundoOperando, String operador) {
        if (operador == null) {
            System.out.println("Erro: operacao nula nao permitida.");
            ultimoResultado = 0;
            return ultimoResultado;
        }

        switch (operador) {
            case "+":
                ultimoResultado = somar(primeiroOperando, segundoOperando);
                break;
            case "-":
                ultimoResultado = subtrair(primeiroOperando, segundoOperando);
                break;
            case "*":
                ultimoResultado = multiplicar(primeiroOperando, segundoOperando);
                break;
            case "/":
                ultimoResultado = dividir(primeiroOperando, segundoOperando);
                break;
            default:
                System.out.println("Erro: operacao invalida (" + operador + ")");
                ultimoResultado = 0;
                break;
        }

        System.out.println("Resultado = " + ultimoResultado);
        return ultimoResultado;
    }

    /**
     * Realiza a soma entre dois numeros inteiros.
     *
     * @param a Primeiro valor inteiro.
     * @param b Segundo valor inteiro.
     * @return A soma de {@code a} e {@code b}.
     */
    private int somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtracao entre dois numeros inteiros.
     *
     * @param a Primeiro valor inteiro (minuendo).
     * @param b Segundo valor inteiro (subtraendo).
     * @return A diferenca entre {@code a} e {@code b}.
     */
    private int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicacao entre dois numeros inteiros.
     *
     * @param a Primeiro fator inteiro.
     * @param b Segundo fator inteiro.
     * @return O produto de {@code a} por {@code b}.
     */
    private int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisao inteira entre dois numeros, tratando divisao por zero.
     *
     * @param dividendo Numero a ser dividido.
     * @param divisor   Numero pelo qual sera dividido.
     * @return O quociente inteiro da divisao, ou {@code 0} se o divisor for zero.
     */
    private int dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            System.out.println("Erro: divisao por zero, operacao irregular");
            return 0;
        }
        return dividendo / divisor;
    }

    /**
     * Retorna o resultado da ultima operacao realizada pela calculadora.
     *
     * @return O valor inteiro do ultimo resultado calculado.
     */
    public int getUltimoResultado() {
        return ultimoResultado;
    }
}
