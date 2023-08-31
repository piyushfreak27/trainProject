package com.example.TicketBooking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TicketBooking.model.Ticketbooking;



public interface TicketBookingRepository extends JpaRepository<Ticketbooking, Long> {
	Optional<Ticketbooking> findById(Long id);
}
