package com.mycompany.seccionb;

import java.util.ArrayList;

public class Round {

    public static int roundsPlayed;
    public static int draw;

    public static void ronda(ArrayList<Player> jugadores){
        
        Player j1 = jugadores.get(0);
        Player j2 = jugadores.get(1);
        
        imprimirRonda(roundsPlayed);
        imprimirIntentos(draw);
        Throw juego1 = j1.getChoice();
        Throw juego2 = j2.getChoice();
        
        boolean estadoJuego = juego1.validar(juego2);
        
        if(estadoJuego){
            int wins1 = j1.getWins();
            j1.setWins(wins1++);
        }else{
            int wins2 = j2.getWins();
            j2.setWins(wins2++);
        }
        
    }

    public static void imprimirRonda(int roundsPlayed){
        System.out.println("Rondas:" + roundsPlayed);
    }
    
    public static void imprimirIntentos(int draw){
        System.out.println("Intentos:" + draw);
    }
    
    public static int getIntentos(ArrayList<Player> jugadores){
        
        int draw = 0;
        Player j1 = jugadores.get(0);
        Player j2 = jugadores.get(1);
       
        if(j1.getChoice().equals(j2.getChoice())){
            draw++;
            return draw;
        }
        return draw;
    }
    
    
}
