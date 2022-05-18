package com.example.fragment1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //fragment default
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frameLayout, new Fragment_a())
                .commit();
    }

    //metodos para reemplazar fragments
    public void mostrarFA(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new Fragment_a()).commit();
    }
    public void mostrarFB(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new Fragment_b()).commit();
    }
    public void mostrarFC(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new Fragment_c()).commit();
    }

    public void mostrarcon1(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new Fragment_a()).commit();
    }
}