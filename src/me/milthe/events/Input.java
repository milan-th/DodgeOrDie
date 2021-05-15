package me.milthe.events;

import javafx.scene.input.KeyCode;

public class Input {
    public boolean[] pressed;

    public Input(){
        pressed = new boolean[8];
    }

    public int getKeyCode(KeyCode code){ //Übersetzt KeyCode in eine Zahl speziell für Taste
        if (code == KeyCode.W){
            return 1;
        }else if (code == KeyCode.A){
            return 2;
        }else if (code == KeyCode.S){
            return 3;
        }else if (code == KeyCode.D){
            return 4;
        }else if (code == KeyCode.SPACE){
            return 5;
        }else if (code == KeyCode.ESCAPE){
            return 6;
        }else if (code == KeyCode.P){
            return 7;
        }else {
            return 0;
        }
    }

    public boolean isPressed(KeyCode code) { //return ob Taste gedrückt wird
        return pressed[getKeyCode(code)];
    }
}
