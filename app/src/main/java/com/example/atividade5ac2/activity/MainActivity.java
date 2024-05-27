package com.example.atividade5ac2.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.atividade5ac2.R;

public class MainActivity extends AppCompatActivity {

    private Button cadastrarAlunoButton, listarAlunosButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cadastrarAlunoButton = findViewById(R.id.cadastrar_aluno_button);
        listarAlunosButton = findViewById(R.id.listar_alunos_button);

        cadastrarAlunoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CadastroActivity.class);
                startActivity(intent);
            }
        });

        listarAlunosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListaAlunosActivity.class);
                startActivity(intent);
            }
        });
    }
}
