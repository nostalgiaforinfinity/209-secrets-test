package net.larsan.quarkus;

import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.inject.Singleton;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Indexes;

@Singleton
public class Producer {
    
    @Produces
    @Singleton
    @Named("dummy")
    MongoCollection<Dummy> userCollection(MongoClient client) {
        MongoDatabase db = client.getDatabase("test-service");
        MongoCollection<Dummy> col = db.getCollection("dummy", Dummy.class);
        col.createIndex(Indexes.ascending("email"));
        return col;
    }
}
