package br.com.fasterfood.fasterapi.Notificacao;

import br.com.fasterfood.fasterapi.Model.Cliente;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@TipoDoNotificador(NivelUrgencia.MEDIA)
@Component
public class NotificadorSms implements Notificador {
    @Override
    public void notificarAtivacao(Cliente cliente, String mensagem){
        System.out.printf("Notificando o usuário %s, através de SMS | Mensagem: %s",
                cliente.getNome(), mensagem);
    }

    @Override
    public void notificarDesativacao(Cliente cliente, String mensagem) {
        System.out.printf("Notificando o usuário %s, através de SMS | Mensagem: %s",
                cliente.getNome(), mensagem);
    }
}
