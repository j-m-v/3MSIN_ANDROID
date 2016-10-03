package br.com.bossini.listaclientesarqdsis_si;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaCursosActivity extends AppCompatActivity {

    public static final String NOME = "br.usjt.arqdesis.clientep1.nome";
    ArrayList<String> lista;
    Activity atividade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cursos);
        atividade = this;
        Intent intent = getIntent();
        String chave = intent.getStringExtra(MainActivity.CHAVE);
        lista = buscaClientes(chave);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, lista);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // manda para a tela de detalhe
                Intent intent = new Intent(atividade, DetalheCursoActivity.class);
                intent.putExtra(NOME, lista.get(position));
                startActivity(intent);
            }
        });
    }
    public ArrayList<String> buscaClientes(String chave){
        ArrayList<String> lista = geraListaClientes();
        if (chave == null || chave.length() == 0){
            return lista;
        } else {
            ArrayList<String> subLista = new ArrayList<>();
            for(String nome:lista){
                if(nome.toUpperCase().contains(chave.toUpperCase())){
                    subLista.add(nome);
                }
            }
            return subLista;
        }
    }
    public ArrayList<String> geraListaClientes(){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pintura");
        lista.add("Design");
        lista.add("Banco de dados");
        lista.add("Logica de programção");
        lista.add("Redes");
        lista.add("Artes plascticas");
        return lista;
    }
}
