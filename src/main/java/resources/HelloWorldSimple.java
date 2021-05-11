package resources;
import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/plain-text")
public class HelloWorldSimple {
    @GET
    public String simpleHello() {
        return "Hello! How are you today?";
    }
}
