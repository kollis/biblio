package com.sow.biblio.web.util;

import java.io.IOException;
import java.util.Properties;


public abstract class Resource {
    private String resourceName;
    private boolean required;

    public abstract void loadResource(Properties properties) throws IOException;

    public Resource() {}

    public Resource(String resourceName, boolean required) {
        this.resourceName = resourceName;
        this.required = required;
    }

    /**
     * @return the resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * @param resourceName the resourceName to set
     */
    public void setResourceName(String resourceName) {
        if(resourceName==null) {
            throw new IllegalArgumentException("resourceName cannot be null");
        } else if(resourceName.trim().length()==0) {
            throw new IllegalArgumentException("resourceName cannot be empty");
        }
        this.resourceName = resourceName;
    }

    /**
     * @return the required
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * @param required the required to set
     */
    public void setRequired(boolean required) {
        this.required = required;
    }
}
