package com.vng.ird.visitor;

public class CD implements Visitable {
	private Builder builder;

	private String resolution;
	private String name;
	private double price;
	private double weight;

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.accept(this);
	}

	public CD(Builder builder) {
		this.builder = builder;
		this.name = builder.getName();
		this.resolution = builder.getResolution();
		this.price = builder.getPrice();
		this.weight = builder.getWeight();
	}

	public String getResolution() {
		return resolution;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getWeight() {
		return weight;
	}

	public static class Builder {
		private String resolution;
		private String name;
		private double price;
		private double weight;

		public Builder setResolution(String resolution) {
			this.resolution = resolution;
			return this;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setPrice(double price) {
			this.price = price;
			return this;
		}

		public Builder setWeight(double weight) {
			this.weight = weight;
			return this;
		}

		public String getResolution() {
			return resolution;
		}

		public String getName() {
			return name;
		}

		public double getPrice() {
			return price;
		}

		public double getWeight() {
			return weight;
		}

		public CD build() {
			validate();
			return new CD(this);
		}

		private void validate() {
		}

	}

	public String toJson() {
		return this.toJson();
	}
}
