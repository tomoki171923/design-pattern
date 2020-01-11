package Iterator1;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("a_book"));
		bookShelf.appendBook(new Book("b_book"));
		bookShelf.appendBook(new Book("c_book"));
		bookShelf.appendBook(new Book("d_book"));
		Iterator it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}

	}

}
