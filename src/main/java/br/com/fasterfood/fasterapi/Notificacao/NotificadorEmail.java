package br.com.fasterfood.fasterapi.Notificacao;

import br.com.fasterfood.fasterapi.Model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class NotificadorEmail implements Notificador {
    private String hostSmtp;
    private boolean caixaAlta;

    @Autowired
    public NotificadorEmail(String hostSmtp) {
        this.hostSmtp = hostSmtp;
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }

    @Override
    public void notificarAtivacao(Cliente cliente, String mensagem){
//        TODO
//        fazer aqui a lógica para envio de email. Estudar mais sobre as bibliotecas
//        e fazr o serviço.
        if(caixaAlta){
            mensagem = mensagem.toUpperCase();
        }
        System.out.printf("Notificando o usuário %s, através do e-mail %s | Mensagem: %s",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }

    @Override
    public void notificarDesativacao(Cliente cliente, String mensagem){
        if(caixaAlta){
            mensagem = mensagem.toUpperCase();
        }

        System.out.printf("Notificando o usuário %s, através do e-mail %s | Mensagem: %s",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
