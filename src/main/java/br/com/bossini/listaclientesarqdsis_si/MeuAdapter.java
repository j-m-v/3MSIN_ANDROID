package br.com.bossini.listaclientesarqdsis_si;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by rodrigo on 30/09/16.
 */

public class MeuAdapter <T extends Cliente> extends BaseAdapter {
    T [] dados;
    Activity context;

    public MeuAdapter ( T [] dados, Activity context){
        this.dados = dados;
        this.context = context;
    }
    @Override
    public int getCount() {
        return dados.length;
    }

    @Override
    public Object getItem(int position) {
        return dados[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            //quer dizer que a view não foi inflada ainda
            //vamos inflar e guardar para quando for necessário
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.minha_linha, parent, false);
            ImageView letraCliente =
                    (ImageView)convertView.findViewById(R.id.foto_cliente);
            TextView nomeCliente =
                    (TextView)convertView.findViewById(R.id.nome_cliente);
            TextView detalheCliente =
                    (TextView)convertView.findViewById(R.id.detalhe_cliente);
            convertView.setTag(new ViewHolder (letraCliente, nomeCliente, detalheCliente));

        }
        ViewHolder holder = (ViewHolder)convertView.getTag();
//carrega os novos valores
        Drawable drawable = Util.getDrawable(context,
                dados[position].getFoto());
        holder.getFotoCliente().setImageDrawable(drawable);
        holder.getNomeCliente().setText((dados[position]).getNome());
        holder.getDetalheCliente().setText(String.format("%s - %s",
                dados[position].getFone(),
                dados[position].getEmail()));
        return convertView;
    }
}
