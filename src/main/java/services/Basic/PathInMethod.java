package services.Basic;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/path/method")
public class PathInMethod {
    @GET
    @Produces("text/plain")
    @Path("{name}")
    public String sayHello(@PathParam("name") String name) {
        return "Hello, " + name;
    }
}
