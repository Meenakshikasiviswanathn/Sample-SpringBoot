package com.example.HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

//Bean - AutoWiring
@Service
public class ToDoService {
    // AutoWire
    @Autowired
    private ToDoRepository todorepo;


    public void getToDos(){
        System.out.println(todorepo.getAllTodos());
    }

}
