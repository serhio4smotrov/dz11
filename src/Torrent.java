import java.util.Timer;
import java.util.TimerTask;

public class Torrent implements Runnable {
    int number;
    int time;
    Torrent(int number,int time) {
        this.number = number;
        this.time = time;
    }
    @Override
    public void run() {
        Timer timer = new Timer();
        timer.schedule(new MyTask(number,time),time*1000,time*1000);
    }
}
class MyTask extends TimerTask {
    int number;
    int time;
    MyTask(int number,int time){
        this.number = number;
        this.time = time;
    }
    @Override
    public void run() {
        System.out.printf("я поток номер %d я появляюсь каждые %d секунд\n",number,time);
    }
}

