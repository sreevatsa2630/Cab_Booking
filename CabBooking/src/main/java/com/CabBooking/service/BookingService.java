package com.CabBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CabBooking.entity.Booking;
import com.CabBooking.repositoty.BookingRepository;

@Service
public class BookingService {
	
	
	@Autowired
	private BookingRepository repository;
	
	
	//save Booking
    public String saveBooking(Booking booking) {
    	repository.save(booking);
    	return "Booking Added";
    }
    
    //Get Booking
    public List<Booking> getBooking(){
    	return repository.findAll();
    }
    
    //Get Booking By MobileNo
    public Booking getBookingDetailsBymonileNo(long mobileNo) {
    	return repository.findBymobileNo(mobileNo);
    }
    
    //Deleted By Id
    public String deleteBooking (int id) {
    	repository.deleteById(id);
    	return "BOOKING_CANCELLED";
    }
    
}

