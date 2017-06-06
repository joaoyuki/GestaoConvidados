package br.com.joao.gestaofesta.GestaoFesta.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration//Essa anotação permite que essa classe pudesse armazenar quaisquer outras configurações do Spring
public class InMemorySecurityConfig {

	//Esse método podia ter qualquer outro nome, mas esse nome é a convensão utilizada
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder)
			throws Exception {
			builder.inMemoryAuthentication().
			withUser("joao").password("123").roles("USER").and()
			.withUser("alexandre").password("123").roles("USER").and()
			.withUser("thiago").password("123").roles("USER");
	}

}
