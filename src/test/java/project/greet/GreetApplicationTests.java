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

    @Test
    public void contextLoads() {
    }

    @Test
    public void getAll() {
        GreetMapper g = new GreetMapper;
        List<Greet> greets = g.getAll();
        assertNotNull(greets);
        assertTrue(!greets.isEmpty());
    }

    @Test
    public void findUserById() {
        GreetMapper g = new GreetMapper;
        Greet greet = g.getGreet(1);
        assertNotNull(greet);
    }

    @Test
    public void createGreet() {
        GreetMapper g = new GreetMapper;
        Greet n = new Greet();
        n.setGreet("n-nov");
        g.createGreet(n);
        Greet n2 = g.getGreet(n.getId());
        assertEquals("n-nov", n2.getGreet());
    }

}
