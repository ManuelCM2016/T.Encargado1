package com.example.tencargado1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calculadora(View view) {
        startActivity(new Intent(this,Calculadora.class));
    }
    public void mitabhost(View view) {
        startActivity(new Intent(this,MiFragmentTabhost.class));
    }
    public void salir(View view) {
            finish();
    }


}