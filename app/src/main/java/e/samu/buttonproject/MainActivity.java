package e.samu.buttonproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Bu_Start, Bu_Stop, Suurenna, Pienenna;
    TextView out, textZoom;
    Integer zoom = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bu_Start = findViewById(R.id.button1);
        Bu_Stop = findViewById(R.id.button2);
        Suurenna = findViewById(R.id.button3);
        Pienenna = findViewById(R.id.button4);
        Bu_Start.setBackgroundResource(R.drawable.button_start_green);
        Bu_Stop.setBackgroundResource(R.drawable.button_idle_grey);
        Suurenna.setBackgroundResource(R.drawable.button_active_green1);
        out = findViewById(R.id.out);
        textZoom = findViewById(R.id.textZoom);
    }


    public void but_start(View v) {
        System.out.println(" Start ");

        Bu_Start.setBackgroundResource(R.drawable.button_idle_grey);
        Bu_Stop.setBackgroundResource(R.drawable.button_stop_red);

        Bu_Stop.setEnabled(true);
        Bu_Start.setEnabled(false);
        out.setText("Running");
    }

    public void but_stop(View v) {
        System.out.println(" Stop ");

        Bu_Start.setBackgroundResource(R.drawable.button_start_green);
        Bu_Stop.setBackgroundResource(R.drawable.button_idle_grey);

        Bu_Stop.setEnabled(false);
        Bu_Start.setEnabled(true);
        out.setText("Stopped");
    }

    public void zoomin(View v) {
        System.out.println(" Zoom in ");
        zoom = zoom + 1;
        textZoom.setText("Zoom = " + zoom);
    }

    public void zoomout(View v) {
        System.out.println(" Zoom out ");
        zoom = zoom - 1;
        textZoom.setText("Zoom = " + zoom);
    }
}
