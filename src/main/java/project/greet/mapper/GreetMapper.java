package project.greet.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import project.greet.model.Greet;

import javax.websocket.server.PathParam;
import java.util.List;

@Repository
@Mapper
public interface GreetMapper {



    @Select("select * from greet")
    List<Greet> getAll();

    @Select("select * from greet where id = #{id}")
    Greet getGreet(int id);

    @Insert("insert into greet(greet) values(#{greet})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id",
            before = false, resultType = Integer.class)
    void createGreet(Greet greet);

    @Delete("DELETE FROM greet WHERE id = #{id}")
    void deleteGreet(int id);

    @Update("UPDATE greet SET greet = (#{name}) WHERE id = #{id}")
    void updateGreet(@Param("name") String name, @Param("id") int id);
}