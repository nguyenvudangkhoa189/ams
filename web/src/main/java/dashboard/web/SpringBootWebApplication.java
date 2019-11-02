package dashboard.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import dashboard.web.listener.SessionListener;

@SpringBootApplication
@ComponentScan(basePackages = "dashboard")
public class SpringBootWebApplication extends SpringBootServletInitializer {

    public static final Logger logger = LoggerFactory.getLogger(SpringBootWebApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootWebApplication.class);
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        logger.info("*************************************************************");
        logger.info("***             START Admin Management System             ***");

        super.onStartup(servletContext);
        servletContext.addListener(new SessionListener());

        logger.info("***             START Admin Management System END         ***");
        logger.info("*************************************************************");
    }
}
