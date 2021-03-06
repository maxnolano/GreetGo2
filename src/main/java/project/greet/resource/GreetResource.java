package project.greet.resource;

import org.springframework.web.bind.annotation.*;
import project.greet.mapper.GreetMapper;
import project.greet.model.Greet;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@CrossOrigin(origins="http://localhost:8080", allowedHeaders="*")
@RestController
@RequestMapping("/rest/greet")
public class GreetResource {

    private GreetMapper greetMapper;

    public GreetResource(GreetMapper greetMapper) {
        this.greetMapper = greetMapper;
    }

    @GetMapping("/getGreet/{id}")
    public Greet getGreet(@PathVariable int id) {
        return greetMapper.getGreet(id);
    }

//    @RequestMapping(value = "/createGreet", method = {RequestMethod.GET, RequestMethod.POST})
//    public String createGreet() {
//        Greet n = new Greet();
//        n.setGreet("n-nov");
//        greetMapper.createGreet(n);
//        return "Created successfully";
//    }

    @RequestMapping(value="/createGreet", method=RequestMethod.POST)
    public String createGreet(@RequestBody Greet greet){
        greetMapper.createGreet(greet);
        return "Sucessful!";
    }

//    @GetMapping("/deleteGreet/{id}")
//    public String deleteGreet(@PathVariable int id) {
//        greetMapper.deleteGreet(id);
//        return "Deleted successfully";
//    }

//    @RequestMapping(value="/deletetGreet", method=RequestMethod.GET)
//    public String deleteGreet(@RequestBody int id){
//        greetMapper.deleteGreet(id);
//        return "Sucessfuly deleted!";
//    }

    @GetMapping("/deleteGreet/{id}")
    public String deleteGreet(@PathVariable int id) {
        greetMapper.deleteGreet(id);
        return "Deleted successfully";
    }

    @GetMapping("/updateGreet/{id}")
    public String updateGreet(@PathVariable int id) {
        String name = "guanzhow";
        greetMapper.updateGreet(name, id);
        return "Upgraded successfully";
    }

    @RequestMapping(value="/getAll",method = RequestMethod.GET,produces = {"application/json"})
    public @ResponseBody List<Greet> show(){
        return greetMapper.getAll();
    }
}