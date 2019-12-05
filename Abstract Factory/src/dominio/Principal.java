package dominio;

import dominio.loja.LojaRazer;
import dominio.modelo.Produto;
import dominio.venda.Venda;
import dominio.venda.VendaFactory;
import java.math.BigDecimal;



public class Principal {
      public static void main(String[] args) {
        
          
          Produto produto = new Produto();
          
          
          produto.setNome("Mouse Gamer DeathAdder Essential Razer");
          produto.setQuantidade(1);
          produto.setValorUnitario(new BigDecimal(250));
          
          VendaFactory factory = new LojaRazer();
          
          Venda venda = new Venda(factory);
          
          venda.realizarVenda(produto);
    }
}
