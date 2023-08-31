package com.example.TicketBooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.TicketBooking.model.User;
import com.example.TicketBooking.repository.TrainRepository;

import java.util.List;

@Service
public class TrainService {
		    @Autowired
	    private TrainRepository trainRepository;

	    public List<User> getAllTrains() {
	        return trainRepository.findAll();
	        
	    }

	    public User getTrainById(Long id) {
	        return trainRepository.findById(id).orElse(null);
	    }

	    public User createTrain(User train) {
	        return trainRepository.save(train);
	    }

	    public User updateTrain(Long id, User updatedTrain) {
	        if (trainRepository.existsById(id)) {
	            updatedTrain.setId(id);
	            return trainRepository.save(updatedTrain);
	        }
	        return null;
	    }

	    public void deleteTrain(Long id) {
	        trainRepository.deleteById(id);
	    }

		public Object getUserData(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		public List<User> sortByDsc(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		public List<User> pagination(int num, int size) {
			// TODO Auto-generated method stub
			return null;
		}

		public List<User> paginationAndSorting(int num, int size, String name) {
			// TODO Auto-generated method stub
			return null;
		}

		public List<User> sortByAsc(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		
	}