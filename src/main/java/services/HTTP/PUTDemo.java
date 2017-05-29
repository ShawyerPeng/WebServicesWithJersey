package services.HTTP;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/PUT")
public class PUTDemo {
    @PUT
    public String updateUser(String userData) {
        System.out.println("PUT");
        System.out.println("User Data: " + userData);
        return "PUT OK!";
    }
}
// curl -X PUT -d "name=John&id=100" http://localhost:8080/PUT