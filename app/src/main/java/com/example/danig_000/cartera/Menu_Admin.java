package com.example.danig_000.cartera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu_Admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__admin);
    }

    public void CerrarMenuAdmin(View v){
        Intent con = new Intent(Menu_Admin.this, Inicio_Admin.class);
        startActivity(con.addFlags(con.FLAG_ACTIVITY_CLEAR_TOP | con.FLAG_ACTIVITY_SINGLE_TOP));
    }

    public void PasarRegistrarTasa(View v){
        Intent con = new Intent(Menu_Admin.this, Registro_Tasa.class);
        startActivity(con.addFlags(con.FLAG_ACTIVITY_CLEAR_TOP | con.FLAG_ACTIVITY_SINGLE_TOP));
    }

    public void PasarMenuCobrador(View v){
        Intent con = new Intent(Menu_Admin.this, Menu_Cobradores.class);
        startActivity(con.addFlags(con.FLAG_ACTIVITY_CLEAR_TOP | con.FLAG_ACTIVITY_SINGLE_TOP));
    }

    public void PasarRegistroPrestammo(View v){
        Intent con = new Intent(Menu_Admin.this, Regitro_Prestamo.class);
        startActivity(con.addFlags(con.FLAG_ACTIVITY_CLEAR_TOP | con.FLAG_ACTIVITY_SINGLE_TOP));
    }

    public void PasarReporte(View v){
        Intent con = new Intent(Menu_Admin.this, Menu_Reportes.class);
        startActivity(con.addFlags(con.FLAG_ACTIVITY_CLEAR_TOP | con.FLAG_ACTIVITY_SINGLE_TOP));
    }
}
