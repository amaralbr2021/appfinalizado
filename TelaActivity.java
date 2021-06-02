package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class TelaActivity extends AppCompatActivity {
    private Button btLogar;
    private Button btCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela);

        btLogar = findViewById(R.id.btLogar);
        btCadastrar = findViewById(R.id.btCadastrar);

        btLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telaLogar();
            }
        });
        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telaCadastrar();
            }
        });



    }

    private void telaCadastrar() {
        startActivity(new Intent(this, CadastroActivity.class));
    }

    private void telaLogar() {
        startActivity(new Intent(this,LoginActivity.class));
    }
}
