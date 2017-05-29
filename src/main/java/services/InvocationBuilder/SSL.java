package services.InvocationBuilder;

import javax.net.ssl.SSLContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;
import java.security.NoSuchAlgorithmException;

public class SSL {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        SSLContext sslContext = SSLContext.getInstance("SSL");
        Client client = ClientBuilder.newBuilder().sslContext(sslContext).build();
        Response response = client.target("https://localhost:8080/path").request().get();
        System.out.println(response);
    }
}
