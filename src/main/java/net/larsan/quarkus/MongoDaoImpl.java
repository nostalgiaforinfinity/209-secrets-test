package net.larsan.quarkus;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.Valid;

import com.mongodb.client.MongoCollection;

@ApplicationScoped
public class MongoDaoImpl implements MongoDao {
    
    @Inject
    @Named("dummy")
    MongoCollection<Dummy> dummies;

    @Override
    public void insert(@Valid Dummy d) {
        dummies.insertOne(d);
    }
}
