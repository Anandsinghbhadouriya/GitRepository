package com.example.GetRooms.services;

import com.example.GetRooms.models.Room;

import java.util.List;

public interface RoomService {

    List<Room> getRooms(String roomType);
}
