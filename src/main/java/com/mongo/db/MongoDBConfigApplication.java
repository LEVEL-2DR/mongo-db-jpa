package com.mongo.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.mongo.db.repository")
public class MongoDBConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDBConfigApplication.class, args);
	}

}
