package com.mycompany.seccionb;

/**
 *
 * @author HOME
 */
public class Paper implements Throw{

    @Override
    public boolean validar(Throw elemento) {
        // valida si gana o pierde si es tijera o piedra
        
        if(elemento instanceof Rock){
            return true;
        }else if(elemento instanceof Scissors){
            return false;
        }
        
        return true;
    }
    
    
    
}
