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
public class CorreioEstadoEntregue implements CorreioEstado{
    
    public String getEstado() {
      return("Pedido entregue");
    }


    public String postado(Correio correio) {
        
        return("O pedido foi já entregue. Não pode ser postado.");
    }


    public String encaminhadoCentral(Correio correio) {
        
        return("O pedido foi já entregue. Não pode ser encaminhado para central.");
    }


    public String encaminhadoReginonal(Correio correio) {
        
        return("O pedido foi já entregue. Não pode ser encaminhado para regional.");
    }


    public String saiuEntrega(Correio correio) {
        
        return("O pedido foi já entregue. Não pode sair para entrega.");
    }


    public String entregue(Correio correio) {
        
         return("O pedido foi já entregue. Não pode ser entregue.");
    }
    
}
