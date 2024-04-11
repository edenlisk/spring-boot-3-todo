package com.edenlisk.springboottodo.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("email")
public class TodoController {
    private TodoService todoService;
    public TodoController(TodoService todoService) {
        super();
        this.todoService = todoService;
    }

    @RequestMapping(value = "todos", method = RequestMethod.GET)
    private String getTodos(ModelMap model) {
        model.put("todos", todoService.findByUsername("edenlisk"));
        return "listTodos";
    }
}
