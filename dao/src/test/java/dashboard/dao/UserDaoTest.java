package dashboard.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import dashboard.dao.model.UserModel;

@Transactional
public class UserDaoTest extends AbstractDaoTest {

    @Test
    public void testFindAll() {

        List<UserModel> users = userRepository.findAll();

        System.out.println("Size = " + users.size());
    }
}
