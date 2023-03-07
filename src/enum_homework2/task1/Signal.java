package enum_homework2.task1;

import java.util.Timer;
import java.util.TimerTask;

public class Signal {
    TrafficLight signal = TrafficLight.RED;

    public void transition(){
        java.util.Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
            }
        };
        for (int i = 0; i < Integer.MAX_VALUE; i++){
            switch (signal){
                case RED: signal = TrafficLight.YELLOW;
                    try{
                        System.out.println("It's " + signal.toString().toLowerCase() + ", stop!");
                        timer.schedule(task,50,100);
                        System.out.println();
                    }catch (Exception e){
                    };
                    break;
                case YELLOW: signal = TrafficLight.GREEN;
                    try{
                        System.out.println("It's " + signal.toString().toLowerCase() + ", drive!");
                        timer.schedule(task,50,100);
                        System.out.println();
                    }catch (Exception e){
                    }
                    break;
                case GREEN: signal = TrafficLight.RED;
                    try{
                        System.out.println("It's " + signal.toString().toLowerCase() + ", stop!");
                        timer.schedule(task,50,100);
                        System.out.println();
                    }catch (Exception e){
                    }
                    break;
            }
        }


    }

}
