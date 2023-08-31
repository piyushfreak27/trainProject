package com.example.TicketBooking.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tickebooking")
public class Ticketbooking {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private int seats;
    private int snum;
    private String trainname;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn
   private Location location;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getSnum() {
		return snum;
	}
	public void setSnum(int snum) {
		this.snum = snum;
	}
	public String getTrainname() {
		return trainname;
	}
	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Ticketbooking(Long id, int seats, int snum, String trainname, Location location) {
		super();
		this.id = id;
		this.seats = seats;
		this.snum = snum;
		this.trainname = trainname;
		this.location = location;
	}
	public Ticketbooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}