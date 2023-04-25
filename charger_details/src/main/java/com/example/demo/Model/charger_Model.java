package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class charger_Model {
@Id
	public int charge_id;
	public String brand;
	public String model_number;
	public String price;
	public String colour;
	public String charge_type;
	public String weight;
	public String input;
	public String output;
	public int ip_rating;
	public int getCharge_id() {
		return charge_id;
	}
	public void setCharge_id(int charge_id) {
		this.charge_id = charge_id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel_number() {
		return model_number;
	}
	public void setModel_number(String model_number) {
		this.model_number = model_number;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getCharge_type() {
		return charge_type;
	}
	public void setCharge_type(String charge_type) {
		this.charge_type = charge_type;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	public int getIp_rating() {
		return ip_rating;
	}
	public void setIp_rating(int ip_rating) {
		this.ip_rating = ip_rating;
	}
	
	
	
	}
