package com.vng.ird.visitor;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		ArrayList<Visitable> listVisitable = new ArrayList<Visitable>();
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				listVisitable.add(new CD.Builder().setName(i + "").setPrice(i * (new Random().nextInt()))
						.setResolution(i + "k").setWeight(i * (new Random().nextInt())).build());
			} else if (i % 3 == 0) {
				listVisitable.add(new DVD.Builder().setName(i + "").setPrice(i * (new Random().nextInt()))
						.setResolution(i + "k").setWeight(i * (new Random().nextInt())).build());

			} else {
				listVisitable.add(new Book.Builder().setPrice(i * (new Random().nextInt()))
						.setWeight(i * (new Random().nextInt())).build());
			}
		}
		double cost = 0;
		PostageVisitor visitor = new PostageVisitor();
		for (Visitable visitable : listVisitable) {
			visitable.accept(visitor);
		}
		System.out.println(visitor.getTotalPostageForCart());

		/*for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				CD cd = new CD.Builder().setName(i + "").setPrice(i * (new Random().nextDouble()))
						.setResolution(i + "k").build();

				System.out.println(cd.getName());
			}
		}*/

	}
}
