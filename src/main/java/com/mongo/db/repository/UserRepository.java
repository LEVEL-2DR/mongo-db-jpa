package com.mongo.db.repository;

import com.mongo.db.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author dinakar on 06/10/21
 */

public interface UserRepository extends MongoRepository<User, String> {
}
