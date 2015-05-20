package com.br.rabiscada.cofrinho;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class Meta extends ActionBarActivity implements View.OnClickListener{
    private Button btn_confirma;
    private Spinner freq;

    private ArrayAdapter<String> adpfreq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meta);

        freq = (Spinner)findViewById(R.id.freq);

        adpfreq = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adpfreq.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        freq.setAdapter(adpfreq);

        adpfreq.add("Semanalmente");
        adpfreq.add("Mensalmente");
        adpfreq.add("Anualmente");
    }

    public void onClick(View v) {



    }

            @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_meta, menu);
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
