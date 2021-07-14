package net.wanho.chefassist.domain;

import lombok.Data;
import javax.persistence.*;

@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private  String name;

    @Column(name="password")
    private  String password;
}
