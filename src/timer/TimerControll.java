package timer;

import java.util.Timer;

public class TimerControll {
    public static void main(String[] args) {
        Timer timer = new Timer();
        MyTimerTask myTimerTask = new MyTimerTask();
        timer.schedule(myTimerTask,2000,2000);
    }
}
