package com.example.mercadoonline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaEscolhaCadastro extends AppCompatActivity {

    private AppCompatButton bt_pessoaFisica;
    private AppCompatButton bt_pessoaJuridica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_escolha_cadastro);

        getSupportActionBar().hide();
        IniciarComponentes();

        bt_pessoaFisica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(TelaEscolhaCadastro.this,UserCadastro.class);
                startActivity(intent2);
            }
        });
        bt_pessoaJuridica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(TelaEscolhaCadastro.this,UserCadastroJuri.class);
                startActivity(intent3);
            }
        });
    }
    private void IniciarComponentes(){
        bt_pessoaFisica = findViewById(R.id.bt_pessoaFisica);
        bt_pessoaJuridica = findViewById(R.id.bt_pessoaJuridico);
    }
}