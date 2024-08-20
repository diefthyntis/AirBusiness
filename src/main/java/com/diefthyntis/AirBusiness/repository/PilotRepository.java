package com.diefthyntis.AirBusiness.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diefthyntis.AirBusiness.entity.Pilot;




@Repository
public interface PilotRepository extends CrudRepository<Pilot, Long>  {
}