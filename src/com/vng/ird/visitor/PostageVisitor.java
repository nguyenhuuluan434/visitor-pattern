package com.vng.ird.visitor;

public class PostageVisitor implements Visitor {
	private double totalPostageForCart;

	@Override
	public void accept(Book book) {
		// TODO Auto-generated method stub
		if (book.getPrice() < 10.0) {
			totalPostageForCart += book.getWeight() * 4;
		} else {
			totalPostageForCart += book.getWeight() * 1;
		}
	}

	@Override
	public void accept(CD cd) {
		// TODO Auto-generated method stub
		if (cd.getPrice() < 10.0) {
			totalPostageForCart += cd.getWeight() * 5;
		} else {
			totalPostageForCart += cd.getWeight() * 2;
		}
	}

	@Override
	public void accept(DVD dvd) {
		// TODO Auto-generated method stub
		if (dvd.getPrice() < 10.0) {
			totalPostageForCart += dvd.getWeight() * 6;
		} else {
			totalPostageForCart += dvd.getWeight() * 3;
		}
	}

	public double getTotalPostageForCart() {
		return totalPostageForCart;
	}

}
