package com.example.cuaderno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegistrosAddActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_registros);
        btn = (Button) findViewById(R.id.btn_Guardar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrosAddActivity.this, MainActivity.class);
                Toast.makeText(getApplicationContext(), "Se guardo correctamente",Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });
    }
}