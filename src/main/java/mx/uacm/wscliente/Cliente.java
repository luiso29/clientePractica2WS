/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.wscliente;

/**
 *
 * @author Profesor
 */
public class Cliente {
    
    public static void main(String[] args) {
        
        NumerosPrimosWS_Service servicio = new NumerosPrimosWS_Service();
        NumerosPrimosWS ws = servicio.getNumerosPrimosWSPort();
        
        System.out.println(ws.numerosPrimos(100));    
    }
    
}
