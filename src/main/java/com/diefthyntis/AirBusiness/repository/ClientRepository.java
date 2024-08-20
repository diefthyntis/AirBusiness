package com.diefthyntis.AirBusiness.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diefthyntis.AirBusiness.entity.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long>  {
	
	@Query("SELECT c FROM Client c WHERE c.outstandingBalance > ?1")
	List<Client> findByOustandingBalanceGreaterThan(double value);

	
}