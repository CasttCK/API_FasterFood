package br.com.fasterfood.fasterapi.Notificacao;

import br.com.fasterfood.fasterapi.Model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@TipoDoNotificador(NivelUrgencia.BAIXA)
@Component
public class NotificadorEmail implements Notificador {
    @Value("${notificador.email.host-servidor}")
    private String host;

    @Value("${notificador.email.porta-servidor}")
    private Integer porta;

    @Override
    public void notificarAtivacao(Cliente cliente, String mensagem){
//        TODO
//        fazer aqui a lógica para envio de email. Estudar mais sobre as bibliotecas
//        e fazr o serviço.
        System.out.printf("Notificando o usuário %s, através do e-mail %s | Mensagem: %s",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }

    @Override
    public void notificarDesativacao(Cliente cliente, String mensagem){
        System.out.printf("Notificando o usuário %s, através do e-mail %s | Mensagem: %s",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
