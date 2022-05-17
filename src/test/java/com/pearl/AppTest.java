package com.pearl;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Config.class)
public class AppTest {
    private static final Logger logger = LoggerFactory.getLogger(AppTest.class);

    @Autowired
    private Car car;

    @Test
    public void shouldAnswerWithTrue() {
        logger.info("Hello logger........");
        car.printCarDetails();
        assertTrue( true );
    }
}
