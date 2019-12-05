package dominio.venda;

import dominio.boleto.Boleto;
import dominio.nfe.NFE;


public interface VendaFactory {
    
    public NFE criarNFE();
    
    public Boleto criarBoleto();

    
     
}
