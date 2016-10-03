package br.com.bossini.listaclientesarqdsis_si;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalheCursoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_curso);
        TextView nome = (TextView)findViewById(R.id. nome_selecionado );
        Intent intent = getIntent();
        nome.setText(intent.getStringExtra(ListaCursosActivity. NOME ));
    }
}
