package br.com.fasterfood.fasterapi.Notificacao;

import br.com.fasterfood.fasterapi.Model.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmail implements Notificador {

    @Override
    public String notificarAtivacao(Cliente cliente, String mensagem){
//        TODO
//        fazer aqui a lógica para envio de email. Estudar mais sobre as bibliotecas
//        e fazr o serviço.
        System.out.printf("Notificando o usuário %s, através do e-mail %s",
                cliente.getNome(), cliente.getEmail(), mensagem);

        return "Ativado!";
    }

    @Override
    public String notificarDesativacao(Cliente cliente, String mensagem){
        System.out.printf("Notificando o usuário %s, através do e-mail %s",
                cliente.getNome(), cliente.getEmail(), mensagem);

        return "Desativado!";
    }
}
