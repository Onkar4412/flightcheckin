package com.onkar.flightcheckin.integration;

import com.onkar.flightcheckin.integration.dto.Reservation;
import com.onkar.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRESTClient {
	
	public Reservation findReservation(long id);
	public Reservation updateReservation(ReservationUpdateRequest request);

}
