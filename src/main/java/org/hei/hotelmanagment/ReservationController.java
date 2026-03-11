package org.hei.hotelmanagment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservationController {
    @GetMapping("/booking")
    public List<ReservationModel> getReservation(){
        return ReservationList.reservationLists;
    }
    @PostMapping("/booking")
    public String createReservation(){
        return "Reservation created successfully";
    }
}
