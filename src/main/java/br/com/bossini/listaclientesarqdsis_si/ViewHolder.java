package br.com.bossini.listaclientesarqdsis_si;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by rodrigo on 30/09/16.
 */

public class ViewHolder {
    private ImageView fotoCliente;
    private TextView nomeCliente, detalheCliente;
    public ViewHolder(ImageView fotoCliente, TextView nomeCliente,
                      TextView detalheCliente) {
        this.fotoCliente = fotoCliente;
        this.nomeCliente = nomeCliente;
        this.detalheCliente = detalheCliente;
    }
    public ImageView getFotoCliente() {
        return fotoCliente;
    }
    public void setFotoCliente(ImageView fotoCliente) {
        this.fotoCliente = fotoCliente;
    }
    public TextView getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(TextView nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public TextView getDetalheCliente() {
        return detalheCliente;
    }
    public void setDetalheCliente(TextView detalheCliente) {
        this.detalheCliente = detalheCliente;
    }
}
