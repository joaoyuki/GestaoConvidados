package br.com.joao.gestaofesta.GestaoFesta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication Diz que essa classe faz parte da configuração do Spring.
// Também define um ponto de início para a busca de componentes Spring, tudo o que tiver dentro desse pacote será escaniado pelo Spring.
@SpringBootApplication
public class GestaoFestaApplication {
        //O método main é quem irá iniciar a nossa aplicação
        //O Springboot usa um servidor de aplicação embarcado
	public static void main(String[] args) {
		SpringApplication.run(GestaoFestaApplication.class, args);
	}
}
