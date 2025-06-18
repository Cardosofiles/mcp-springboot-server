package br.com.cardosofiles.mcp_springboot_server.services;

import java.util.Map;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import br.com.cardosofiles.mcp_springboot_server.config.McpConfig;
import br.com.cardosofiles.mcp_springboot_server.model.McpRequest;
import br.com.cardosofiles.mcp_springboot_server.model.McpResponse;

@Service
public class McpClientService {
    @Autowired
    private McpConfig config;

    @Autowired
    private RestTemplate restTemplate;

    public Map<String, Object> callMethod(String method) {
        McpRequest request = new McpRequest();
        request.setId(UUID.randomUUID().toString());
        request.setMethod(method);
        request.setParams(Map.of());

        McpResponse response =
                restTemplate.postForObject(config.getMcpEndpoint(), request, McpResponse.class);

        return response != null ? response.getResult() : null;
    }
}
