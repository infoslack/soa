package br.com.webservice.soa.infra;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.webservice.soa.modelo.User;

@WebService
public interface Hello {
    
    @WebMethod String sayHello();
    @WebMethod String sayHelloTo(String to);
    @WebMethod String sayHelloToUser(User user);
    @WebMethod User getUserFromEmail(String email);
    @WebMethod List<User> getAllUsers();

}
