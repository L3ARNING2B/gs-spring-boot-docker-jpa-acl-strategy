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
@Table(name = "acl_entry")
public class AclEntry {
    private @Id
    @GeneratedValue
    Long id;

    private String acl_object_identity;
    private String ace_order;
    private String sid;
    private String mask;
    private Boolean granting;
    private Boolean audit_success;
    private Boolean audit_faillure;

    protected AclEntry() {}
    public AclEntry(String acl_object_identity, String ace_order, String sid, String mask, Boolean granting, Boolean audit_success, Boolean audit_faillure) {
        this.acl_object_identity = acl_object_identity;
        this.ace_order = ace_order;
        this.sid = sid;
        this.mask = mask;
        this.granting = granting;
        this.audit_success = audit_success;
        this.audit_faillure = audit_faillure;
    }
}
// end::code[]