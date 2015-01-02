package com.sow.biblio.web.util;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SowProperties extends Properties {

	private static final long serialVersionUID = 1L;
	private static final Log LOG = LogFactory.getLog(SowProperties.class);
    private Properties properties;
    private List<Resource> resources;

    public SowProperties() {
    }

    public SowProperties(List<Resource> resources) throws IOException {
        properties = new Properties();
        setResources(resources);
    }

    /**
     * @param resources the resources to set
     */
    public void setResources(List<Resource> resources) throws IOException {
        for (Resource resource : resources) {
            resource.loadResource(this);
        }
    }
}