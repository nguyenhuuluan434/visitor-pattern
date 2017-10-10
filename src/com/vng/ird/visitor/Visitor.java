package com.vng.ird.visitor;

public interface Visitor {

	void accept(Book book);

	void accept(CD cd);
	
	void accept(DVD dvd);
}
