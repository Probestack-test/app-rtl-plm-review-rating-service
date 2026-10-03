package com.probestack.forgestudio.design.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "com.probestack.forgestudio.design.config.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Review Rating Service")
                                .description("Microservice for collecting product reviews and star ratings. Supports moderation workflows, helpfulness voting, and aggregate score lookup. ")
                                .contact(
                                        new Contact()
                                                .name("Community Platform Team")
                                                .email("reviews@example.com")
                                )
                                .version("1.0.0")
                )
        ;
    }
}
