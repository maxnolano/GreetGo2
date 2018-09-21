//package project.greet.mapper;
//
//import org.apache.ibatis.annotations.*;
//import project.greet.model.Greet;
//
//import java.util.List;
//
//public class GreetMapperImp implements GreetMapper {
//
//    @Override
//    @Select("select * from greet")
//    public List<Greet> getAll() {
//        return null;
//    }
//
//    @Override
//    @Select("select * from greet where id = #{id}")
//    public Greet getGreet(int id) {
//        return null;
//    }
//
//    @Override
//    @Insert("insert into greet(greet) values(#{greet})")
//    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id",
//            before = false, resultType = Integer.class)
//    public void createGreet(Greet greet) {
//
//    }
//
//    @Override
//    @Delete("DELETE FROM greet WHERE id = #{id}")
//    public void deleteGreet(int id) {
//
//    }
//
//    @Override
//    @Update("UPDATE greet SET greet = (#{name}) WHERE id = #{id}")
//    public void updateGreet(String name, int id) {
//
//    }
//}
