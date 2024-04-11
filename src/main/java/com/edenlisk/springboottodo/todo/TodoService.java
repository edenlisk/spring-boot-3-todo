package com.edenlisk.springboottodo.todo;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Service
public class TodoService {
    private static List<Todo> todoList = new ArrayList<>();
    static {
        todoList.add(new Todo(1, "edenlisk", "Learn Game Development", LocalDate.now().plusYears(1), false));
        todoList.add(new Todo(2, "edenlisk", "Learn NestJs", LocalDate.now().plusYears(2), false));
        todoList.add(new Todo(3, "edenlisk", "Learn TypeScript", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username) {
        return todoList;
    }
}
