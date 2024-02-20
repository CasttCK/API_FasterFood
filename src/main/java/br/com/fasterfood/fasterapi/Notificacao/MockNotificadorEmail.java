package br.com.fasterfood.fasterapi.Notificacao;

import br.com.fasterfood.fasterapi.Model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.BAIXA)
@Component
public class MockNotificadorEmail implements Notificador {
    @Override
    public void notificarAtivacao(Cliente cliente, String mensagem){
        System.out.printf("MOCK: Deveria notificar o usuário %s, através do email %s | Mensagem: %s",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }

    @Override
    public void notificarDesativacao(Cliente cliente, String mensagem){
        System.out.printf("MOCK: Deveria notificar o usuário %s, através do email %s | Mensagem: %s",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
