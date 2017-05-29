package services.Parameter;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/DefaultValue")
public class DefaultValueDemo {
    @GET
    @Path("/defaultQuery")
    public String getUser(@QueryParam("name")String name, @DefaultValue("15")@QueryParam("age")String age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        return name;
    }
}
// http://localhost:8080/DefaultValue/defaultQuery?name=John
// http://localhost:8080/DefaultValue/defaultQuery?name=John&age=20