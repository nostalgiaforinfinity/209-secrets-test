package net.larsan.quarkus;

import javax.enterprise.context.ApplicationScoped;
import javax.validation.Valid;

@ApplicationScoped
public interface MongoDao {
    
    public void insert(@Valid Dummy d);

}
