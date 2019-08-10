package com.test.testrail.config;

import com.test.testrail.config.model.ConfigConstants;
import com.test.testrail.config.model.Configuration;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigHolder {

    private final static Logger logger = Logger.getLogger(ConfigHolder.class);
    private static Configuration configuration;

    public static Configuration getConfiguration() {
        if (configuration == null){
            initConfiguration();
        }
        return configuration;
    }

    private static void initConfiguration() {
        configuration = new Configuration();
        Properties properties = getProperties();
        setConfiguration(properties);
        System.out.println(configuration);
    }

    private static Properties getProperties() {
        Properties properties = new Properties();
        try (InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("default.properties")) {
            properties.load(input);
        } catch (IOException e) {
            logger.error("cannot load properties from default.properties");
        }
        return properties;
    }

    /**
     * Replaces property read from the configuration file with System property, if present.
     *
     * @param properties values loaded from configuration file
     * @param name property to replace
     * @return property from the file or System property
     */
    private static String getProperty(Properties properties, String name) {
        String property = (System.getProperty(name) != null) ? System.getProperty(name) : properties.getProperty(name);
        if (property == null){
            logger.warn("property " + name + " isn't set!");
        }
        return property;
    }

    private static void setConfiguration(Properties properties) {
        configuration.setBaseUrl(getProperty(properties, ConfigConstants.BASE_URL));
        configuration.setUsername(getProperty(properties, ConfigConstants.USERNAME));
        configuration.setPassword(getProperty(properties, ConfigConstants.PASSWORD));
        configuration.setProjectId(getProperty(properties, ConfigConstants.PROJECT_ID));
    }
}
