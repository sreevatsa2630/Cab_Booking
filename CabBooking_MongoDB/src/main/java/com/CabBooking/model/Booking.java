package com.CabBooking.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "Booking")
public class Booking {
	@Id
	private int id;
	private String name;
	private String email;
	private long mobileNo;
	private String pickup_point;
	private String drop_point;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPickup_point() {
		return pickup_point;
	}
	public void setPickup_point(String pickup_point) {
		this.pickup_point = pickup_point;
	}
	public String getDrop_point() {
		return drop_point;
	}
	public void setDrop_point(String drop_point) {
		this.drop_point = drop_point;
	}
	

}
