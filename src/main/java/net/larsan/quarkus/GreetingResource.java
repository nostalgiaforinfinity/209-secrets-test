package net.larsan.quarkus;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@ApplicationScoped
public class GreetingResource {

    @Inject
    MongoDao dao;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        dao.insert(new Dummy("666"));
        return "Hello";
    }
}