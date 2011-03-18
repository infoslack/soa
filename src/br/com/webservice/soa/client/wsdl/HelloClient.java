package br.com.webservice.soa.client.wsdl;

import java.util.List;

public class HelloClient {
    
    public static void main(String[] args) {
        HelloImplService service = new HelloImplService();
        Hello hello = service.getHelloImplPort();
        
        System.out.println(hello.sayHello());
        System.out.println(hello.sayHelloTo("Daniel"));
        
        User u = new User();
        u.setUsername("Romero");
        u.setEmail("romero@gmail.com");
        
        System.out.println(hello.sayHelloToUser(u));
        u = hello.getUserFromEmail("romero@gmail.com");
        System.out.println("User: " + u.getUsername());
        
        List<User> list = hello.getAllUsers();
        
        for(int i = 0; i < list.size(); i++) {
            u = list.get(i);
            System.out.println("U" + i + ": " + u.getUsername());
        }
    }

}
