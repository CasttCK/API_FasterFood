package br.com.fasterfood.fasterapi.Service;

import br.com.fasterfood.fasterapi.Model.Cliente;
import br.com.fasterfood.fasterapi.Notificacao.Notificador;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private Notificador notificador;

    public ClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public String ativarCliente(Cliente cliente){
        cliente.ativar();
        return notificador.notificarAtivacao(cliente, "Seu cadastro está ativo.");
    }

    public String desativarCliente(Cliente cliente){
        cliente.desativar();
        return notificador.notificarDesativacao(cliente, "Seu cadastro foi desativado.");
    }

}
