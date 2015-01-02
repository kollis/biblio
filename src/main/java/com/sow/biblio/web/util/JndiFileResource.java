package com.sow.biblio.web.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.NamingException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class JndiFileResource extends Resource {
    Log LOG = LogFactory.getLog(JndiFileResource.class);

    public JndiFileResource() {}

    public JndiFileResource(String resourceName, boolean required) {
        super(resourceName, required);
    }

    public void loadResource(Properties properties) throws IOException {
        try {
            String fileName = getEnvString();
            if(fileName==null || fileName.trim().length()==0) {
                if(isRequired()) {
                    throw new IOException("JndiResource " + getResourceName() + " was not found");
                } else {
                       LOG.warn("JndiResource " + getResourceName() + " was not found");
                }
            } else {
                loadResourceString(fileName, properties);
            }
        } catch(Throwable t) {
            if(isRequired()) {
                if(t instanceof IOException) {
                    throw (IOException)t;
                } else {
                    throw new RuntimeException(t);
                }
            } else {
                LOG.warn("JndiResource " + getResourceName() + " was not found (" + t.getClass().getName() + ":" + t.getMessage() + ")");
            }
        }
    }

    /**
     *
     * @param fileName
     * @param properties
     * @throws IOException
     */
    private void loadResourceString(String fileName, Properties properties) throws IOException {
        LOG.info("loading JndiResource '" + getResourceName() + "', fileName = '" + fileName + "'");
        File file = new File(fileName);
        if(!file.exists()) {
            if (isRequired()) {
                throw new FileNotFoundException("JndiFileResource " + getResourceName() + " has value '" + fileName + "', but this file was not found");
            } else {
                LOG.warn("JndiFileResource " + getResourceName() + " has value '" + fileName + "', but this file was not found");
            }
        } else if(!file.canRead()) {
            if (isRequired()) {
                throw new FileNotFoundException("JndiFileResource " + getResourceName() + " has value '" + fileName + "', but this file cannot be read");
            } else {
                LOG.warn("JndiFileResource " + getResourceName() + " has value '" + fileName + "', but this file cannot be read");
            }
        } else {
            LOG.info("loading JndiFileResource '" + getResourceName() + "'");
            InputStream inputStream = new FileInputStream(file);
            properties.load(inputStream);
        }
    }

    /**
     * returns the value of the environment variable 'resourceName',
     * which must be a string.
     *
     * @param envJndiName
     * @return
     * @throws java.lang.Exception
     */
    private String getEnvString() throws NamingException{
        javax.naming.Context initialContext = new javax.naming.InitialContext();
        Context environmentContext = (Context)initialContext.lookup("java:/comp/env");
        return (String) environmentContext.lookup(getResourceName());
    }

}
