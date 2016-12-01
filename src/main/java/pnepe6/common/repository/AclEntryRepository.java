package pnepe6.common.repository;

import org.springframework.data.repository.CrudRepository;
import pnepe6.common.models.AclEntry;

/**
 * Created by agd on 12/1/16.
 */
// tag::code[]
public interface AclEntryRepository extends CrudRepository<AclEntry, Long> {
    AclEntry save(AclEntry aclEntry);
}
// end::code[]