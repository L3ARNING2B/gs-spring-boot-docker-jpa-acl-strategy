package pnepe6.common.repository;

import pnepe6.common.models.User;
import org.springframework.data.repository.CrudRepository;

// tag::code[]
public interface UserRepository extends CrudRepository<User, Long> {
    User save(User user);

//    public User findOne(Integer id);
//
//    public List<Company> findAll();
//
//    public Long count();
//
//    public void delete(Company company);
//
//    public Boolean exists(Integer id);
}
// end::code[]