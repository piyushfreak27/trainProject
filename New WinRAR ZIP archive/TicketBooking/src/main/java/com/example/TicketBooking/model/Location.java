package com.example.TicketBooking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="location")
public class Location {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String FromLocation;
	private String ToLocation;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFromLocation() {
		return FromLocation;
	}
	public void setFromLocation(String fromLocation) {
		FromLocation = fromLocation;
	}
	public String getToLocation() {
		return ToLocation;
	}
	public void setToLocation(String toLocation) {
		ToLocation = toLocation;
	}
	public Location(Long id, String fromLocation, String toLocation) {
		super();
		this.id = id;
		FromLocation = fromLocation;
		ToLocation = toLocation;
	}
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
