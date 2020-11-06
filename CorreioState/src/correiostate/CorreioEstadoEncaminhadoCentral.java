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
public class CorreioEstadoEncaminhadoCentral implements CorreioEstado {

    public String getEstado() {
        return("Encaminhado para central");
    }


    public String postado(Correio correio) {
        return("O pedido já foi encaminhado para central. Não pode ser postado.");
    }


    public String encaminhadoCentral(Correio correio) {
        
        return("O pedido já se encontra na central");
    }


    public String encaminhadoReginonal(Correio correio) {
        correio.setEstado(new CorreioEstadoEncaminhadoRegional());
        return("O pedido foi encaminhado para reginonal.");
    }


    public String saiuEntrega(Correio correio) {
        
        return("O pedido já foi encaminhado para central. Não pode sair para entrega.");
    }


    public String entregue(Correio correio) {
        
        return("O pedido está na central. Não pode ser entregue.");
    }
    
}
