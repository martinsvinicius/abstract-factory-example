package dominio.boleto;

import dominio.modelo.Produto;


public class BoletoBancoBrasil implements Boleto{

    @Override
    public void emitir(Produto produto, double imposto) {
        System.out.println("BANDO DO BRASIL");
        System.out.println("======================================================================");
        System.out.println("Descrição: " + produto.getNome());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Valor: R$ " + produto.getValorUnitario());
        System.out.println("Imposto: R$ " + imposto);
        System.out.println("Valor total: R$ " + produto.getValorTotal(imposto));
    }
    
}
