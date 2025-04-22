package com.nathan.walletway;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button adicionarTransacaoButton = findViewById(R.id.adicionarTransacaoButton);
        adicionarTransacaoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdicionarTransacaoActivity.class);
                startActivity(intent);
            }
        });

        Button botaoAdicionar = findViewById(R.id.botaoAdicionar);
        botaoAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdicionarTransacaoActivity.class);
                startActivity(intent);
            }
        });
    }
}

