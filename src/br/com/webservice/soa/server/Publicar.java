package br.com.webservice.soa.server;

import javax.xml.ws.Endpoint;

import br.com.webservice.soa.impl.HelloImpl;

public class Publicar {
    
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:54321/hello", new HelloImpl());
    }

}
