package com.example.uts_dandisuagira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Komponen1 extends AppCompatActivity {

    Button Button_syntax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen1);

        Button_syntax = (Button) findViewById(R.id.button_syntax);
        Button_syntax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Komponen1.this,Syntax1.class);
                startActivity(a);
            }
        });

    }


    public void link(View view) {
        Intent b = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/topics/manifest/activity-element"));
        startActivity(b);
    }
}
