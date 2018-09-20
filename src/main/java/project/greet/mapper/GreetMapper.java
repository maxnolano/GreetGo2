package project.greet.mapper;

import org.springframework.stereotype.Repository;
import project.greet.model.Greet;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.SelectKey;

import javax.websocket.server.PathParam;
import java.util.List;

@Repository
@Mapper
public interface GreetMapper {

//    @Select("select * from greet")
//    List<Greet> getGreets();

//    @Insert("insert into greet(greet) values(#{greet})")
//    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id",
//            before = false, resultType = Integer.class)
//    void createGreet(Greet greet);

    @Select("select * from greet where id = #{id}")
    Greet getGreet(int id);

    @Update("UPDATE greet SET greet = 'Hello Worlddddd!' WHERE id = #{id}")
    void updateGreet( int id);

//    @Delete("DELETE FROM greet WHERE id = #{id}")
//    void deleteGreet(int id);
}