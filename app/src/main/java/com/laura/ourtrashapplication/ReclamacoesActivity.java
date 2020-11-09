package com.laura.ourtrashapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ReclamacoesActivity extends AppCompatActivity {

    ImageButton btVoltar, btEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reclamacoes);

        btVoltar = findViewById(R.id.activity_reclamacoes_bt_voltar);

        btEnviar = findViewById(R.id.activity_reclamacoes_bt_ok);


        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ReclamacoesActivity.this, "Reclamação enviada com sucesso!", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
