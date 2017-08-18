package br.edu.ifpi.capar.poo.oracle.academy.exemplos;

import java.math.BigDecimal;

/**
 *
 * @author Tawan Rodrigues
 */
class Cliente {

    //propriedades
    String nome;
    String cpf;
    String rg;
    int idade;
    String nomePai;
    String nomeMae;
    BigDecimal dinheiro;
    boolean cartaoLoja;
    CartaoCredito cartaoCredito;
    boolean spc;
    boolean serasa;
    Dividas dividas;
    boolean carne;
    
    //comportamentos
    compraRealizada();

    escolherProduto();

    pedirDesconto();

    fazerDivida();

    pagar();

    experimentar();

    fazerCartao();

    pedirGarantia();
    
    trocarProduto();
    
    pedirDesconto();
    
    cancelarCompra();

   
}
