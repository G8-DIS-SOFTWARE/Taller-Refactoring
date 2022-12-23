package com.mycompany.seccionb;

import java.util.ArrayList;

public class RPMGame {
    
    private static boolean juegoGanado;
    private static Player p1 = Player.getInstanceJ1();
    private static Player p2 = Player.getInstanceJ2();
    
    private static boolean isGanado(){
        if((p1.getWins()>=3) || (p2.getWins()>=3)){
            return true;
        }
        return false;  
    }
    
    public static void main(String[] args) {
        ArrayList<Player> jugadores = new ArrayList<>();
        jugadores.add(p1);
        jugadores.add(p2);
        do{
            Round.ronda(jugadores);
            Round.roundsPlayed ++;           
        }while(isGanado()); 
    }
    
}
