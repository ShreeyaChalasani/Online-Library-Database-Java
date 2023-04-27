package library;

import java.util.Objects;

/*
 * contains book class w attributes and methods 
 */

public class Book {
	public static int nextBookNum=1;

		String title; 
		String genre; 
		String author; 
		int Id;
		double price;
		
		
		public Book(String title, String genre, String author, double price) {
			super();
			this.title = title;
			this.genre = genre;
			this.author = author;
			this.price = price;
			this.Id = Book.nextBookNum++;
		}
		
		public Book(String title, String genre, String author) {
			super();
			this.title = title;
			this.genre = genre;
			this.author = author;
			this.Id = Book.nextBookNum++;
		}
		public Book(String title) {
			super();
			this.title = title;
			this.Id = Book.nextBookNum++;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getId() {
			return Id;
		}
		public void setId(int Id) {
			this.Id = Id;
		}

		@Override
		public int hashCode() {
			return Objects.hash(Id, author, genre, title);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			return Id == other.Id && Objects.equals(author, other.author) && Objects.equals(genre, other.genre)
					&& Objects.equals(title, other.title);
		}
		
		
		
		
}
