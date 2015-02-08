package com.example.migraineapp;

import android.app.DialogFragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;


public class SleepActivity extends ActionBarActivity {

    TextView tvTimeToBed;
    TextView tvTimeUp;
    EditText etSleepRating;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);

        tvTimeToBed = (TextView) findViewById(R.id.etTTB);
        tvTimeUp = (TextView) findViewById(R.id.etTU);
        etSleepRating = (EditText) findViewById(R.id.etSR);
        btnSubmit = (Button) findViewById(R.id.btnSub);

        tvTimeToBed.setText(Calendar.HOUR_OF_DAY + ": " + Calendar.MINUTE);

        tvTimeUp.setText(Calendar.HOUR_OF_DAY + ": " + Calendar.MINUTE);

        tvTimeToBed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new TimePickerFragment();
                newFragment.show(getFragmentManager(), "timePicker");
            }
        });

        tvTimeUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new TimePickerFragment();
                newFragment.show(getFragmentManager(), "timePicker");
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sleeping s = new Sleeping(Long.parseLong(tvTimeToBed.getText().toString()), Long.parseLong(tvTimeUp.getText().toString()), Integer.parseInt(etSleepRating.getText().toString()));
                //Steve to add code here
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sleep, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
