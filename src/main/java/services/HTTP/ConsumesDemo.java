package services.HTTP;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.MimeMultipart;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/consumes")
@Consumes("multipart/related")
public class ConsumesDemo {
    @POST
    public String processMultipart(MimeMultipart multipartData) {
        return "multipart/related";
    }

    // @POST
    // @Consumes("application/x-www-form-urlencoded")
    // public String processForm(FormURLEncodedProperties formData) {
    //     System.out.println("");
    // }

    @POST
    @Path("/usingFormParamWithConsume")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String greet(@FormParam("id") String id, @FormParam("name") String name) {
        return "Hello, " + name + ", Your ID is " + id;
    }
}
