package com.example.GetRooms.models;

public class Room extends BaseModel {
    private String roomNumber;
    private double price;
    private RoomType roomType;
    private String description;

    public Room(long id, String roomNumber, double price, RoomType roomType, String description) {
        this.setId(id);  // Calling the setter of the base class
        this.roomNumber = roomNumber;
        this.price = price;
        this.roomType = roomType;
        this.description = description;
    }

    public String getRoomNumber(){
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber){
        this.roomNumber=roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
