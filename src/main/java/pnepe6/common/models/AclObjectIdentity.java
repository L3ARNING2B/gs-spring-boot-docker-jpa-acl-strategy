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
@Table(name = "object_identity")
public class AclObjectIdentity {
    private @Id
    @GeneratedValue
    Long id;

    private String objectIdClass;
    private String objectIdIdentity;
    private String parentObject;
    private String ownerSid;
    private Boolean entriesInheriting;

    protected AclObjectIdentity() {}

    public AclObjectIdentity(String objectIdClass, String objectIdIdentity, String parentObject, String ownerSid, Boolean entriesInheriting) {
        this.objectIdClass = objectIdClass;
        this.objectIdIdentity = objectIdIdentity;
        this.parentObject = parentObject;
        this.ownerSid = ownerSid;
        this.entriesInheriting = entriesInheriting;
    }
}
// end::code[]