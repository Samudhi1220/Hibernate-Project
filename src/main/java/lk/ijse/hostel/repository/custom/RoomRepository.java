package lk.ijse.hostel.repository.custom;

import lk.ijse.hostel.entity.Room;
import lk.ijse.hostel.repository.CrudRepository;

import java.util.ArrayList;

public interface RoomRepository extends CrudRepository<Room, String> {

    public ArrayList<Room> getAllRooms();
}
