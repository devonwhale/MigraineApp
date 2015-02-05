package com.example.migraineapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class SleepActivity extends ActionBarActivity {

    EditText etTimeToBed = (EditText) findViewById(R.id.etTTB);
    EditText etTimeUp = (EditText) findViewById(R.id.etTU);
    EditText etSleepRating = (EditText) findViewById(R.id.etSR);
    Button btnSubmit = (Button) findViewById(R.id.btnSub);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sleeping s = new Sleeping(Long.parseLong(etTimeToBed.getText().toString()), Long.parseLong(etTimeUp.getText().toString()), Integer.parseInt(etSleepRating.getText().toString()));
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
