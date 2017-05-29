package services.HTTP;

import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/DELETE")
public class DELETEDemo {
    @DELETE
    @Path("/{name}")
    public String delete(@PathParam("name")String name) {
        System.out.println("DELETE: " + name);
        return "DELETE OK!";
    }
}
// curl -X DELETE -d "name=John&id=100" http://localhost:8080/PUT