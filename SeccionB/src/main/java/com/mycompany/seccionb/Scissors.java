package com.mycompany.seccionb;

/**
 *
 * @author HOME
 */
public class Scissors implements Throw{

    @Override
    public boolean validar(Throw elemento) {
        //valida si gana o pierde si es piedra o papel
        
        if(elemento instanceof Paper){
            return true;
        }else if(elemento instanceof Rock){
            return false;
        }
        
        return true;
    }
    
}
