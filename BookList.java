package com.Data;

public class BookList {

	  private int No;
	  private String Book;
	  private String Author;
	  private String Date;
	  private String Note;
	  private String Type;
	  
	  public int getNo()
	  {
	    return this.No;
	  }
	  
	  public void setNo(int No)
	  {
	    this.No = No;
	  }
	  
	  public String getBook()
	  {
	    return this.Book;
	  }
	  
	  public void setBook(String Book)
	  {
	    this.Book = Book;
	  }
	  
	  
	  public BookList( String Book, String Author,String Date,String Note,String Type)
	  {
	    
	    this.Book = Book;
	    this.Author = Author;
	    this.Date = Date;
	    this.Note = Note;
	    this.Type = Type;
	  }
	  
	  public BookList() {
		
	}

	public String getAuthor()
	  {
	    return this.Author;
	  }
	  
	  public void setAuthor(String Author)
	  {
	    this.Author = Author;
	  }

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getNote() {
		return Note;
	}

	public void setNote(String note) {
		Note = note;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
	}
