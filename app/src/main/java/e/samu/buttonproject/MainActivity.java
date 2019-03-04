package e.samu.buttonproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Bu_Start, Bu_Stop, Suurenna;
    TextView out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bu_Start.setBackgroundResource(R.drawable.button_start_green);
        Bu_Stop.setBackgroundResource(R.drawable.button_idle_grey);
        Suurenna.setBackgroundResource(R.drawable.button_active_green1);
        out = findViewById(R.id.out);
    }


    public void but_start(View v) {
        System.out.println(" Start ");

        Bu_Start.setBackgroundResource(R.drawable.button_idle_grey);
        Bu_Stop.setBackgroundResource(R.drawable.button_stop_red);

        Bu_Stop.setEnabled(true);
        Bu_Start.setEnabled(false);
        out.setText("Running");
    }
}
