package com.medicare.we.user.repo;

import com.medicare.we.user.entity.Users;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UsersRepo extends MongoRepository<Users, String> {

}
