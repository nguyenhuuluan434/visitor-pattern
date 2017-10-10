package com.vng.ird.visitor;

public class Book implements Visitable {

	private Builder builder;
	private double price;
	private double weight;

	public Book(Builder builder) {
		this.builder = builder;
		this.price = builder.price;
		this.weight = builder.weight;
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.accept(this);
	}

	public double getPrice() {
		return price;
	}

	public double getWeight() {
		return weight;
	}

	public static class Builder {
		private double price;
		private double weight;

		public Builder setPrice(double price) {
			this.price = price;
			return this;
		}

		public Builder setWeight(double weight) {
			this.weight = weight;
			return this;
		}

		public Book build() {
			return new Book(this);
		}

	}

}
