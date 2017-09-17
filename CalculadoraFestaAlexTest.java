package tarefa_poo;

/**
 *
 * @author Tawan Rodrigues
 */
public class CalculadoraFestaAlexTest {

    public static void main(String[] args) {
        CalculadoraFestaAlex galas = new CalculadoraFestaAlex();
        CalculadoraFestaAlex tawan = new CalculadoraFestaAlex();
        CalculadoraFestaAlex eric = new CalculadoraFestaAlex();
       
        double soma =0;
        
        galas.encontrarTotalAPagar(1000);
        soma = soma + CalculadoraFestaAlex.valor_unitario;
        
        tawan.encontrarTotalAPagar(2000, 0.05);
        soma = soma + CalculadoraFestaAlex.valor_unitario;
        
        eric.encontrarTotalAPagar(1000.2, 0.4);
        soma = soma + CalculadoraFestaAlex.valor_unitario;
        
        //imprimir o total
        System.out.printf("Valor Total: R$ %.2f\n",soma);

    }
    
}
