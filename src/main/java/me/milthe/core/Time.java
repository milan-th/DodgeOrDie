package me.milthe.core;

import java.util.Timer;
import java.util.TimerTask;

public class Time {
    private static long timeInSeconds;
    private static Timer timer;

    public static void startTimer() {
        timer = new Timer();
        timeInSeconds = 0;
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (Game.state == Gamestates.INGAME) timeInSeconds++;
            }
        }, 1000, 1000);
    }

    public static void stopTimer() {
        timer.cancel();
    }

    public static String getTimeString(long timeInSeconds) {
        String minutes = ((timeInSeconds / 60) < 10) ? "0" + (timeInSeconds / 60) : String.valueOf(timeInSeconds / 60);
        String seconds = ((timeInSeconds % 60) < 10) ? "0" + (timeInSeconds % 60) : String.valueOf(timeInSeconds % 60);
        return minutes + ":" + seconds;
    }

    public static long getTimeInSeconds() {
        return timeInSeconds;
    }
}
