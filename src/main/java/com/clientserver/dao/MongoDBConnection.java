package com.clientserver.dao;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnection {
    private static final String MONGO_URI = "mongodb+srv://jaltamiranda1871:tablet146@cluster0.r5s2w.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
    private static final String DATABASE_NAME = "jaltamiranda1871";

    private static MongoClient mongoClient = null;

    public static MongoDatabase getDatabase() {
        if (mongoClient == null) {
            mongoClient = MongoClients.create(MONGO_URI);
        }
        return mongoClient.getDatabase(DATABASE_NAME);
    }
}