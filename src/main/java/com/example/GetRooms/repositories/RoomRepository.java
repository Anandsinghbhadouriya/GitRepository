package com.example.GetRooms.repositories;

import com.example.GetRooms.models.Room;
import com.example.GetRooms.models.RoomType;

import java.util.List;

public interface RoomRepository {

    Room add(Room room);

    List<Room> getRooms();

    List<Room> getRoomsByRoomType(RoomType roomType);

    Room save(Room room);

}
