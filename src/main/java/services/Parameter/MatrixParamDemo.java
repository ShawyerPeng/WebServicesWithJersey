package services.Parameter;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/MatrixParam")
public class MatrixParamDemo {
    @GET
    @Path("/getUserById/{userId}")
    public Response getUserById(@PathParam("userId") String userId, @MatrixParam("name") String name,
                                @DefaultValue("15") @MatrixParam("age") String age) {
        return Response.status(200).entity("Id: " + userId + ", Name: " + name + ", Age: " + age).build();
    }
}
// http://localhost:8080/MatrixParam/getUserById/1;name=John;age=10