package e.samu.buttonproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openH1(View v) {
        Intent intent = new Intent( this, ButtonActivity.class);
        startActivity(intent);
    }
    public void openH3(View v) {
        Intent intent = new Intent( this, FMRadioActivity.class);
        startActivity(intent);
    }
}
