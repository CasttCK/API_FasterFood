package br.com.fasterfood.fasterapi.Controller;

import br.com.fasterfood.fasterapi.Model.Cliente;
import br.com.fasterfood.fasterapi.Service.ClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/ativar")
    @ResponseBody
    public String ativar() {
        Cliente cliente = new Cliente("Vinicius", "vini.teste@gmail.com", "988268294");

        return clienteService.ativarCliente(cliente);
    }

    @GetMapping("/desativar")
    @ResponseBody
    public String desativar() {
        Cliente cliente = new Cliente("Vinicius", "vini.teste@gmail.com", "988268294");

        return clienteService.desativarCliente(cliente);
    }
}
