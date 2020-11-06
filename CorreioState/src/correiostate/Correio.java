/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package correiostate;

/**
 *
 * @author winicius
 */
public class Correio {
    
    private String pedido;
    private CorreioEstado estado;
    

    public Correio() {
        this.estado = new CorreioEstadoPostado();
    }
    
    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public CorreioEstado getEstado() {
        return estado;
    }
    
    public void setEstado(CorreioEstado estado) {
        this.estado = estado;
    }
    
    
    public String postado() {
        return estado.postado(this);
    }
        
    public String encaminhadoCentral() {
        return estado.encaminhadoCentral(this);
    }
    
    public String encaminhadoReginonal() {
        return estado.encaminhadoReginonal(this);
    }
    
    public String saiuEntrega() {
        return estado.saiuEntrega(this);
    }
    
    public String entregue() {
        return estado.entregue(this);
    }
    
    public String getNomeEstado() {
        return estado.getEstado();
    }
    
}
