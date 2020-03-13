package timer;

import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
    private  int count=0;
    @Override
    public void run() {
        count++;
        System.out.println("this TimerTask Run"+count);
    }
}
