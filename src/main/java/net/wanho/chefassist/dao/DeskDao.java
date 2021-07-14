package net.wanho.chefassist.dao;

import net.wanho.chefassist.bean.Desk;
import net.wanho.chefassist.dto.DeskDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DeskDao extends JpaRepository<Desk,Integer> {


    @Query(value = "update desk set is_using= 0 where id = " +
            "(select table_id from order_list where id = :id)",
    nativeQuery = true)
    @Modifying
    void finishOrder(@Param("id") String id);
}
