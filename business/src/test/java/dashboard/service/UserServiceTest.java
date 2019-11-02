package dashboard.service;

import java.util.List;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import dashboard.dao.model.UserModel;

@Transactional
public class UserServiceTest extends AbstractServiceTests {

    @Test
    @Rollback(false)
    public void testFindAll() {

        List<UserModel> users = userService.findAll();

        System.out.println("Size = " + users.size());
    }
}
