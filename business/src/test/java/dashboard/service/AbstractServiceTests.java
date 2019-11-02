package dashboard.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import dashboard.service.impl.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public abstract class AbstractServiceTests {

    @Autowired
    protected UserService userService;
}
