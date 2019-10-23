package edu.cmu.bigbowl.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "order")
public class Order {
    @Id
    private String orderId;
    @Field("eaterId")
    private String eaterId;
    @Field("cookId")
    private String cookId;
    @Field("datetime")
    private Date datetime;
    @Field("tax")
    private float tax;
    @Field("readyTime")
    private Date readyTime;
    @Field("pickUpName")
    private String pickUpName;
    @Field("pickUpContact")
    private String pickUpContact;
    @Field("pickUpTime")
    private Date pickUpTime;

    public Order(String orderId, String eaterId, String cookId, Date datetime, float tax, Date readyTime, String pickUpName, String pickUpContact, Date pickUpTime) {
        this.orderId = orderId;
        this.eaterId = eaterId;
        this.cookId = cookId;
        this.datetime = datetime;
        this.tax = tax;
        this.readyTime = readyTime;
        this.pickUpName = pickUpName;
        this.pickUpContact = pickUpContact;
        this.pickUpTime = pickUpTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getEaterId() {
        return eaterId;
    }

    public void setEaterId(String eaterId) {
        this.eaterId = eaterId;
    }

    public String getCookId() {
        return cookId;
    }

    public void setCookId(String cookId) {
        this.cookId = cookId;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public Date getReadyTime() {
        return readyTime;
    }

    public void setReadyTime(Date readyTime) {
        this.readyTime = readyTime;
    }

    public String getPickUpName() {
        return pickUpName;
    }

    public void setPickUpName(String pickUpName) {
        this.pickUpName = pickUpName;
    }

    public String getPickUpContact() {
        return pickUpContact;
    }

    public void setPickUpContact(String pickUpContact) {
        this.pickUpContact = pickUpContact;
    }

    public Date getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(Date pickUpTime) {
        this.pickUpTime = pickUpTime;
    }
}