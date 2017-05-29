package services.Basic;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/path/class/{name}")
public class PathInClass {
    @GET
    @Produces("text/plain")
    public String sayHello(@PathParam("name") String name) {
        return "Hello, " + name;
    }
}
