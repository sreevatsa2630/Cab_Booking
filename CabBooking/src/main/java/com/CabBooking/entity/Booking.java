package com.CabBooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cabBooking")
public class Booking {
	
@Id
@GeneratedValue
private int id;
private String name;
private long mobileNo;
private String email;
private String pickup_point;
private String destination_point;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPickup_point() {
	return pickup_point;
}
public void setPickup_point(String pickup_point) {
	this.pickup_point = pickup_point;
}
public String getDestination_point() {
	return destination_point;
}
public void setDestination_point(String destination_point) {
	this.destination_point = destination_point;
}

}
