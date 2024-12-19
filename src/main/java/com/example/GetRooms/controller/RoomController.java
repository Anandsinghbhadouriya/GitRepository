package com.example.GetRooms.controller;

import com.example.GetRooms.dtos.GetRoomsRequestDto;
import com.example.GetRooms.dtos.GetRoomsResponseDto;
import com.example.GetRooms.dtos.ResponseStatus;
import com.example.GetRooms.models.Room;
import com.example.GetRooms.services.RoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService){
        this.roomService=roomService;
    }

    @GetMapping
    public GetRoomsResponseDto getRooms(@RequestBody GetRoomsRequestDto requestDto){
        String roomType=requestDto.getRoomType();
        List<Room> rooms;
        try{
            rooms = roomService.getRooms(roomType);
            if(rooms.isEmpty()){
                return new GetRoomsResponseDto(ResponseStatus.FAILURE,null);
            }
            return new GetRoomsResponseDto(ResponseStatus.SUCCESS,rooms);

        }catch (Exception e){
            return new GetRoomsResponseDto(ResponseStatus.FAILURE,null);
        }

    }
}
