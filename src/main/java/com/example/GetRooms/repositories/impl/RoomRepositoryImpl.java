package com.example.GetRooms.repositories.impl;

import com.example.GetRooms.models.Room;
import com.example.GetRooms.models.RoomType;
import com.example.GetRooms.repositories.RoomRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class RoomRepositoryImpl implements RoomRepository {

    private List<Room> rooms;
    // constructor to initialize the rooms (simulating a database)

    public RoomRepositoryImpl(){
        rooms = new ArrayList<>();

        rooms.add(new Room(1,"101",100.0, RoomType.DELUXE,"Deluxe Room with sea view"));
        rooms.add(new Room(2,"102",150.0,RoomType.SUPER_DELUXE,"Super Deluxe rooom with muntain view"));
        rooms.add(new Room(3,"103",200.0,RoomType.SUITE,"Suite with living room"));
        rooms.add(new Room(4,"104",120.0,RoomType.DELUXE,"Deluxe Room with garden view"));

    }



    @Override
    public Room add(Room room) {
        rooms.add(room);
        return room;
    }

    @Override
    public List<Room> getRooms() {
        return rooms;
    }

    @Override
    public List<Room> getRoomsByRoomType(RoomType roomType) {
        return rooms.stream().filter(room -> room.getRoomType()==roomType).collect(Collectors.toList());
    }

    @Override
    public Room save(Room room) {
        // Here, you would normally save to a database. Since we're using an in-memory list, just return the room.
        return room;
    }
}
