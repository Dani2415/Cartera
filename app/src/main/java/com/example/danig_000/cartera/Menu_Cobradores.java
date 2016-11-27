package com.example.danig_000.cartera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu_Cobradores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__cobradores);
    }

    public void MCobraVolverMAdmin(View v){
        Intent con = new Intent(Menu_Cobradores.this, Menu_Admin.class);
        startActivity(con.addFlags(con.FLAG_ACTIVITY_CLEAR_TOP | con.FLAG_ACTIVITY_SINGLE_TOP));
    }

    public void PasarCrearCobra(View v){
        Intent con = new Intent(Menu_Cobradores.this, Registro_Cobra.class);
        startActivity(con.addFlags(con.FLAG_ACTIVITY_CLEAR_TOP | con.FLAG_ACTIVITY_SINGLE_TOP));
    }
    public void PasarInhabilitarCobra(View v){
        Intent con = new Intent(Menu_Cobradores.this, Inhabilitar_Cobra.class);
        startActivity(con.addFlags(con.FLAG_ACTIVITY_CLEAR_TOP | con.FLAG_ACTIVITY_SINGLE_TOP));
    }
    public void PasarConsultaCobra(View v){
        Intent con = new Intent(Menu_Cobradores.this, Consulta_Cobra.class);
        startActivity(con.addFlags(con.FLAG_ACTIVITY_CLEAR_TOP | con.FLAG_ACTIVITY_SINGLE_TOP));
    }

}
