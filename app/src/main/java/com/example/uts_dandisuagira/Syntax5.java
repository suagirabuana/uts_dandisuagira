package com.example.uts_dandisuagira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Syntax5 extends AppCompatActivity {

    Button kembali1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syntax5);

        kembali1 = (Button) findViewById(R.id.kembali1);

        kembali1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Syntax5.this,MainActivity.class);
                startActivity(a);
            }
        });
    }
}
