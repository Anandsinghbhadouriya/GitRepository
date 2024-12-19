package com.example.GetRooms.services.impl;

import com.example.GetRooms.models.Room;
import com.example.GetRooms.models.RoomType;
import com.example.GetRooms.repositories.RoomRepository;
import com.example.GetRooms.services.RoomService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository){
        this.roomRepository=roomRepository;
    }



    @Override
    public List<Room> getRooms(String roomType) {

    if (roomType==null || roomType.isEmpty()){
        // Returns all rooms if no room type is specified
        return roomRepository.getRooms();
    }
    try{
        // try to get the RoomTyep enum based on the input String
        RoomType type = RoomType.valueOf(roomType.toUpperCase());
        return roomRepository.getRoomsByRoomType(type);
    } catch (RuntimeException e) {
        throw new RuntimeException(e);
    }
    }
}
