package br.com.fasterfood.fasterapi.Notificacao;

import br.com.fasterfood.fasterapi.Model.Cliente;

public interface Notificador {
    void notificarAtivacao(Cliente cliente, String mensagem);

    void notificarDesativacao(Cliente cliente, String mensagem);
}
