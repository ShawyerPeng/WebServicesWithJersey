package services.HTTP;

import services.Parameter.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/produces")
@Produces("text/plain")
public class ProducesDemo {
    @GET
    @Path("/plain")
    public String greet() {
        return "text/plain";
    }

    @GET
    @Path("/html")
    @Produces("text/html")
    public String greetUser() {
        return "text/html";
    }

    @GET
    @Path("/getUserList")
    @Produces({ "application/xml" })
    public User[] getList() {
        User[] list = new User[3];
        list[0] = new User("John");
        list[1] = new User("William");
        list[2] = new User("Suzzane");
        return list;
    }
}
// http://localhost:8080/produces/plain
// http://localhost:8080/produces/html
// http://localhost:8080/produces/getUserList