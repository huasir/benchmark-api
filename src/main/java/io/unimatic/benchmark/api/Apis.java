package io.unimatic.benchmark.api;

import org.springframework.stereotype.Component;

import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Component("api")
@Path("/api")
public class Apis {

    @Path("/hs")
    @POST
    public Response hsBegin() {
        return Response.ok().build();
    }

    @Path("/hs")
    @DELETE
    public Response hsEnd() {
        return Response.ok().build();
    }

}
