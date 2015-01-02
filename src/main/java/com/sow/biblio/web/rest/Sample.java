package com.sow.biblio.web.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
@Path("/sample")
public class Sample {

    private static final Log LOG = LogFactory.getLog(Sample.class);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHello() throws Exception {
    	LOG.debug("entered sayHello method of sample service");
    	
        return "sample String from Sample rest service";
    }
}
