package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PatientDetails")
public class PatientDetails {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private int date;
private String disease;
public PatientDetails() {
	super();
}
public PatientDetails(int id, String name, int date, String disease) {
	super();
	this.id = id;
	this.name = name;
	this.date = date;
	this.disease = disease;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getDate() {
	return date;
}
public void setDate(int date) {
	this.date = date;
}
public String getDisease() {
	return disease;
}
public void setDisease(String disease) {
	this.disease = disease;
}
@Override
public String toString() {
	return "HospitalDetails [id=" + id + ", name=" + name + ", date=" + date + ", disease=" + disease + "]";
}

}
