package pnepe6.common.models;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * A DAO for the entity User is simply created by extending the CrudRepository
 * interface provided by spring. The following methods are some of the ones
 * available from such interface: save, delete, deleteAll, findOne and findAll.
 * The magic is that such methods must not be implemented, and moreover it is
 * possible create new query methods working only by defining their signature!
 *
 * @author pnepe6
 */
// tag::code[]
@Transactional
public interface UserDao extends CrudRepository<pnepe6.common.models.User, Long> {

  /**
   * Return the user having the passed email or null if no user is found.
   *
   * @param email the user email.
   */
  public pnepe6.common.models.User findByEmail(String email);

} // class UserDao
// end::code[]