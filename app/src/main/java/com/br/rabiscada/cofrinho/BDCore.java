package com.br.rabiscada.cofrinho;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Lucas on 20/05/2015.
 */
public class BDCore extends SQLiteOpenHelper {
    private static final String NOME_BD = "cofrinho";
    private static final int VERSAO_BD = 1;

    public BDCore(Context ctx) {
        super(ctx, NOME_BD, null, VERSAO_BD);
    }


    @Override
    public void onCreate(SQLiteDatabase bd) {
        //bd.execSQL("CREATE TABLE tipo_metas (tipometaid INTEGER PRIMARY KEY AUTOINCREMENT, descricao varchar(100)); ");
        bd.execSQL("CREATE TABLE metas (metaid INTEGER PRIMARY KEY AUTOINCREMENT, data DATETIME, valor DECIMAL (11, 2), tipometaid INTEGER); ");
        //bd.execSQL("CREATE TABLE tipo_despesas (tipodespesaid INTEGER PRIMARY KEY AUTOINCREMENT, descricao varchar(100)); ");
        //bd.execSQL("CREATE TABLE despesas (despesaid INTEGER PRIMARY KEY AUTOINCREMENT, data DATETIME, valor DECIMAL (11, 2), tipodespesaid INTEGER);");

        insereTipoMetas(bd);
    }

    @Override
    public void onUpgrade(SQLiteDatabase bd, int oldVersion, int newVersion) {
        bd.execSQL("DROP TABLE metas; DROP TABLE tipo_metas; DROP TABLE despesas; DROP TABLE tipo_despesas");
        onCreate(bd);
    }

    public void insereTipoMetas(SQLiteDatabase bd) {
        /*bd.execSQL("insert into tipo_metas (tipometaid, descricao) values (1, 'Semanal')");
        bd.execSQL("insert into tipo_metas (tipometaid, descricao) values (2, 'Mensal')");
        bd.execSQL("insert into tipo_metas (tipometaid, descricao) values (3, 'Anual')");*/
    }
}
