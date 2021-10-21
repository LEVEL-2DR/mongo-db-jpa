package com.mongo.db.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author dinakar on 06/10/21
 */
@Data
@Document(collection = "collection")
public class User {
    @Id
    private String _id;

    private String name;

    @Override
    public String toString() {
        return "User{" +
                "_id='" + _id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
