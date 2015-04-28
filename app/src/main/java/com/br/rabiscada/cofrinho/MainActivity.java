package com.br.rabiscada.cofrinho;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;


public class MainActivity extends ActionBarActivity {

    private Spinner Spn_Hist;


    private ArrayAdapter<String> adpHist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spn_Hist = (Spinner)findViewById(R.id.Spn_Hist);
        adpHist = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adpHist.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spn_Hist.setAdapter(adpHist);


        adpHist.add("Atual");
        adpHist.add("Penultimo");
        adpHist.add("AntiPenultimo");
        adpHist.add("..");


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
