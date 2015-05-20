package com.br.rabiscada.cofrinho;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private Button meta;
    private Button despesa;
    private Button historico;

 @Override

    protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main);

     meta = (Button) findViewById(R.id.meta);
     meta.setOnClickListener(this);

     despesa = (Button) findViewById(R.id.despesa);
     despesa.setOnClickListener(this);

     historico = (Button) findViewById(R.id.historico);
     historico.setOnClickListener(this);

 }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.meta:
                Intent itmeta = new Intent(this, Meta.class);
                startActivity(itmeta);
                break;

            case R.id.despesa:
                Intent itdespesa = new Intent(this, Despesa.class);
                startActivity(itdespesa);
                break;

            case R.id.historico:
                Intent ithist = new Intent(this, historico.class);
                startActivity(ithist);
                break;
        }

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
