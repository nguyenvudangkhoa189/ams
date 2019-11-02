package dashboard.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import dashboard.dao.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer>, JpaSpecificationExecutor<UserModel> {

}
