package com.javaholics.lakesidehotel.service;

import com.javaholics.lakesidehotel.model.BookedRoom;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookedRoomServiceImpl implements BookedRoomService {
    @Override
    public List<BookedRoom> getAllBookingsByRoomId(Long roomId) {
        return null;
    }
}
