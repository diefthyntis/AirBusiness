package com.diefthyntis.AirBusiness.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diefthyntis.AirBusiness.entity.Reservation;



@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

	public List<Reservation> findAll();

	public Optional<Reservation> findById(long id);

	public void delete(Reservation reservation);

	
}


