package net.wanho.chefassist.bean;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "order_list")
public class OrderList {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "table_id")
    private int tableId;
    @Column(name = "start_time")
    private String startTime;
    @Column(name = "end_time")
    private String endTime;
    @Column(name = "total_money")
    private double totalMoney;
    @Column(name = "status")
    private int status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public OrderList() {
    }

    public OrderList(String id, int tableId, String startTime, String endTime, double totalMoney, int status) {
        this.id = id;
        this.tableId = tableId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.totalMoney = totalMoney;
        this.status = status;
    }
}
