package com.example.TicketBooking.repository;



import org.springframework.data.jpa.repository.JpaRepository; 

import com.example.TicketBooking.model.Location;


public interface LocationRepository extends JpaRepository<Location, Long> {
	
}
