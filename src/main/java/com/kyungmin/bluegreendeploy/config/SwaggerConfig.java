package com.kyungmin.bluegreendeploy.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

  @Bean
  public OpenAPI openAPI() {
    Info info = new Info()
      .title("Blue-Green Deploy API 명세서")
      .description("Blue-Green Deploy API")
      .version("v1");

    return new OpenAPI()
      .info(info)
      .addServersItem(new Server().url("/"));
  }
}
