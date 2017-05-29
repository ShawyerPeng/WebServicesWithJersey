package services.HTTP;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/POST")
public class POSTDemo {
    @POST
    public String addUser(@FormParam("id") String id, @FormParam("name") String name){
        System.out.println("POST");
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        return "POST OK!";
    }
}
// curl -X POST -d "name=John&id=100" http://localhost:8080/POST
