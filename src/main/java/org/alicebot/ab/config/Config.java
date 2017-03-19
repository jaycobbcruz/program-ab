package org.alicebot.ab.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    private static final Logger log = LoggerFactory.getLogger(Config.class);

    private final Properties prop = new Properties();

    public Config() {
        try (InputStream input = Config.class.getClassLoader().getResourceAsStream("application.properties")) {
            prop.load(input);
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }
    }

    public String getProperty(final String key) {
        return prop.getProperty(key);
    }

}
