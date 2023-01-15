package com.CabBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CabBooking.entity.Booking;
import com.CabBooking.service.BookingService;

@RestController
public class BookingController {

	@Autowired
	private BookingService service;
	
	@PostMapping("/addBooking")
	public String addBooking(@RequestBody Booking booking) {
		return service.saveBooking(booking);
	}
	
	@GetMapping("/BookingDetails")
		public List<Booking> findAllBooking(){
			return service.getBooking();
}

	@GetMapping("/BookingDetails/{mobileNo}")
	public Booking findBookingBymobileNo(@PathVariable long mobileNo) {
		return service.getBookingDetailsBymonileNo(mobileNo);
	}

	@DeleteMapping("/deleteBooking/{id}")
	public String deleteBooking(@PathVariable int id) {
		return service.deleteBooking(id);
	}
}
