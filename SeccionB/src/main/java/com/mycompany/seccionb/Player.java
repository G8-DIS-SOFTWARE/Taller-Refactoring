package com.mycompany.seccionb;

public class Player {

    private int wins;
    
    private static Player j1;
    private static Player j2;
    
    public static Player getInstanceJ1(){
        return j1;
    }
    
    public static Player getInstanceJ2(){
        return j2;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
    
    public Throw getChoice(){
        Throw choice = null;
        int c = (int)(Math.random()*3);
        switch(c){
            case 0:
                choice = new Rock();
                break;
            case 1:
                choice = new Paper();
                break;
            case 2:
                choice = new Scissors();
                break;
        }
        return choice;
        
    }
}
