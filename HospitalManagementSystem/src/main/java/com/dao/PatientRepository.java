package com.dao;

import org.springframework.data.repository.CrudRepository;

import com.model.PatientDetails;

public interface PatientRepository extends CrudRepository<PatientDetails, Integer>{

}
