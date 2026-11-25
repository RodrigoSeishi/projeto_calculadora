package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("=== INICIANDO TESTES UNITARIOS (FINANCAPP) ===\n");

        // 1. Teste de Soma
        executarTeste("Soma (10 + 5)", 15, calc.calc(10, 5, "+"));

        // 2. Teste de Subtracao
        executarTeste("Subtracao (10 - 4)", 6, calc.calc(10, 4, "-"));

        // 3. Teste de Multiplicacao
        executarTeste("Multiplicacao (6 * 7)", 42, calc.calc(6, 7, "*"));

        // 4. Teste de Divisao
        executarTeste("Divisao (20 / 4)", 5, calc.calc(20, 4, "/"));

        // 5. Teste de Divisao por Zero
        executarTeste("Divisao por Zero (10 / 0)", 0, calc.calc(10, 0, "/"));

        // 6. Teste de Operacao Invalida
        executarTeste("Operacao Invalida (10 % 3)", 0, calc.calc(10, 3, "%"));

        System.out.println("\n=== TESTES FINALIZADOS ===");
    }

    private static void executarTeste(String cenario, int esperado, int obtido) {
        String status = (esperado == obtido) ? "SUCESSO" : "FALHA";
        System.out.println("Cenario: " + cenario);
        System.out.println("Entrada/Resultado Esperado: " + esperado + " | Resultado Obtido: " + obtido + " -> [" + status + "]");
        System.out.println("--------------------------------------------------");
    }
}
