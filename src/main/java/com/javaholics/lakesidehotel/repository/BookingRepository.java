package com.javaholics.lakesidehotel.repository;

import com.javaholics.lakesidehotel.model.BookedRoom;
import com.javaholics.lakesidehotel.response.BookingResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<BookedRoom, Long> {

    List<BookedRoom> findByRoomId(Long roomId);

    BookedRoom findByBookingConfirmationCode(String confirmationCode);
}
