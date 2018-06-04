package services;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import java.util.LinkedList;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;


public class MongoHandler {
        private MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017/");
        private MongoClient mongoClient = new MongoClient( uri);
        private MongoDatabase database = mongoClient.getDatabase("couponsDB");
        private MongoCollection<Document> collection = database.getCollection("couponsCollection");

        public void insert(Coupon c){
            collection.insertOne(c.fetchData());
        }

        public long count(){
            return collection.count();
        }

        public List<Document> find(){
            List<Document> documentList=new LinkedList<>();
            for (Document doc:collection.find())
                documentList.add(doc);
            return documentList;
        }

        public void removeAll(){collection.drop();};
    }

