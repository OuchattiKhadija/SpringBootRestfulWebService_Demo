package net.examlpe.springdemo.todos;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TodoRepository extends MongoRepository<Todo,String> {

 /*   Todo findByTitle(String title);

    List<Todo> findByUserId(String userId);*/

}
