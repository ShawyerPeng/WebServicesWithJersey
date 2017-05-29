package services.Parameter;

import javax.ws.rs.CookieParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Cookie;

@Path("/CookieParam")
public class CookieParamDemo {
    @GET
    @Path("/getCookies")
    public String getCookies(@CookieParam("sessionid") int sessionId) {
        return "Session Id: " + sessionId;
    }

    @GET
    @Path("/getCookies2")
    public String getCookies2(@DefaultValue("10") @CookieParam("sessionid") int sessionId) {
        return "Session Id: " + sessionId;
    }

    @GET
    @Path("/getCookies3")
    public String getCookies3(@CookieParam("user-agent") Cookie userAgentCookie) {
        return "Name: " + userAgentCookie.getName() +
                "Value: " + userAgentCookie.getValue() +
                "Domain: " + userAgentCookie.getDomain() +
                "Path: " + userAgentCookie.getPath() +
                "Version: " + userAgentCookie.getVersion();
    }
}
// http://localhost:8080/CookieParam/getCookies