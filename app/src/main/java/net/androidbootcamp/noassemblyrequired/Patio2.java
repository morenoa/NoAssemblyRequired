package net.androidbootcamp.noassemblyrequired;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Patio2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patio2);
        Button button7 = (Button) findViewById(R.id.btnHome);
        Button button8 = (Button) findViewById(R.id.btnNev);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Patio2.this, MainActivity.class));
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Patio2.this, Patio.class));
            }
        });
    }
}
