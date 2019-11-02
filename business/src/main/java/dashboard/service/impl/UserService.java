package dashboard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dashboard.dao.model.UserModel;
import dashboard.dao.repository.UserRepository;
import dashboard.service.IUserService;

@Service
@Transactional
public class UserService extends AbstractService<UserModel, Integer> implements IUserService {

    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
