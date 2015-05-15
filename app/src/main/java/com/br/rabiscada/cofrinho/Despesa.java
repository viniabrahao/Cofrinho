package com.br.rabiscada.cofrinho;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Despesa extends ActionBarActivity implements View.OnClickListener {

    private Button mi1;
    private Button mi10;
    private Button mi100;
    private Button mi1000;
    private Button miManual;
    private EditText despSubTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_despesa);

        mi1 = (Button) findViewById(R.id.mi1);
        mi1.setOnClickListener(this);

        mi10 = (Button) findViewById(R.id.mi10);
        mi10.setOnClickListener(this);

        mi100 = (Button) findViewById(R.id.mi100);
        mi100.setOnClickListener(this);

        mi1000 = (Button) findViewById(R.id.mi1000);
        mi1000.setOnClickListener(this);

      //  miManual = (Button) findViewById(R.id.miManual);
    //    miManual.setOnClickListener(this);

        despSubTotal = (EditText) findViewById(R.id.despSubTotal);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mi1:
                adicionaValor(v, 1);
                break;

            case R.id.mi10:
                adicionaValor(v, 10);
                break;

            case R.id.mi100:
                adicionaValor(v, 100);
                break;

            case R.id.mi1000:
                adicionaValor(v, 1000);
                break;

        //    case R.id.miManual:
      //          break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_despesa, menu);
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

    private void adicionaValor(View v, int valor) {
        String valorString = "";
        Editable editSubTotal = despSubTotal.getText();
        String valorStringEdit = editSubTotal.toString();
        int valorInt = Integer.valueOf(valorStringEdit);
        int novoValor = valor + valorInt;
        valorString = String.valueOf(novoValor);
        despSubTotal.setText(valorString);
    }
}
