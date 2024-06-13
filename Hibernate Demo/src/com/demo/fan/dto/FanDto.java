package com.demo.fan.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fan_info")
public class FanDto {
	
	@Id
	private int id;
	private String name;
	private String type;
	private double price;
	
	public FanDto() {
		super();
	}

	public FanDto(int id, String name, String type, double price) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FanDto [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + "]";
	}
	
	

}
