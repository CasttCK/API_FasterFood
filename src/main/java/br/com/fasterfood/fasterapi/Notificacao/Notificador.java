package br.com.fasterfood.fasterapi.Notificacao;

import br.com.fasterfood.fasterapi.Model.Cliente;

public interface Notificador {
    String notificarAtivacao(Cliente cliente, String mensagem);

    String notificarDesativacao(Cliente cliente, String mensagem);
}
