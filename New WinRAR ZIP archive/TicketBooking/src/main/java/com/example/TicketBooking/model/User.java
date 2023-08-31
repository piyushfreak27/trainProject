package com.example.TicketBooking.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String FistName;
    private String LastName;
    private int Age;
    private String Gender;
	public Long getId() {
		return id;
	}
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="order_id",referencedColumnName = "id")
	private List<Ticketbooking> ticketbooking;
	public String getFistName() {
		return FistName;
	}
	public void setFistName(String fistName) {
		FistName = fistName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public List<Ticketbooking> getTicketbooking() {
		return ticketbooking;
	}
	public void setTicketbooking(List<Ticketbooking> ticketbooking) {
		this.ticketbooking = ticketbooking;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User(Long id, String fistName, String lastName, int age, String gender, List<Ticketbooking> ticketbooking) {
		super();
		this.id = id;
		FistName = fistName;
		LastName = lastName;
		Age = age;
		Gender = gender;
		this.ticketbooking = ticketbooking;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}