package de.antrophos.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

public class LotOfLogTest {

    private static final Logger logger = LogManager.getLogger(LotOfLogTest.class);

    @Test
    public void test() {
        // Log a lot of messages
        for (int i = 0; i < 10000; i++) {
            logger.info("Logging message number {}. We need to create some noise to blow up the log file!" , i);
        }
    }
}
