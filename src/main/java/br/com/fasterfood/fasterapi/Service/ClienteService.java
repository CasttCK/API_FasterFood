package br.com.fasterfood.fasterapi.Service;

import br.com.fasterfood.fasterapi.Model.Cliente;
import br.com.fasterfood.fasterapi.Notificacao.NivelUrgencia;
import br.com.fasterfood.fasterapi.Notificacao.Notificador;
import br.com.fasterfood.fasterapi.Notificacao.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @TipoDoNotificador(NivelUrgencia.ALTA)
    @Autowired
    private Notificador notificador;

    public void ativarCliente(Cliente cliente){
        cliente.ativar();
        notificador.notificarAtivacao(cliente, "Seu cadastro está ativo.");
    }

    public void desativarCliente(Cliente cliente){
        cliente.desativar();
        notificador.notificarDesativacao(cliente, "Seu cadastro foi desativado.");
    }
}
