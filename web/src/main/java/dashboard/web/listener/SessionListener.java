package dashboard.web.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SessionListener implements HttpSessionListener {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void sessionCreated(HttpSessionEvent sessionEvent) {
        logger.info("==== Session is created ====");
        sessionEvent.getSession().setMaxInactiveInterval(86400);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent sessionEvent) {
        logger.info("==== Session is destroyed ====");
    }
}
