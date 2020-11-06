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
public class CorreioEstadoPostado implements CorreioEstado {
    
    public String getEstado() {
      return("Postado");
    }


    public String postado(Correio correio) {
        
        return("O pedido já foi postado. Não pode ser postado.");
    }


    public String encaminhadoCentral(Correio correio) {
        correio.setEstado(new CorreioEstadoEncaminhadoCentral());
        return("O pedido está sendo encaminhado para a central.");
    }


    public String encaminhadoReginonal(Correio correio) {
        
        return("O pedido está postado. Não pode ser encaminhado para regional.");
    }


    public String saiuEntrega(Correio correio) {
        
        return("O pedido está postado. Não pode sair para entrega");
    }


    public String entregue(Correio correio) {
        
         return("O pedido está postado. Não pode ser entregue.");
    }
    
}
