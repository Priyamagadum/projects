package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.dao.PatientRepository;
import com.model.PatientDetails;

@RestController
public class PatientController {
@Autowired
PatientRepository repo;

@PostMapping("add")
public PatientDetails add(@RequestBody PatientDetails p) {
	PatientDetails pr= new PatientDetails();
	pr.setName(p.getName());
	pr.setDate(p.getDate());
	pr.setDisease(p.getDisease());
	repo.save(pr);
	return pr;
}

@GetMapping("get")
public List<PatientDetails> getall(){
	List<PatientDetails> list= (List<PatientDetails>) repo.findAll();
	return list;
	
}

@GetMapping("get/{id}")
public PatientDetails update(@RequestBody PatientDetails p,@PathVariable("id") int id  ) {
PatientDetails pr= new PatientDetails();
Optional<PatientDetails> o = repo.findById(id);
pr=o.get();
pr.setName(p.getName());
pr.setDate(p.getDate());
pr.setDisease(p.getDisease());
repo.save(pr);
return pr;	
}
}