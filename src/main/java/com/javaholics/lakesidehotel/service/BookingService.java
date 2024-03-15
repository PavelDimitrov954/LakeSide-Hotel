package com.javaholics.lakesidehotel.service;

import com.javaholics.lakesidehotel.model.BookedRoom;

import java.util.List;

public interface BookingService {
    List<BookedRoom> getAllBookingsByRoomId(Long roomId);

    void cancelBooking(Long bookingId);

    String saveBooking(Long roomId, BookedRoom bookingRequest);

    BookedRoom findByBookingConfirmationCode(String confirmationCode);

    List<BookedRoom> getAllBookings();
}
