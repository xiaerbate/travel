package net.wanho.chefassist.mapper;

import net.wanho.chefassist.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserMapper extends Mapper<User> {
    @Insert("insert into user(name,password) values (#{name},#{password})")
    int saveUser(@Param("name") String name, @Param("password") String password);

    @Select("select id,name,password from user where name=#{name}")
    User selectUser(@Param("name") String name);
}
