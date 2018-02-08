package android.oneindia.in.datasubscription;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    private Timer timer;
    private TimerTask timerTask;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startTimer();

    }

    private void startTimer() {
        timer = new Timer();
        initializeTimerTask();
        //schedule the timer, after the first 5000ms the TimerTask will run every 10000ms
        timer.schedule(timerTask, 1000, 1000); //
    }

    private void initializeTimerTask() {
        handler=new Handler();
        timerTask = new TimerTask() {
            public void run() {
                //use a handler to run a toast that shows the current timestamp
                handler.post(new Runnable() {
                    public void run() {
                        if(timer!=null) {
                            stoptimertask();
                        }
                    }
                });
            }
        };
    }

    private void stoptimertask() {

            //stop the timer, if it's not already null
            if (timer != null) {
                timer.cancel();
                timer = null;
Intent loginIntent=new Intent(MainActivity.this,LoginActivity.class);
startActivity(loginIntent);


            }
        }


}



