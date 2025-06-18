package br.com.cardosofiles.mcp_springboot_server.model;

import java.util.Map;

public class McpRequest {
    private String jsonrpc = "2.0";
    private String method;
    private Map<String, Object> params;
    private String id;

    public String getJsonrpc() {
        return jsonrpc;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
