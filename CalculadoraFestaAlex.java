package tarefa_poo;

/**
 *
 * @author Tawan Rodrigues
 */
public class CalculadoraFestaAlex {
    

    private static final double VALOR_IMPOSTO = 0.05;
    private static final double VALOR_GORJETA = 0.15;
    public static double valor_unitario = 0;
    
    void encontrarTotalAPagar(double valor) {
        valor_unitario= valor * (1 + VALOR_IMPOSTO + VALOR_GORJETA);
        System.out.println("person: $" +valor_unitario);
    }

    void encontrarTotalAPagar(int valor) {
        valor_unitario= valor * (1 + VALOR_IMPOSTO + VALOR_GORJETA);
        System.out.println("person: $" +valor_unitario );
    }

    void encontrarTotalAPagar(int valor, double valorImposto) {
        valor_unitario=valor * (1 + valorImposto + VALOR_GORJETA);
        System.out.println("person: $" +valor_unitario );
    }

    void encontrarTotalAPagar(double valor, double valorImposto) {
        valor_unitario=valor * (1 + valorImposto + VALOR_GORJETA);
        System.out.println("person: $" +valor_unitario );
    }
}

    
}
