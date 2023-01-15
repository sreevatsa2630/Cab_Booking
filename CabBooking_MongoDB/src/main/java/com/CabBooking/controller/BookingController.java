package com.CabBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CabBooking.model.Booking;
import com.CabBooking.repository.BookingRepository;

@RestController
public class BookingController {
	
	@Autowired
	private BookingRepository repository;
	
  @PostMapping("/addBooking")
  public String addBooking(@RequestBody Booking booking) {
	  repository.save(booking);
	  return "BOOKING_SUCCESSFUL";
  }
  
  @GetMapping("/BookingDetails")
  public List<Booking> getBookingDetails(){
	  return repository.findAll();
  }
  
  @GetMapping("/BookingDetails/{mobileNo}")
  public Booking getBookingBymobileNo(@PathVariable long mobileNo) {
		return repository.findBymobileNo(mobileNo);
	}
  
  @DeleteMapping("/deleteBookingDetails/{id}")
  public String deleteBooking(@PathVariable int id) {
	  repository.deleteById(id);
	  return "BOOKING_CANCELLED";
  }
 }
