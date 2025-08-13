package de.antrophos.log4j;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

public class EnvironmentSetupTest {

    public static final Logger logger = LogManager.getLogger(EnvironmentSetupTest.class);

    @Test
    public void helloWorldTest() {

        logger.info("Hello World!");
    }

    @Test
    public void getEnv_envSetByPom_valuePresent() {

        String fooEnv = System.getenv("foo-env");

        assertEquals("bar", fooEnv, "Environment variable 'foo-env' should be set to 'bar' by the pom.xml");
    }

    @Test
    public void getProperties_propSetByPom_valuePresent() {

        String fooSys = System.getProperty("foo-sys");

        assertEquals("bar", fooSys, "System property 'foo-sys' should be set to 'bar' by the pom.xml");
    }
}
