package com.products.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="prod_details")
public class Product {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String brand;
private int price;
private int quantity;
private String quality;
private int rating;
private String color;
private int hsn;
@Override
public String toString() {
	return "Product [id=" + id + ", brand=" + brand + ", price=" + price + ", quantity=" + quantity + ", quality="
			+ quality + ", rating=" + rating + ", color=" + color + ", hsn=" + hsn + "]";
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int id, String brand, int price, int quantity, String quality, int rating, String color, int hsn) {
	super();
	this.id = id;
	this.brand = brand;
	this.price = price;
	this.quantity = quantity;
	this.quality = quality;
	this.rating = rating;
	this.color = color;
	this.hsn = hsn;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getQuality() {
	return quality;
}
public void setQuality(String quality) {
	this.quality = quality;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getHsn() {
	return hsn;
}
public void setHsn(int hsn) {
	this.hsn = hsn;
}
}
