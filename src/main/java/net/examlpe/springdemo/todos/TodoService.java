package net.examlpe.springdemo.todos;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class TodoService {

    //tests with  mongoDb

    @Autowired
    private TodoRepository todoRepository;

    /**
     * Get all todos
     * @return List of todos
     */

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public Todo getById(String id) {
 /*       try {
            return todoRepository.findById(id).get();
        }catch (NoSuchElementException ex) {
            //throw new ChangeSetPersister.NotFoundException(String.format("No Record with the id [%s] was found in our database", id));
        }
*/
        return todoRepository.findById(id).get();
    }
    public Todo save(Todo todo) {
        return todoRepository.insert(todo);


        //if want to reurn booleean
        //return todoRepository.insert(todo) == null ? false : true
    }

    public void delete(String id) {
        todoRepository.deleteById(id);
    }

   /*

    public List<Todo> findByUser(String id) {
        return todoRepository.findByUserId(id);
    }






    */

   /** //tests before add mongoDb
   private List<Todo> data = new ArrayList<>(Arrays.asList(
            new Todo(1, "hi todo", "description to do first"),
            new Todo(3, "Seconde todo", "description to do 2"),
            new Todo(4, "3 todo", "description to do 3"),
            new Todo(5, "4 todo", "description to do 4"),
            new Todo(6, "5 todo", "description to do 5"),
            new Todo(2, "6 todo", "description to do 6")));

    public List<Todo> findAll() {
        return data;
    }

    public Todo findToDobyId(int id) {
        for (Todo todo : data) {
            if (todo.getId() == id) {
                return todo;
            }
        }
        return null;
    }

    public boolean save(Todo todo) {
        return data.add(todo);
    }

    public void delete(int id){
        for (Todo todo : data) {
            if (todo.getId() == id) {
                data.remove(todo);
            }
        }
    }**/
}
