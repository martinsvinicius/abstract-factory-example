package dominio.loja;

import dominio.boleto.Boleto;
import dominio.boleto.BoletoBancoBrasil;
import dominio.nfe.NFE;
import dominio.nfe.NFESaoPaulo;
import dominio.venda.VendaFactory;

public class LojaRazer implements VendaFactory{

    @Override
    public NFE criarNFE() {
        
        NFE notaFiscal = new NFESaoPaulo();
        
        return notaFiscal;
    }

    @Override
    public Boleto criarBoleto() {
        
        Boleto boleto = new BoletoBancoBrasil();
        
        return boleto;
    }
    
    
}
