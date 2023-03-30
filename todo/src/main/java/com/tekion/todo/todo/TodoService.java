package com.tekion.todo.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {

    private static List<Todo> todos;

    private static int todosCount = 0;

    static {
        todos = new ArrayList<>();
        todos.add(new Todo(todosCount++, "Ankit", "Learn Spring boot", LocalDate.now().plusMonths(1), false));
        todos.add(new Todo(todosCount++, "Ankit", "Learn Kubernetes", LocalDate.now().plusMonths(3), false));
        todos.add(new Todo(todosCount++, "Ankit", "Learn Hibernate", LocalDate.now().plusMonths(2), false));
    }

    public List<Todo> findByUsername(String username) {
        Predicate<Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);
        List<Todo> list  = new ArrayList<>(todos.stream().filter(predicate).toList());
        return list;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        Todo todo = new Todo(todosCount++, username, description, targetDate, done);
        todos.add(todo);
    }

    public void deleteById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findById(int id) {
        Predicate<Todo> predicate = todo -> todo.getId() == id;
        return todos.stream().filter(predicate).findFirst().get();
    }

    public void updateTodo(@Valid Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
