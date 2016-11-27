package com.example.danig_000.cartera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Registro_Admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro__admin);
    }
    public void VolverMenuAdmin(View v){
        Intent con = new Intent(Registro_Admin.this, Inicio_Admin.class);
        startActivity(con.addFlags(con.FLAG_ACTIVITY_CLEAR_TOP | con.FLAG_ACTIVITY_SINGLE_TOP));
    }
}
