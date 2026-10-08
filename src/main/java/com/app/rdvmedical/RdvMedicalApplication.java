package com.app.rdvmedical;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class RdvMedicalApplication {

	private static final Logger log = LoggerFactory.getLogger(RdvMedicalApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RdvMedicalApplication.class, args);
	}

	@Bean
	public CommandLineRunner swaggerUrlLogger(Environment environment) {
		return args -> {
			int port = environment.getProperty("server.port", Integer.class, 8080);
			String contextPath = environment.getProperty("server.servlet.context-path", "");
			if (contextPath == null) {
				contextPath = "";
			}
			if (!contextPath.isEmpty() && !contextPath.startsWith("/")) {
				contextPath = "/" + contextPath;
			}
			String swaggerUrl = String.format("http://localhost:%d%s/swagger-ui/index.html", port, contextPath);
			String apiDocsUrl = String.format("http://localhost:%d%s/v3/api-docs", port, contextPath);

			log.info("========================================================");
			log.info("Application started!");
			log.info("Swagger UI available at: {}", swaggerUrl);
			log.info("API Docs available at: {}", apiDocsUrl);
			log.info("========================================================");
		};
	}
}