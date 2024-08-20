package com.diefthyntis.AirBusiness.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diefthyntis.AirBusiness.entity.MaintenanceIssue;




@Repository
public interface MaintenanceRepository extends CrudRepository<MaintenanceIssue, Long>   {
	
	List<MaintenanceIssue> findByFixed(String fixed);
}