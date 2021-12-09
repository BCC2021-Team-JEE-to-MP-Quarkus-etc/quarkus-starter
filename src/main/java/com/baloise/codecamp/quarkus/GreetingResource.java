package com.baloise.codecamp.quarkus;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@RequestScoped
public class GreetingResource {

    @Path("{name}/age:\\d+")
    @GET
    public String itsMoreThanAHello(String name, String age){
        return "Hello my Name is " + name + " and I'm " + age + "old!";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello I'm the new Quarkus Container, Serverless is Cool";
    }
}