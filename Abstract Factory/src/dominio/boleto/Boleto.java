package dominio.boleto;

import dominio.modelo.Produto;

public interface Boleto {
    
    public void emitir(Produto produto, double imposto);
}
