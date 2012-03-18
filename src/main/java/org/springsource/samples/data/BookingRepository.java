package org.springsource.samples.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springsource.samples.model.Booking;

@Repository
public class BookingRepository {

	private final NamedParameterJdbcTemplate jdbcTemplate;
	private final BookingRowMapper mapper = new BookingRowMapper();

	@Autowired
	public BookingRepository(DataSource dataSource) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public void addBooking(final Booking booking) {
		String sql = "insert into bookings (username, startDate, endDate, flight, hotel, car) values (?,?,?,?,?,?)";
		this.jdbcTemplate.getJdbcOperations().update(sql,
				booking.getUsername(),
				booking.getStartDate(),
				booking.getEndDate(),
				booking.getFlight(),
				booking.getHotel(),
				booking.getCar());
	}

	public List<Booking> findBookings(String username) {
		String sql = "select * from bookings where username=?";
		return this.jdbcTemplate.getJdbcOperations().query(sql, mapper, username);
	}

	private static class BookingRowMapper implements org.springframework.jdbc.core.RowMapper<Booking> {
		public Booking mapRow(ResultSet rs, int rowNum) throws SQLException {
			Booking booking = new Booking(rs.getString("id"));
			booking.setUsername(rs.getString("username"));
			booking.setStartDate(rs.getString("startDate"));
			booking.setEndDate(rs.getString("endDate"));
			booking.setFlight(rs.getString("flight"));
			booking.setHotel(rs.getString("hotel"));
			booking.setCar(rs.getString("car"));
			return booking;
		}
	}

}
