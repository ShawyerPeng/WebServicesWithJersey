package services.Basic;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/path")
public class PathDemo {
    // resource method
    @GET
    public String sayHello() {
        return "Hello World!";
    }

    @GET
    @Path("/subResources")
    public String sayHello2() {
        return "Hello World2!";
    }

    @GET
    @Path("{id}")
    public Response get(@PathParam("id") int id) {
        return Response.status(200).entity("Id: " + id).build();
    }
}
// http://localhost:8080/path                -> 调用第一个资源方法sayHello()
// http://localhost:8080/path/subResources   -> 调用sayHello2()