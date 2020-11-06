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
public interface CorreioEstado {
    
    public String getEstado();
    
    public String postado(Correio correio);
    public String encaminhadoCentral(Correio correio);
    public String encaminhadoReginonal(Correio correio);
    public String saiuEntrega(Correio correio);
    public String entregue(Correio correio);
    
    
}
