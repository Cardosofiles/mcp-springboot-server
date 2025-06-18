package br.com.cardosofiles.mcp_springboot_server.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class McpConfig {
    @Value("${mcp.endpoint}")
    private String mcpEndpoint;

    public String getMcpEndpoint() {
        return mcpEndpoint;
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
