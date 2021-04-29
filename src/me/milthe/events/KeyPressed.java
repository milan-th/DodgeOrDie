package me.milthe.events;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import me.milthe.entities.Player;

public class KeyPressed implements EventHandler<KeyEvent> {
    @Override
    public void handle(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.SPACE) {
            Player.mouseDash();
        } else if (keyEvent.getCode() == KeyCode.W) {
            Player.setYVelocity(-(Player.speed));
        } else if (keyEvent.getCode() == KeyCode.S) {
            Player.setYVelocity(Player.speed);
        } else if (keyEvent.getCode() == KeyCode.A) {
            Player.setXVelocity(-(Player.speed));
        } else if (keyEvent.getCode() == KeyCode.D) {
            Player.setXVelocity(Player.speed);
        }
    }

}