package com.ydm.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ydm.model.Cliente;

//classe que irá receber requisições para desenvolvermos os endpoints
@RestController
@RequestMapping("/clientes") //Irá mapear os endpoints pra receber requisiçoes iniciadas com /clientes
public class ClienteController {
	
	@GetMapping //Usado para saber que ao entrar nessa classe, ométodo get dará acesso a este método abaixo
	public List<Cliente> listagemDeClientes() {
		
	}

}
