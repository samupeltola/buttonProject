package e.samu.buttonproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class FMRadioActivity extends AppCompatActivity {

    TextView number;
    RadioGroup channel_group;
    RadioButton rb_1, rb_2, rb_3, rb_4;
    String saved_channel_1 = "97";
    String saved_channel_2 = "97";
    String saved_channel_3 = "97";
    SeekBar sb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fmradio);

        number = (TextView) findViewById(R.id.currentFrequency);

        sb1 = (SeekBar) findViewById(R.id.frequencyBar);

        channel_group = (RadioGroup) findViewById(R.id.channelgroup);
        rb_1 = (RadioButton) findViewById(R.id.channel_1);
        rb_2 = (RadioButton) findViewById(R.id.channel_2);
        rb_3 = (RadioButton) findViewById(R.id.channel_3);
        rb_4 = (RadioButton) findViewById(R.id.offButton);

        sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // Asetaan Seekbar kuuntelija

            @Override
            /// kutsutaan kun seekbar arvo muuttuu
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {

                String st = String.valueOf(progressValue+87);
                Toast.makeText(getApplicationContext(), "Changing seekbar's progress = "+st, Toast.LENGTH_SHORT).show();
                number.setText(st + " MHz");

                if(rb_1.isChecked()) {
                    saved_channel_1 = st;
                }
                else if(rb_2.isChecked()) {
                    saved_channel_2 = st;
                }
                else if(rb_3.isChecked()) {
                    saved_channel_3 = st;
                }
            }


            @Override
            // kutsutaan kun osoitetaan seekbariin
            public void onStartTrackingTouch(SeekBar seekBar) {

                Toast.makeText(getApplicationContext(), "Started tracking seekbar", Toast.LENGTH_SHORT).show();
            }

            @Override
            // kutsutaan kun seek osoitus loppuu
            public void onStopTrackingTouch(SeekBar seekBar) {

                Toast.makeText(getApplicationContext(), "Stopped tracking seekbar", Toast.LENGTH_SHORT).show();
            }

        });

       /* channel_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

            }
        });*/
    }
    // radiobutton 1
    public void channel1button(View v)
    {

        int prasettu1 = Integer.parseInt(saved_channel_1) - 87;
        sb1.setProgress(prasettu1);
        number.setText(saved_channel_1 + " MHz");
        System.out.println(" Tick RadioButton 1 ");

    }
    // radiobutton 2
    public void channel2button(View v)
    {

        int prasettu2 = Integer.parseInt(saved_channel_2) - 87;
        sb1.setProgress(prasettu2);
        number.setText(saved_channel_2 + " MHz");
        System.out.println(" Tick RadioButton 2");

    }

    // radio button 3
    public void channel3button(View v)
    {

        int prasettu3 = Integer.parseInt(saved_channel_3) - 87;
        sb1.setProgress(prasettu3);
        number.setText(saved_channel_3 + " MHz");
        System.out.println(" Tick RadioButton 3");

    }
    // off button
    public void offbutton(View v)
    {

        number.setText(" Radio OFF");
        System.out.println(" Radio OFF ticked ");

    }

    public void lower1(View v) {
        int i = sb1.getProgress();
        sb1.setProgress(i-1);
    }

    public void raise5(View v) {
        int i = sb1.getProgress();
        sb1.setProgress(i+5);
    }

    public void raise1(View v) {
        int i = sb1.getProgress();
        sb1.setProgress(i+1);
    }

    public void lower5(View v) {
        int i = sb1.getProgress();
        sb1.setProgress(i-5);
    }
}
