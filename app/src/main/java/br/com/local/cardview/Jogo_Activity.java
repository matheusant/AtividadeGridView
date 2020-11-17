package br.com.local.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Jogo_Activity extends AppCompatActivity {

    private TextView txtTitulo, txtDescricao, txtRanking;
    private ImageView imgJogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jogo_layout);

        txtTitulo = findViewById(R.id.txtTitulo);
        txtDescricao = findViewById(R.id.txtDescricao);
        txtRanking = findViewById(R.id.txtRanking);
        imgJogo = findViewById(R.id.idImgJogoS);

        Intent intent = getIntent();

        String titulo = intent.getExtras().getString("Titulo");
        String descricao = intent.getExtras().getString("Descricao");
        String ranking = intent.getExtras().getString("Ranking");
        int miniatura = intent.getExtras().getInt("Miniatura");

        txtTitulo.setText(titulo);
        txtDescricao.setText(descricao);
        txtRanking.setText(ranking);
        imgJogo.setImageResource(miniatura);


    }
}