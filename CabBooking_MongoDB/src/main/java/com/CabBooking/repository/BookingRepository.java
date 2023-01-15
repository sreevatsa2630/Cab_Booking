package com.CabBooking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.CabBooking.model.Booking;

public interface BookingRepository extends MongoRepository<Booking,Integer> {

	Booking findBymobileNo(long mobileNo);

}
