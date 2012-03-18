package org.springsource.samples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springsource.samples.data.BookingRepository;
import org.springsource.samples.model.Booking;

@Controller
public class TravelService {
	
	private final BookingRepository repository;

	@Autowired
	public TravelService(BookingRepository repository) {
		this.repository = repository;
	}

	public List<Booking> getBookingsForUser(String username) {
		return this.repository.findBookings(username);
	}

	public void addBooking(Booking booking) {
		this.repository.addBooking(booking);		
	}

}
