package com.example.HelloWorld;


import org.springframework.stereotype.Component;

@Component
public class ToDoRepository {

    String getAllTodos(){
        return "todos";
    }
}
