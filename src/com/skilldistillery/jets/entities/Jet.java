package com.skilldistillery.jets.entities;

import java.util.Objects;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;
	
	public abstract void fly();
	
	
	@Override
	public int hashCode() {
		return Objects.hash(model, price, range, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		return Objects.equals(model, other.model) && price == other.price && range == other.range
				&& Double.doubleToLongBits(speed) == Double.doubleToLongBits(other.speed);
	}

	public Jet() {}
	
	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet [model: ");
		builder.append(model);
		builder.append(", speed(MPH): ");
		builder.append(speed);
		builder.append(", speed(mach): ");
		builder.append(speed * 0.0013);
		builder.append(", range: ");
		builder.append(range);
		builder.append(", price: ");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

}
