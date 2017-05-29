package services.Parameter;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/BeanParam")
public class BeanParamDemo {
    @GET
    @Path("/getUserDetails/{id}")
    public String getUser(@BeanParam UserBean userBean) {
        return "User Bean: " + userBean.toString();
    }
}
// curl -X GET http://localhost:8080/BeanParam/getUserDetails/1;name=John;age=25?address=USA