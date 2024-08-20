package com.diefthyntis.AirBusiness.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diefthyntis.AirBusiness.entity.Plane;



@Repository
public interface PlaneRepository extends CrudRepository<Plane, Long>  {
}