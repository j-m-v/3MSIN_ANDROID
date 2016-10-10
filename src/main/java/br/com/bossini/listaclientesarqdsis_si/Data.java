package br.com.bossini.listaclientesarqdsis_si;

import java.util.ArrayList;

/**
 * Created by rodrigo on 30/09/16.
 */

public class Data {
    public static Cliente[] _lista;

    public static Cliente[] geraListaClientes() {
        if (_lista == null) {
            Cliente[] lista = new Cliente[9];
            lista[0] = new Cliente(1, "Artes Plasticas", "Curso típico de artes, baseado na historia artistica", "2 Anos");
            lista[1] = new Cliente(2, "Artes marciais", "Curso de lutas", "8 meses");
            lista[2] = new Cliente(3, "Banco de dados", "Curso de TI", "2 anos");
            lista[3] = new Cliente(4, "Cobit", "Certificação de TI", "3 meses");
            lista[4] = new Cliente(5, "Gerenciamento de projetos", "Curso de TI", "3 meses");
            lista[5] = new Cliente(6, "ITIL", "Certificação de TI", "3 meses");
            lista[6] = new Cliente(7, "Infraestrutura", "Curso de TI", "2 anos");
            lista[7] = new Cliente(8, "Musica", "Curso sobre musicalidade", "8 meses");
            lista[8] = new Cliente(9, "Redes", "Curso tecnico de redes", "2 anos");
            _lista = lista;
        }
        return _lista;
    }

    public static Cliente[] buscaClientes(String chave) {
        Cliente[] lista = geraListaClientes();
        if (chave == null || chave.length() == 0) {
            return lista;
        } else {
            ArrayList<Cliente> subLista = new ArrayList<>();
            for (Cliente cliente : lista) {
                if (cliente.getNome().toUpperCase().contains(chave.toUpperCase())) {
                    subLista.add(cliente);
                }
            }
            return subLista.toArray(new Cliente[0]);
        }
    }
}
