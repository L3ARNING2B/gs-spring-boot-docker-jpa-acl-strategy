package pnepe6.common.repository;

import org.springframework.data.repository.CrudRepository;
import pnepe6.common.models.AclSid;

/**
 * Created by agd on 12/1/16.
 */
// tag::code[]
public interface AclSidRepository extends CrudRepository<AclSid, Long> {
    AclSid save(AclSid aclSid);
}
// end::code[]