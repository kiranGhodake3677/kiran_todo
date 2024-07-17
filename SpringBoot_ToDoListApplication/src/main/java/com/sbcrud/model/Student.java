package com.sbcrud.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {
@Id
private int id;
private String title;
private String description;
private boolean completed;
private LocalDateTime dt;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public boolean isCompleted() {
	return completed;
}
public void setCompleted(boolean completed) {
	this.completed = completed;
}
public LocalDateTime getDt() {
	return dt;
}
public void setDt(LocalDateTime dt) {
	this.dt = dt;
}



}
