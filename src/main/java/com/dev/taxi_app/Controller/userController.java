package com.dev.taxi_app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.taxi_app.Service.UserService;
import com.dev.taxi_app.Model.User;

@RestController
public class userController {

    private final UserService userService;

    @Autowired
    public  userController(UserService userService){

        this.userService = userService;
    }

    @PostMapping(value = "/users")
    public ResponseEntity<?> create(@RequestBody User user){
        userService.create(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> read(){
        final List<User> users = userService.readAll();
             if (users != null && !users.isEmpty())
                return new ResponseEntity<>(users, HttpStatus.OK);
                else
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);  
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity<User> read(@PathVariable(name = "userId") int userId) {
        final User user = userService.read(userId);
            if (user != null)
            return new ResponseEntity<>(user, HttpStatus.OK);
            else 
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    
    @PutMapping(value = "/users/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "userId") int userId, @RequestBody User user){
        final boolean updated = userService.update(user, userId);

        if (updated)
        return new ResponseEntity<>(HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/users/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "userId") int userId){
        final boolean deleted = userService.delete(userId);

        if (deleted)
        return new ResponseEntity<>(HttpStatus.OK);
        else
        return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
    


    

}
