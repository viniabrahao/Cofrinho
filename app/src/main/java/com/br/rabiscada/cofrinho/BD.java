package com.br.rabiscada.cofrinho;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Lucas on 20/05/2015.
 */
public class BD {
    private SQLiteDatabase bd;

    public BD(Context context){
        BDCore auxBD = new BDCore(context);
        bd = auxBD.getWritableDatabase();
    }

    public void inserirDespesa(Despesa despesa) {
        ContentValues valores = new ContentValues();
        valores.put("data", "date('now')");
        valores.put("valor", despesa.getValorDespesa());
        valores.put("tipodespesaid", despesa.getTipoDespesa());

        bd.insert("despesas", null, valores);
    }

    public void inserirMeta(Meta meta) {

        String strMeta = meta.getTipoMeta();
        int intMeta = 0;
        if(strMeta == "Semanal"){
            intMeta = 1;
        }

        ContentValues valores = new ContentValues();
        valores.put("data", "2015-01-01 15:00:00");
        valores.put("valor", meta.getValorMeta());
        valores.put("tipometaid", intMeta);

        bd.insert("metas", null, valores);
    }
}
