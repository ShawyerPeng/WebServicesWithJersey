package services.Parameter;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MultivaluedMap;

@Path("/FormParam")
public class FormParamDemo {
    @POST
    @Path("/addUser")
    public void addUser(@FormParam("name") String name, @FormParam("id") String id){
        System.out.println("Add User:");
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }

    @POST
    @Path("/addUser2")
    public String addUser2(MultivaluedMap<String, String> formData) {
        return "Form Data: " + formData;
    }
}
// curl -X POST -d "name=John&id=100" http://localhost:8080/FormParam/addUser
// curl -X POST -d "name=John&id=100" http://localhost:8080/FormParam/addUser2