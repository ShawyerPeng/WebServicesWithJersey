package services.Parameter;

import javax.ws.rs.*;

public class UserBean {
    @PathParam("id")
    private String id;

    @MatrixParam("name")
    private String name;

    @MatrixParam("age")
    private String age;

    @DefaultValue("No address provided")
    @QueryParam("address")
    private String address;

    @HeaderParam("user-agent")
    private String userAgent;

    public String toString(){
        return "Id: " + id +
                "\nName: " + name +
                "\nAge: " + age +
                "\nAddress: " + address +
                "\nUser Agent: " + userAgent + "\n" ;
    }
}
