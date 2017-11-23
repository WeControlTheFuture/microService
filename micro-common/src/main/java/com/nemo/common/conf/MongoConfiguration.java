package com.nemo.common.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClientURI;

@Configuration
@ComponentScan({ "com.nemo" })
//@EnableMongoRepositories(repositoryBaseClass = BaseMongoRepositoryImpl.class, basePackages = "com.nemo.dao")
public class MongoConfiguration {

	@Autowired
	private MongoDbProperties mongoDbProperties;

	@Bean
	public MongoDbFactory mongoDbFactory() throws Exception {
		return new SimpleMongoDbFactory(new MongoClientURI(mongoDbProperties.getMongoDbUri()));
	}

	@Bean
	public MongoTemplate mongoTemplate() throws Exception {
		return new MongoTemplate(mongoDbFactory());
	}
}
