package services.Parameter;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/QueryParam")
public class QueryParamDemo {
    @GET
    public String getUser(@QueryParam("name")String name) {
        System.out.println("Name: " + name);
        return name;
    }

    @GET
    @Path("/subResource")
    public Response usingQueryParam(@DefaultValue("0") @QueryParam("id") String id, @DefaultValue("No Name") @QueryParam("name") String name) {
        return Response.status(200).entity("Id: " + id + ", Name: " + name).build();
    }
}
// http://localhost:8080/QueryParam?name=shawyer