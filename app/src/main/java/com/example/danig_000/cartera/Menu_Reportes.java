package com.example.danig_000.cartera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu_Reportes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__reportes);
    }

    public void MReporteVolverMAdmin(View v){
        Intent con = new Intent(Menu_Reportes.this, Menu_Admin.class);
        startActivity(con.addFlags(con.FLAG_ACTIVITY_CLEAR_TOP | con.FLAG_ACTIVITY_SINGLE_TOP));
    }
}
