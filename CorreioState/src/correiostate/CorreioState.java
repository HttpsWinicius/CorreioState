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
public class CorreioState {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Correio correio = new Correio();
        correio.setPedido("NISSAN GT-R R35");
        
        System.out.println("Seu pedido " + correio.getPedido()
                + " foi " + correio.getNomeEstado()
                + " - " + correio.encaminhadoCentral());
        
        System.out.println("Seu pedido " + correio.getPedido()
                + " foi " + correio.getNomeEstado()
                + " - " + correio.entregue());
    }
    
}


