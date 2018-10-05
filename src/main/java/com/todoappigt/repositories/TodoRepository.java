package com.todoappigt.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.todoappigt.model.ToDoModel;

@Repository
public interface TodoRepository extends MongoRepository<ToDoModel, String> {

}
