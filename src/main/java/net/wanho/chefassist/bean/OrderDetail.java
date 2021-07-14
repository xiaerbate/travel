package net.wanho.chefassist.bean;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "order_detail")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "dish_id")
    private int dishId;
    @Column(name = "count")
    private int count;
    @Column(name = "status")
    private int status;
    @Column(name = "order_id")
    private String orderId;

    public OrderDetail() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public OrderDetail(int id, int dishId, int count, int status, String orderId) {
        this.id = id;
        this.dishId = dishId;
        this.count = count;
        this.status = status;
        this.orderId = orderId;
    }
}
