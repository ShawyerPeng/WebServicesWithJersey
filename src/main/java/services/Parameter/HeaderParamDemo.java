package services.Parameter;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/HeaderParam")
public class HeaderParamDemo {
    @GET
    @Path("/getUserAgent")
    public String getUserDevice(@HeaderParam("user-agent") String userAgent, @HeaderParam("Content-Type") MediaType contentType) {
        return "User Agent: " + userAgent + ", Content-Type: " + contentType ;
    }
}
// http://localhost:8080/HeaderParam/getUserAgent