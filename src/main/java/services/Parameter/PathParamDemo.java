package services.Parameter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/PathParam")
public class PathParamDemo {
    @GET
    @Path("{name}")
    public String getUserByName(@PathParam("name")String name) {
        return name;
    }
}
// http://localhost:8080/PathParam/shawyer