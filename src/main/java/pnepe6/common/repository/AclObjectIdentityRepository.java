package pnepe6.common.repository;

import org.springframework.data.repository.CrudRepository;
import pnepe6.common.models.AclObjectIdentity;

/**
 * Created by agd on 12/1/16.
 */
// tag::code[]
public interface AclObjectIdentityRepository extends CrudRepository<AclObjectIdentity, Long> {
    AclObjectIdentity save(AclObjectIdentity aclObjectIdentity);
}
// end::code[]
