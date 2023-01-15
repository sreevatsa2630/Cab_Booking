package com.CabBooking.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CabBooking.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking,Integer> {

	Booking findBymobileNo(long mobileNo);

}
