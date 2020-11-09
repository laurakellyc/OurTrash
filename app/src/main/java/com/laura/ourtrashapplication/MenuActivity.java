package com.laura.ourtrashapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {

    ImageButton btLocalizacao, btInformacoes, btReclamacoes, btContatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btLocalizacao = findViewById(R.id.activity_menu_bt_localizacao);
        btInformacoes = findViewById(R.id.activity_menu_bt_informacoes);
        btReclamacoes = findViewById(R.id.activity_menu_bt_reclamacoes);
        btContatos = findViewById(R.id.activity_menu_bt_contatos);

        btLocalizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, MapsActivity.class));
            }
        });

        btInformacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, InfoActivity.class));
            }
        });

        btReclamacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, ReclamacoesActivity.class));
            }
        });

        btContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, ContatosActivity.class));
            }
        });
    }
}