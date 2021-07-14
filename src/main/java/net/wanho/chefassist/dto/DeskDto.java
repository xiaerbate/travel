package net.wanho.chefassist.dto;
import lombok.Data;

@Data
public class DeskDto {
    private int id;
    private String name;
    private int size;
    private int isUsing;
    private String orderId;

    public DeskDto() {
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public DeskDto(int id, String name, int size, int isUsing, String orderId) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.isUsing = isUsing;
        this.orderId = orderId;
    }
}
