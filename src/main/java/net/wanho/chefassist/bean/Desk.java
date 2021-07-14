package net.wanho.chefassist.bean;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "desk")
public class Desk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "size")
    private int size;
    @Column(name = "is_using")
    private int isUsing;

    public Desk() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getIsUsing() {
        return isUsing;
    }

    public void setIsUsing(int isUsing) {
        this.isUsing = isUsing;
    }

    public Desk(int id, String name, int size, int isUsing) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.isUsing = isUsing;
    }

}
