package services.HTTP;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/GET")
public class GETDemo {
    @GET
    public String getUser() {
        return "GET OK";
    }

    @GET
    @Path("/subResources")
    public String sayHello2() {
        return "GET OK2!";
    }
}
