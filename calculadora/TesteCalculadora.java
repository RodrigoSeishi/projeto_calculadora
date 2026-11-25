package calculadora;

/**
 * Classe de testes unitarios para validacao das operacoes matematicas
 * e tratamentos de erro da classe {@link Calculadora}.
 *
 * @author Rodrigo Seishi Suzuki Kitazono
 * @version 2.0
 */
public class TesteCalculadora {

    /**
     * Ponto de entrada para execucao da suite de testes unitarios no console.
     *
     * @param args Argumentos de linha de comando (nao utilizados).
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("=== INICIANDO TESTES UNITARIOS POS-REFATORACAO (FINANCAPP) ===\n");

        // 1. Teste de Soma
        executarTeste("Soma (10 + 5)", 15, calculadora.calc(10, 5, "+"));

        // 2. Teste de Subtracao
        executarTeste("Subtracao (10 - 4)", 6, calculadora.calc(10, 4, "-"));

        // 3. Teste de Multiplicacao
        executarTeste("Multiplicacao (6 * 7)", 42, calculadora.calc(6, 7, "*"));

        // 4. Teste de Divisao
        executarTeste("Divisao (20 / 4)", 5, calculadora.calc(20, 4, "/"));

        // 5. Teste de Divisao por Zero
        executarTeste("Divisao por Zero (10 / 0)", 0, calculadora.calc(10, 0, "/"));

        // 6. Teste de Operacao Invalida
        executarTeste("Operacao Invalida (10 % 3)", 0, calculadora.calc(10, 3, "%"));

        System.out.println("\n=== TESTES FINALIZADOS ===");
    }

    /**
     * Compara o resultado esperado com o valor obtido pela calculadora e imprime o diagnostico.
     *
     * @param cenario  Descricao do caso de teste executado.
     * @param esperado Valor inteiro esperado para a operacao.
     * @param obtido   Valor inteiro retornado pela classe {@link Calculadora}.
     */
    private static void executarTeste(String cenario, int esperado, int obtido) {
        String status = (esperado == obtido) ? "SUCESSO" : "FALHA";
        System.out.println("Cenario: " + cenario);
        System.out.println("Entrada/Resultado Esperado: " + esperado + " | Resultado Obtido: " + obtido + " -> [" + status + "]");
        System.out.println("--------------------------------------------------");
    }
}
