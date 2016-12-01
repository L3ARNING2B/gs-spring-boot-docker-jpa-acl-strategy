package pnepe6.common.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by agd on 12/1/16.
 */
// tag::code[]
@Data
@Entity
@Table(name = "acl_class")
public class AclClass {
    private @Id @GeneratedValue Long id;

    private String aclClass;

    protected AclClass() {}
    public AclClass(String aclClass) {
        this.aclClass = aclClass;
    }
}
// end::code[]