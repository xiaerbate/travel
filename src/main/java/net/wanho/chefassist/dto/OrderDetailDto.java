package net.wanho.chefassist.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderDetailDto implements Serializable {
    private int id;
    private String name;
    private int count;
    private double price;
    private double totalPrice;
    private int status;
    private String statusTxt;

    public OrderDetailDto() {
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusTxt() {
        return statusTxt;
    }

    public void setStatusTxt(String statusTxt) {
        this.statusTxt = statusTxt;
    }

    public OrderDetailDto(int id, String name, int count, double price, double totalPrice, int status, String statusTxt) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.price = price;
        this.totalPrice = totalPrice;
        this.status = status;
        this.statusTxt = statusTxt;
    }
}
