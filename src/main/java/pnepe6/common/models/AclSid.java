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
@Table(name = "acl_sid")
public class AclSid {

    private @Id
    @GeneratedValue
    Long id;

    private Boolean principal;
    private String sid;

    protected AclSid() {}
    public AclSid(Boolean principal, String sid) {
        this.principal = principal;
        this.sid = sid;
    }
}
// end::code[]