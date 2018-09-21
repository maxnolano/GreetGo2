package project.greet.controller;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.greet.mapper.GreetMapper;
import project.greet.model.Greet;
import project.greet.resource.GreetResource;

@RestController
@RequestMapping("/main/greet")
@Component
public class GreetController {
    @Autowired
    private GreetResource greetResource;

//    @GetMapping("/getGreet")
//    public Greet getWord() {
//        return greetResource.getGreet();
//    }

//    @PostMapping("/createWord")
//    public Word createWord(@RequestBody Word word) {
//        return wordRepository.save(word);
//    }

    //    @DeleteMapping("/deleteWord/{id}")
//    public boolean deleteWord(@PathVariable Long id) {
//        wordRepository.deleteById(id);
//        return true;
//    }

//    @GetMapping("/updateGreet")
//    public void updateWord(@RequestBody Greet greet) {
//        greetResource.updateGreet();
//    }

}