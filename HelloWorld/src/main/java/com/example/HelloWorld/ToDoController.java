package com.example.HelloWorld;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/todo")
public class ToDoController {

    @Autowired
    private ToDoService tosoService;

    @GetMapping("/get")
    String ToDoTools(){
        tosoService.getToDos();
        return "toDo";
    }

    //Path Variable -> Replacing a number in class path instead of literals
    @GetMapping("/{id}")
    String getToDoById(@PathVariable int id){
        return "ToDo with Id = " + id;
    }

    //Request Params -> Requesting with the variable and value line ?id=56
    @GetMapping("")
    String IdParam(@RequestParam("todoId") long id){

        return "toDo with id "+id;
    }

    // this is not a proper way coz password is displayed to all
//    @GetMapping("/secreate")
//    String CreateUser(@RequestParam String userid, @RequestParam String pass){
//
//        return "toDo with id " + userid + " Password is "+pass;
//    }

    // Request Body -> To hide the sensitive information in the class path and to encrypt it
    // we use Request Body
        //->  @GetMapping  cannot be used instead @PostMapping can be used to secure the sensitive info

    @PostMapping("/create")
    String CreateUserSecure(@RequestBody String body){

        return body;
    }

    @PutMapping("/{id}")
    String Update(@PathVariable long id){

        return "Update Todo with Id "+id;
    }

    @DeleteMapping("/{id}")
    String Delete(@PathVariable long id){
        return "Delete with Todo Id" +id;
    }
}
