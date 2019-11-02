package dashboard.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import dashboard.dao.DaoApplication;

@SpringBootApplication
@ComponentScan(basePackages = "dashboard.service")
@Import(DaoApplication.class)
public class ServiceApplication {

    private static Logger logger = LoggerFactory.getLogger(ServiceApplication.class);

    public static void main(String[] args) {
        logger.info("Start SERVICE program");
        SpringApplication.run(ServiceApplication.class, args);
        logger.info("Start SERVICE program");
    }

}
