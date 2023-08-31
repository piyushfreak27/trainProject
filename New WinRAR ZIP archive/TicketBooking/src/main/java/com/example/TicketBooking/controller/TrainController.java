package com.example.TicketBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.TicketBooking.model.User;
import com.example.TicketBooking.service.TrainService;


@RestController
@RequestMapping("/trains")
public class TrainController {


	    @Autowired
	    private TrainService trainService;

	    @GetMapping
	    public List<User> getAllTrains() {
	        return trainService.getAllTrains();
	    }

	    @GetMapping("/{id}")
	    public User getTrainById(@PathVariable Long id) {
	    	
	        return trainService.getTrainById(id); 
	    }

	    @PostMapping("/train")
	    public User createTrain(@RequestBody User train) {
	        return trainService.createTrain(train);
	    }

	    @PutMapping("/{id}")
	    public User updateTrain(@PathVariable Long id, @RequestBody User updatedTrain) {
	        return trainService.updateTrain(id, updatedTrain);
	    }

	    @DeleteMapping("/{id}") 
	    public void deleteTrain(@PathVariable Long id) {
	        trainService.deleteTrain(id);
	    }
	  //sorting ascending
		@GetMapping("/sortAsc/{name}")
		public List<User> sortasc(@PathVariable("name")String name)
		{
			  return trainService.sortByAsc(name);
		}
		//sorting descending
		@GetMapping("/sortDesc/{name}")
		public List<User> sortdsc(@PathVariable("name")String name)
		{
			  return trainService.sortByDsc(name);
		}

		//pagination
		@GetMapping("/pagination/{num}/{size}")
		public List<User> pagination(@PathVariable("num") int num,@PathVariable("size") int size){
			return trainService.pagination(num, size);
		}
		//pagination and sorting
		@GetMapping("/pagination/{num}/{size}/{name}")
		public List<User> paginationAndSorting(@PathVariable("num") int num,@PathVariable("size") int size,@PathVariable("name") String name){
			return trainService.paginationAndSorting(num, size,name);
		}
		
	    
	}

