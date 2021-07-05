package com.epam.unit06.task03;

public class LibraryInspector {

	public static void main(String[] args) {
		Library lib = new Library();
		
		lib.add(new Book ("Harry Potter", "J. K. Rowling", 2001, "Bloomsberry", 304, 15.5, "hard"));
		lib.add(new Book ("James Bond", "Ian Fleming", 2002, "Publisher", 454, 20, "flexi"));
		lib.add(new Book ("James Bond 2", "Ian Fleming", 2005, "Publisher 1", 342, 20, "flexi"));
		lib.add(new Book ("James Bond 007", "Ian Fleming", 1987, "Publisher", 442, 300, "hard"));
		
		System.out.println(lib.getBook(0).toString());
		
		System.out.println(lib.findByAuthor("Ian Fleming").toString());
		
		System.out.println(lib.findByAfterYear(2004).toString());

	}

}
