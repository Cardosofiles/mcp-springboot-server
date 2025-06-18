package br.com.cardosofiles.mcp_springboot_server.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.cardosofiles.mcp_springboot_server.services.McpClientService;

@RestController
@RequestMapping("/mcp")
public class McpClientController {

    @Autowired
    private McpClientService service;

    @GetMapping("/resources")
    public Map<String, Object> listResources() {
        return service.callMethod("resources.list");
    }

    @GetMapping("/tools")
    public Map<String, Object> listTools() {
        return service.callMethod("tools.list");
    }
}
