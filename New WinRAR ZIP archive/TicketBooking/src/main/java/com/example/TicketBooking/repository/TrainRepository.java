package com.example.TicketBooking.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.TicketBooking.model.User;


import jakarta.transaction.Transactional;

public interface TrainRepository extends JpaRepository<User, Long> {

	Optional<User> findById(Long id);
	//native Query
		@Query(value = "select * from User",nativeQuery = true)
		public List<User> getAllRows();
		
		@Query(value = "select * from User where country =:addr and name =:name" ,nativeQuery = true)
		public List<User> getSpecRows(@Param("addr") String addr,@Param("name") String name);
		
		//get by char
		@Query (value = "select * from User where name like %?1%",nativeQuery = true)
		public List<User> getByname(@Param("name") String name);
		
		//delete using native query
		@Modifying
		@Transactional
		@Query(value = "delete from User where id=:no_id",nativeQuery = true)
		public int deleteId(@Param("no_id") int id);
		
		@Modifying 
		@Transactional
		@Query(value="update User set country=:addr where id=:no_id",nativeQuery = true)
		public int updateById(@Param("addr") String addr,@Param("no_id") int id);
//		@Modifying
//		@Transactional
		@Query(value="select * from User join User.id = User.User.id where User.id = ?1",nativeQuery=true)
		User getUserData(int id);
} 