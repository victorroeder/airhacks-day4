package com.airhacks.cors;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author airhacks.com
 */
@Path("airhacks")
public class AirhacksResource {

    @GET
    @Path("{nbr}")
    public JsonObject first(@PathParam("nbr") int nbr) {
        return Json.createObjectBuilder().add("hack", nbr).build();
    }
}
