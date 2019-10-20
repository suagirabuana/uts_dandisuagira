package com.example.uts_dandisuagira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button komponen1,komponen2,komponen3,komponen4,komponen5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        komponen1 = (Button) findViewById(R.id.komponen1);
        komponen2 = (Button) findViewById(R.id.komponen2);
        komponen3 = (Button) findViewById(R.id.komponen3);
        komponen4 = (Button) findViewById(R.id.komponen4);
        komponen5 = (Button) findViewById(R.id.komponen5);

        komponen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,Komponen1.class);
                startActivity(a);
            }
        });


        komponen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,Komponen2.class);
                startActivity(a);
            }
        });

        komponen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,Komponen3.class);
                startActivity(a);
            }
        });


        komponen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,Komponen4.class);
                startActivity(a);
            }
        });

        komponen5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,Komponen5.class);
                startActivity(a);
            }
        });

    }
}
