package com.sow.biblio.web.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ClassPathResource extends Resource {

    Log LOG = LogFactory.getLog(ClassPathResource.class);

    public ClassPathResource() {}

    public ClassPathResource(String resourceName, boolean required) {
        super(resourceName, required);
    }
    
    public void loadResource(Properties properties) throws IOException {
        InputStream inputStream = SowProperties.class.getResourceAsStream(getResourceName());
        if (inputStream == null) {
            if (isRequired()) {
                throw new FileNotFoundException("ClasspathResource '" + getResourceName() + "' was not found");
            } else {
                LOG.warn("ClasspathResource '" + getResourceName() + "' was not found");
            }
        } else {
            LOG.info("loading ClasspathResource '" + getResourceName() + "'");
            properties.load(inputStream);
        }
    }
}
