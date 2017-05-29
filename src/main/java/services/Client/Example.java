package services.Client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;

public class Example {
    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();

        // GET
        WebTarget target = client.target("http://localhost:8080/GET");
        target = target.path("subResources");
        String responseData = target.request().get(String.class);
        System.out.println("GET：" + responseData);

        // POST
        WebTarget target2 = client.target("http://localhost:8080/POST");
        MultivaluedMap<String, String> postForm = new MultivaluedHashMap<String, String>();
        postForm.add("id", "1502040228");
        postForm.add("name", "John");
        String responseData2 = target2.request().post(Entity.form(postForm), String.class);
        System.out.println("POST：" + responseData2);

        // PUT
        WebTarget target3 = client.target("http://localhost:8080/PUT");
        MultivaluedMap<String, String> putForm = new MultivaluedHashMap<String, String>();
        putForm.add("name", "John");
        String responseData3 = target3.request().put(Entity.form(putForm), String.class);
        System.out.println("PUT：" + responseData3);

        // DELETE
        WebTarget target4 = client.target("http://localhost:8080/DELETE/name=John%20Doe");
        String responseData4 = target4.request().delete(String.class);
        System.out.println("DELETE：" + responseData4);

        // path parameter
        WebTarget target5 = client.target("http://localhost:8080/path");
        String responseData5 = target5.path("{id}").resolveTemplate("id", "100").request().get(String.class);
        System.out.println("Path：" + responseData5);

        // query parameter
        WebTarget target6 = client.target( "http://localhost:8080/QueryParam");
        String responseData6 = target6.path("subResource").queryParam("id", 1).queryParam("name", "John").request().get(String.class);
        System.out.println("QueryParam：" + responseData6);

        // cookie parameter
        WebTarget target7 = client.target("http://localhost:8080/CookieParam/getCookies");
        Cookie cookie = new Cookie("sessionid", "100");
        String responseData7 = target7.request().cookie(cookie).get(String.class);
        System.out.println("CookieParam：" + responseData7);

        // matrix parameter
        WebTarget target8 = client.target("http://localhost:8080/MatrixParam/getUserById");
        String responseData8 = target8.path("/6").matrixParam("name", "John").matrixParam("age", "18").request().get(String.class);
        System.out.println("MatrixParam：" + responseData8);

        // bean parameter
        WebTarget target9 = client.target("http://localhost:8080/BeanParam/getUserDetails/101;name=John;age=25?address=USA");
        String responseData9 = target9.request().get(String.class);
        System.out.println("BeanParam：" + responseData9);

        // bean parameter 2
        WebTarget target10 = client.target("http://localhost:8080/BeanParam/getUserDetails");
        String responseData10 = target10.path("{id}")
                .resolveTemplate("id", "1001")
                .matrixParam("name", "John")
                .matrixParam("age", 25)
                .queryParam("address", "USA")
                .request()
                .get(String.class);
        System.out.println("BeanParam2：" + responseData10);

        // @Produces
        WebTarget target11 = client.target("http://localhost:8080/produces/getUserList");
        String responseData11 = target11.request(MediaType.APPLICATION_XML).get(String.class);
        System.out.println("Produces：" + responseData11);

        // @Consumes
        WebTarget target12 = client.target("http://localhost:8080/consumes/usingFormParamWithConsume");
        MultivaluedMap<String, String> postForm12 = new MultivaluedHashMap<String, String>();
        postForm12.add("id", "1502040228");
        postForm12.add("name", "John");
        String responseData12 = target12.request().accept(MediaType.APPLICATION_FORM_URLENCODED_TYPE).post(Entity.form(postForm),String.class) ;
        System.out.println("Consumes：" + responseData12);
    }
}
