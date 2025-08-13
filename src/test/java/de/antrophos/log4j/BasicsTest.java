package de.antrophos.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

public class BasicsTest {

    public static final Logger logger = LogManager.getLogger(BasicsTest.class);

    @Test
    public void test() {
        logger.info("Hello World!");
    }
}
