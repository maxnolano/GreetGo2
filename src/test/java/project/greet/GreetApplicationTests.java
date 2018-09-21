package project.greet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import project.greet.mapper.GreetMapper;
import project.greet.model.Greet;

import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GreetApplicationTests {

    @Autowired
    private GreetMapper greetMapper;

//    public GreetApplicationTests(GreetMapper greetMapper) {
//        this.greetMapper = greetMapper;
//    }

    @Test
    public void contextLoads() {
    }

    @Test
    public void getAll() {
        List<Greet> greets = greetMapper.getAll();
        assertNotNull(greets);
        assertTrue(!greets.isEmpty());
    }

    @Test
    public void findUserById() {
        Greet greet = greetMapper.getGreet(1);
        assertNotNull(greet);
    }

    @Test
    public void createGreet() {
        Greet n = new Greet();
        n.setGreet("n-nov");
        greetMapper.createGreet(n);
        Greet n2 = greetMapper.getGreet(n.getId());
        assertEquals("n-nov", n2.getGreet());
    }

}
