package br.com.rhonan.sample.startup;

import org.h2.server.web.WebServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "br.com.rhonan.fiesc.controller",
"br.com.rhonan.fiesc.service.impl" })
@EnableJpaRepositories(basePackages = { "br.com.rhonan.fiesc.repository" })
@EntityScan("br.com.rhonan.fiesc.model")
public class StartUp {
	public static void main(final String[] args) {
		SpringApplication.run(StartUp.class, args);
	}

	/* jdbc url to use in /console: jdbc:h2:mem:testdb */
	@Bean
	public ServletRegistrationBean h2servletRegistration() {
		final ServletRegistrationBean registration = new ServletRegistrationBean(
				new WebServlet());
		registration.addUrlMappings("/console/*");
		return registration;
	}
}
