package com.mycompany.seccionb;

/**
 *
 * @author HOME
 */
public class Rock implements Throw {
    public boolean validar(Throw elemento) {
        // valida si el juego gana o pierde si es papel o tijera
        
        if(elemento instanceof Paper){
            return false;
        }else if(elemento instanceof Scissors){
            return true;
        }
        
        return true;
    }
}
