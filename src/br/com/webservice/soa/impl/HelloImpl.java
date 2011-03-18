package br.com.webservice.soa.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import br.com.webservice.soa.infra.Hello;
import br.com.webservice.soa.modelo.User;

@WebService(endpointInterface = "ws.hello.Hello")
public class HelloImpl implements Hello {
    
    public String sayHello() {
        return "Olá, agora é: " + new Date();
    }
    
    public String sayHelloTo(String to) {
        return "Hi " + to + "! Agora é: " + new Date();
    }
    
    public String sayHelloToUser(User user) {
        return "Olá " + user.getUsername() + "! Agora é: " + new Date(); 
    }
    
    public User getUserFromEmail(String email) {
        return new User("Daniel", email);        
    }
    
    public List<User> getAllUsers() {
        List<User> list = new ArrayList<User>(2);
        list.add(new User("Daniel", "infoslack@gmail.com"));
        list.add(new User("Maria", "mariazinha@gmail.com"));
        
        return list;
    }
     
}