package project.greet.resource;

import org.springframework.web.bind.annotation.*;
import project.greet.mapper.GreetMapper;
import project.greet.model.Greet;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/rest/greet")
public class GreetResource {

    private GreetMapper greetMapper;

    public GreetResource(GreetMapper greetMapper) {
        this.greetMapper = greetMapper;
    }


//    @GetMapping("/getGreets")
//    public List<Greet> getGreets() {
//        return greetMapper.getGreets();
//    }

//    @GetMapping("/createGreet")
//    public void createGreet() {
//
//        Greet greet = new Greet();
//        greet.setGreet("Hello World!");
//
//        greetMapper.createGreet(greet);
//    }

    @GetMapping("/getGreet")
    public Greet getGreet() {
        return greetMapper.getGreet(1);
    }

    @GetMapping("/updateGreet")
    public void updateGreet() {
        greetMapper.updateGreet(1);
    }

//    @GetMapping("/deleteGreet")
//    public String deleteGreet() {
//        greetMapper.deleteGreet(1);
//        return "Deleted!";
//    }
}