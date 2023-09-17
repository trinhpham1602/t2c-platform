package com.t2c.base;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "T2C Project API", version = "1.0",
		description = "T2C Application"),
		security = @SecurityRequirement(name = "keycloak_oauth2"),
		servers = {
			@Server(url = "${swagger.server-url}", description = "server")
		})
public class t2cApplication {

	public static void main(String[] args) {
		SpringApplication.run(t2cApplication.class, args);
	}

}
