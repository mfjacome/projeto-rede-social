package com.generation.redesocial.configuration;

import org.springdoc.core.customizers.OpenApiCustomiser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;

@Configuration
public class SwaggerConfig {
	
	@Bean
	public OpenAPI springRedeSocialOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("Projeto Rede Social")
				.description("Projeto Rede Social - Generation Brasil")
				.version("v0.0.1").license(new License()
				.name("Generation Brasil")
				.url("https://brazil.generation.org/"))
				.contact(new Contact()
				.name("Conteudo Generation")
				.url("https://github.com/projeto-generation/projeto-rede-social")
				.email("matheus.fause@gmail.com")))
				.externalDocs(new ExternalDocumentation()
				.description("Github")
				.url("https://github.com/projeto-generation/projeto-rede-social"));
	}
	
	@Bean
	public OpenApiCustomiser customerGlobalHeaderOpenApiCustomiser() {
		
		return openAPI -> {
			openAPI.getPaths().values().forEach(pathItem -> pathItem.readOperations().forEach(operation -> {
				
				ApiResponses apiReponses = operation.getResponses();
				
				apiReponses.addApiResponse("200", createApiResponse("Sucesso"));
				apiReponses.addApiResponse("201", createApiResponse("Objeto Persistido!"));
				apiReponses.addApiResponse("204", createApiResponse("Objeto Excluído!"));
				apiReponses.addApiResponse("400", createApiResponse("Erro na requisição!"));
				apiReponses.addApiResponse("401", createApiResponse("Acesso não autorizado!"));
				apiReponses.addApiResponse("404", createApiResponse("Objeto não encontrado!"));
				apiReponses.addApiResponse("500", createApiResponse("Erro na Aplicação!"));
			}));
		};
	}
	 private ApiResponse createApiResponse(String message) {
		 return new ApiResponse().description(message);
	 }
}
