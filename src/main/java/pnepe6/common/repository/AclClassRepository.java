package pnepe6.common.repository;

import org.springframework.data.repository.CrudRepository;
import pnepe6.common.models.AclClass;

/**
 * Created by agd on 12/1/16.
 */
// tag::code[]
public interface AclClassRepository extends CrudRepository<AclClass, Long> {
    AclClass save(AclClass aclClass);
}
// end::code[]