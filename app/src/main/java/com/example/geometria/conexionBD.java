package com.example.geometria;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class conexionBD extends SQLiteOpenHelper {

    public conexionBD(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase guardarDatos) {
        guardarDatos.execSQL("CREATE table saveRectangulo (nombreProyecto varchar(50) NOT NULL PRIMARY KEY, " +
                "tipoFigura varchar (30), baseRectangulo double, alturaRectangulo double, areaRectangulo double)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
