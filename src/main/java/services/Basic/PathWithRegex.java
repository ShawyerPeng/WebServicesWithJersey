package services.Basic;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/path/regex")
public class PathWithRegex {
    @GET
    @Produces("text/plain")
    @Path("{name: ([a-zA-Z])*}")
    public String sayHello(@PathParam("name") String name) {
        return "Hello, " + name;
    }
}
