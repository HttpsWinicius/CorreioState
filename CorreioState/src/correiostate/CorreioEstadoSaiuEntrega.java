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
public class CorreioEstadoSaiuEntrega implements CorreioEstado {
    
   public String getEstado() {
      return("Saiu para entrega");
    }


    public String postado(Correio correio) {
        
        return("O pedido saiu para entrega. Não pode ser postado.");
    }


    public String encaminhadoCentral(Correio correio) {
        
        return("O pedido saiu para entrega. Não pode ser encaminhado para central.");
    }


    public String encaminhadoReginonal(Correio correio) {
        
        return("O pedido saiu para entrega. Não pode ser encaminhado para regional.");
    }


    public String saiuEntrega(Correio correio) {
        
        return("O pedido já saiu para entrega. Não pode sair para entrega");
    }


    public String entregue(Correio correio) {
        correio.setEstado(new CorreioEstadoEntregue());
         return("O pedido foi entregue.");
    }
    
}
