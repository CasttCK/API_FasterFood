package br.com.fasterfood.fasterapi.Notificacao;

import br.com.fasterfood.fasterapi.Model.Cliente;
import org.springframework.stereotype.Component;

@TipoDoNotificador(NivelUrgencia.ALTA)
@Component
public class NotificadorWhatsapp implements Notificador {
    @Override
    public void notificarAtivacao(Cliente cliente, String mensagem){
        System.out.printf("Notificando o usuário %s, através do Whatsapp %s | Mensagem: %s",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }

    @Override
    public void notificarDesativacao(Cliente cliente, String mensagem) {
        System.out.printf("Notificando o usuário %s, através do Whatsapp %s | Mensagem: %s",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
