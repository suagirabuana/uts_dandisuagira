package com.example.uts_dandisuagira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Komponen4 extends AppCompatActivity {

    Button Button_syntax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen4);

        Button_syntax = (Button) findViewById(R.id.button_syntax);
        Button_syntax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Komponen4.this,Syntax4.class);
                startActivity(a);
            }
        });


    }

    public void link(View view) {
        Intent b = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/topics/manifest/provider-element"));
        startActivity(b);
    }
}
