package org.springsource.samples.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springsource.samples.model.Booking;
import org.springsource.samples.service.TravelService;

@Controller
public class TravelController {
	
	private static final Logger logger = LoggerFactory.getLogger(TravelController.class);

	private final TravelService travelService;

	@Autowired
	public TravelController(TravelService travelService) {
		this.travelService = travelService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("home");
		model.addAttribute("bookings", travelService.getBookingsForUser("todo:username"));
		return "home";
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String search(@RequestParam String zip, @RequestParam String start, @RequestParam String end, Model model) {
		logger.info("searching: zip=" + zip + ", start=" + start + ", end=" + end);
		return "search";
	}

	@RequestMapping(value = "/book", method = RequestMethod.POST)
	public String book(@RequestParam String flight, @RequestParam String hotel, @RequestParam String car, Model model) {
		logger.info("booking: flight=" + flight + ", hotel=" + hotel + ", car=" + car);
		Booking booking = new Booking();
		booking.setUsername("todo:username");
		booking.setStartDate("to/do/01");
		booking.setEndDate("to/do/02");
		booking.setFlight(flight);
		booking.setHotel(hotel);
		booking.setCar(car);
		travelService.addBooking(booking);
		return "redirect:/";
	}

}
