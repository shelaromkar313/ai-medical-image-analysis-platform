package com.medical.ai.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * OpenAPI/Swagger Configuration
 * 
 * Configures API documentation with JWT authentication support.
 * Access Swagger UI at: http://localhost:8080/api/v1/swagger-ui.html
 */
@Configuration
public class OpenApiConfig {

    @Value("${server.port:8080}")
    private String serverPort;

    @Value("${server.servlet.context-path:/api/v1}")
    private String contextPath;

    @Bean
    public OpenAPI medicalImageAnalysisOpenAPI() {
        final String securitySchemeName = "bearerAuth";

        return new OpenAPI()
                .info(new Info()
                        .title("Medical Image Analysis Platform API")
                        .description("Enterprise-grade AI-powered medical image analysis and clinical decision support system")
                        .version("v1.0.0")
                        .contact(new Contact()
                                .name("Enterprise Healthcare Solutions Team")
                                .email("support@medical-ai.com")
                                .url("https://medical-ai.com"))
                        .license(new License()
                                .name("Proprietary License")
                                .url("https://medical-ai.com/license")))
                .servers(List.of(
                        new Server().url("http://localhost:" + serverPort + contextPath).description("Development Server"),
                        new Server().url("https://api.medical-ai.com" + contextPath).description("Production Server")
                ))
                .addSecurityItem(new SecurityRequirement().addList(securitySchemeName))
                .components(new io.swagger.v3.oas.models.Components()
                        .addSecuritySchemes(securitySchemeName,
                                new SecurityScheme()
                                        .name(securitySchemeName)
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")
                                        .description("JWT Authentication token. Format: Bearer <token>")));
    }
}
