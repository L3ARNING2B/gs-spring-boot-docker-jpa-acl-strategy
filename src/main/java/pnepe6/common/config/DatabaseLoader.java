package pnepe6.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pnepe6.common.models.*;
import pnepe6.common.repository.*;

// tag::code[]
@Component
public class DatabaseLoader implements CommandLineRunner {

    private final UserRepository users;
    private final AclSidRepository aclSids;
    private final AclClassRepository aclClasses;
    private final AclObjectIdentityRepository aclObjectIdentities;
    private final AclEntryRepository aclEntries;


    @Autowired
    public DatabaseLoader(UserRepository userRepository,
                          AclSidRepository aclSidRepository,
                          AclClassRepository aclClassRepository,
                          AclObjectIdentityRepository aclObjectIdentityRepository,
                          AclEntryRepository aclEntryRepository
                          ) {

        this.users = userRepository;
        this.aclSids = aclSidRepository;
        this.aclClasses = aclClassRepository;
        this.aclObjectIdentities = aclObjectIdentityRepository;
        this.aclEntries = aclEntryRepository;

    }

    @Override
    public void run(String... strings) throws Exception {

        this.users.save(new User("agd@kopaxgroup.com", "agd"));
        this.users.save(new User("ajt@kopaxgroup.com", "ajt"));
        this.users.save(new User("dka@kopaxgroup.com", "dka"));


        this.aclSids.save(new AclSid(true, "'agd'"));
        this.aclSids.save(new AclSid(true, "'ajt'"));
        this.aclSids.save(new AclSid(false, "'dka'"));

        this.aclClasses.save(new AclClass("org.krams.tutorial.domain.AdminPost"));
        this.aclClasses.save(new AclClass("org.krams.tutorial.domain.PersonalPost"));
        this.aclClasses.save(new AclClass("org.krams.tutorial.domain.PublicPost"));

        this.aclObjectIdentities.save(new AclObjectIdentity("1", "1", "NULL", "1", true));
        this.aclObjectIdentities.save(new AclObjectIdentity("1", "2", "NULL", "1", true));
        this.aclObjectIdentities.save(new AclObjectIdentity("1", "3", "NULL", "1", true));
        this.aclObjectIdentities.save(new AclObjectIdentity("2", "1", "NULL", "1", true));
        this.aclObjectIdentities.save(new AclObjectIdentity("2", "2", "NULL", "1", true));
        this.aclObjectIdentities.save(new AclObjectIdentity("2", "3", "NULL", "1", true));
        this.aclObjectIdentities.save(new AclObjectIdentity("3", "1", "NULL", "1", true));
        this.aclObjectIdentities.save(new AclObjectIdentity("3", "2", "NULL", "1", true));
        this.aclObjectIdentities.save(new AclObjectIdentity("3", "3", "NULL", "1", true));

        this.aclEntries.save(new AclEntry("1", "1", "1", "1", false, false, false));
        this.aclEntries.save(new AclEntry("2", "1", "1", "1", false, false, false));
        this.aclEntries.save(new AclEntry("3", "1", "1", "1", false, false, false));
        this.aclEntries.save(new AclEntry("1", "2", "1", "2", false, false, false));
        this.aclEntries.save(new AclEntry("2", "2", "1", "2", false, false, false));
        this.aclEntries.save(new AclEntry("3", "2", "1", "2", false, false, false));
        this.aclEntries.save(new AclEntry("4", "1", "1", "1", false, false, false));
        this.aclEntries.save(new AclEntry("5", "1", "1", "1", false, false, false));
        this.aclEntries.save(new AclEntry("6", "1", "1", "1", false, false, false));
        this.aclEntries.save(new AclEntry("7", "1", "1", "1", false, false, false));
        this.aclEntries.save(new AclEntry("8", "1", "1", "1", false, false, false));
        this.aclEntries.save(new AclEntry("9", "1", "1", "1", false, false, false));
        this.aclEntries.save(new AclEntry("7", "2", "1", "2", false, false, false));
        this.aclEntries.save(new AclEntry("8", "2", "1", "2", false, false, false));
        this.aclEntries.save(new AclEntry("9", "2", "1", "2", false, false, false));
        this.aclEntries.save(new AclEntry("4", "3", "2", "1", false, false, false));
        this.aclEntries.save(new AclEntry("5", "3", "2", "1", false, false, false));
        this.aclEntries.save(new AclEntry("6", "3", "2", "1", false, false, false));
        this.aclEntries.save(new AclEntry("4", "4", "2", "2", false, false, false));
        this.aclEntries.save(new AclEntry("5", "4", "2", "2", false, false, false));
        this.aclEntries.save(new AclEntry("6", "4", "2", "2", false, false, false));
        this.aclEntries.save(new AclEntry("7", "3", "2", "1", false, false, false));
        this.aclEntries.save(new AclEntry("8", "3", "2", "1", false, false, false));
        this.aclEntries.save(new AclEntry("9", "3", "2", "1", false, false, false));
        this.aclEntries.save(new AclEntry("7", "4", "2", "2", false, false, false));
        this.aclEntries.save(new AclEntry("8", "4", "2", "2", false, false, false));
        this.aclEntries.save(new AclEntry("9", "4", "2", "2", false, false, false));
        this.aclEntries.save(new AclEntry("7", "5", "3", "1", false, false, false));
        this.aclEntries.save(new AclEntry("8", "5", "3", "1", false, false, false));
        this.aclEntries.save(new AclEntry("9", "5", "3", "1", false, false, false));
//
//        this.adminPosts.save(new AdminPost("2011-01-03 21:37:58", "Custom post #1 from admin"));
//        this.adminPosts.save(new AdminPost("2011-01-04 21:37:58", "Custom post #2 from admin"));
//        this.adminPosts.save(new AdminPost("2011-01-05 21:37:58", "Custom post #3 from admin"));
//
//        this.personalPosts.save(new PersonalPost("2011-01-06 21:37:58", "Custom post #1 from user"));
//        this.personalPosts.save(new PersonalPost("2011-01-07 21:37:58", "Custom post #2 from user"));
//        this.personalPosts.save(new PersonalPost("2011-01-8 21:37:58", "Custom post #3 from user"));
//
//        this.publicPosts.save(new PublicPost("21:40:44 21:37:58", "Custom post #1 from public"));
//        this.publicPosts.save(new PublicPost("21:40:48 21:37:58", "Custom post #2 from public"));
//        this.publicPosts.save(new PublicPost("21:41:08 21:37:58", "Custom post #3 from public"));

    }
}
// end::code[]