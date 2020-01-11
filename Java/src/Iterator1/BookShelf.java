package Iterator1;

import java.util.ArrayList;

/*
 * 本棚クラス
 */

public class BookShelf implements Aggregate {
	//private Book[] books;
	private ArrayList books;
	private int last = 0 ;

	public BookShelf (int initialsize) {
		//this.books = new Book[maxsize];
		this.books = new ArrayList(initialsize);
	}
	
	public Book getBookAt (int index) {
		//return books[index];
		return (Book)books.get(index);
	}
	
	public void appendBook (Book book) {
		//this.books[last] = book;
		//last ++;
		books.add(book);
	}

	public int getLength() {
		//return last;
		return books.size();
	}

	@Override
	public Iterator iterator() {
	    return new BookShelifInterator(this);
	}

}
