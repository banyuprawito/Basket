package com.masbanyu.coba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 private int skora=0;
 private int skorb=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tambah3poinA(View view) {
        TextView textviewa = findViewById(R.id.skora);
        skora=skora+3;
        textviewa.setText(String.valueOf(skora));
    }

    public void tambah2poinA(View view) {
        TextView textviewa = findViewById(R.id.skora);
        skora=skora+2;
        textviewa.setText(String.valueOf(skora));
    }
    public void tambah1poinA(View view) {
        TextView textviewa = findViewById(R.id.skora);
        skora=skora+1;
        textviewa.setText(String.valueOf(skora));
    }
    public void tambah3poinB(View view) {
        TextView textviewb = findViewById(R.id.skorb);
        skorb=skorb+3;
        textviewb.setText(String.valueOf(skorb));
    }

    public void tambah2poinB(View view) {
        TextView textviewb = findViewById(R.id.skorb);
        skorb=skorb+2;
        textviewb.setText(String.valueOf(skorb));
    }
    public void tambah1poinB(View view) {
        TextView textviewb = findViewById(R.id.skorb);
        skorb=skorb+1;
        textviewb.setText(String.valueOf(skorb));
    }

    public void reset(View view) {
        skora=0;
        TextView textviewa = findViewById(R.id.skora);
        textviewa.setText(String.valueOf(skora));
        skorb=0;
        TextView textviewb = findViewById(R.id.skorb);
        textviewb.setText(String.valueOf(skorb));
    }
}
