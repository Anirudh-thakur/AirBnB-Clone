package com.airbnb.airbnb.Models;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("orders")
public class Orders {
    @Id
    private String _id;

    private String cust_id;
    private int amount;
    private String status;
    public Orders(String _id, String cust_id, int amount, String status) {
        this._id = _id;
        this.cust_id = cust_id;
        this.amount = amount;
        this.status = status;
    }
    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }
    public String getCust_id() {
        return cust_id;
    }
    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
