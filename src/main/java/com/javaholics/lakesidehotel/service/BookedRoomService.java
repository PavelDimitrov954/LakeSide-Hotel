package com.javaholics.lakesidehotel.service;

import com.javaholics.lakesidehotel.model.BookedRoom;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookedRoomService {
    List<BookedRoom> getAllBookingsByRoomId(Long roomId);
}
