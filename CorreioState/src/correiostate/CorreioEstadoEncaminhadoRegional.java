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
public class CorreioEstadoEncaminhadoRegional implements CorreioEstado {
    
   public String getEstado() {
      return("Encaminhado para reginonal");
    }


    public String postado(Correio correio) {
        
        return("O pedido foi encaminhado para regional. Não pode ser postado.");
    }


    public String encaminhadoCentral(Correio correio) {
        
        return("O pedido foi encaminhado para regional. Não pode ser encaminhado para central.");
    }


    public String encaminhadoReginonal(Correio correio) {
        
        return("O pedido já se encontra na regional");
    }


    public String saiuEntrega(Correio correio) {
        correio.setEstado(new CorreioEstadoSaiuEntrega());
        return("O pedido saiu para a entrega");
    }


    public String entregue(Correio correio) {
        
         return("O pedido está na regional. Não pode ser entregue.");
    }
    
}
