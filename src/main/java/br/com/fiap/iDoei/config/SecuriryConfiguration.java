package br.com.fiap.iDoei.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
public class SecuriryConfiguration extends WebSecurityConfigurerAdapter{
	
//	@Autowired
//	private AuthenticationService autheticationService;
//	//autenticação
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(autheticationService)
//		.passwordEncoder(AuthenticationService.getPasswordEncoder());
//	}
	//autorização
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			
			http.authorizeRequests().antMatchers("/person")
				.hasRole("ADMIN")
			.antMatchers("/home")///home","/offices","/office","/permissions","/permission","/employee","/patient/**","/patients","/role/**","/roles
				.authenticated()
			.anyRequest()
				.permitAll()
			.and().formLogin()
				.defaultSuccessUrl("/home")
			.and().csrf().disable()
			;
			
			http.headers().frameOptions().disable();
		}

}
