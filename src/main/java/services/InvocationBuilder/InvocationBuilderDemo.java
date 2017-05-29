package services.InvocationBuilder;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class InvocationBuilderDemo {
    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/path");
        Invocation.Builder builder = target.request("text/plain");
        Invocation invocation = builder.buildGet();
        String responseData = invocation.invoke(String.class);
        System.out.println(responseData);

        Response response = invocation.invoke();
        String responseData2 = response.readEntity(String.class);
        System.out.println(responseData2);
    }
}
