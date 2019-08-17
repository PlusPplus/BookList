
package com.Data;

import com.Data.BookList;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Plus
 * @date 2019年7月18日
 */
public class BookListDao   extends DBcon<BookList>
	  implements Ientity<BookList>
	{
	  public BookList getentity(ResultSet result)
	  {
		  BookList booklist = new BookList();
	    try
	    {
	      booklist.setNo(result.getInt("No"));
	      booklist.setBook(result.getString("Book"));
	      booklist.setAuthor(result.getString("Author"));
	      booklist.setDate(result.getString("Date"));
	      booklist.setNote(result.getString("Note"));
	      booklist.setType(result.getString("Type"));
	    }
	    catch (SQLException e)
	    {
	      e.printStackTrace();
	    }
	    return booklist;
	  }
	  
	  public int addBook(BookList booklist)
	  {
String sql = "insert into BookList(Book,Author,Date,Note,Type) values('" + booklist.getBook() + "','" + booklist.getAuthor() + "','" + booklist.getDate()+"','" + booklist.getNote()+  "','" + booklist.getType()+"')";
	    return upSql(sql);
	  }
	  
	  public int delBook(int No)
	  {
	    String sql = "DELETE FROM BookList WHERE No = '" + No + "'";
	    return upSql(sql);
	  }
	  
	  public List<BookList> queryAll()
	  {
	    String sql = "select * from BookList order by date";
	    return querySql(sql, this);
	  }
	

	public BookList querybyno(int No) {
		String sql="select * from BookList where No="+No;
		return this.queryOne(sql, this);
	}

	public int updatebook(BookList booklist) {
		
		String sql="update BookList set Book='"+booklist.getBook()+"',Author='"+booklist.getAuthor()+"',Date='"+booklist.getDate()+"',Note='"+booklist.getNote()+"',Type='"+booklist.getType()+"' where No="+booklist.getNo();
	
		return this.upSql(sql);
	}

	public List<BookList> queryDate(String Date1,String Date2) {
		String sql="select * from BookList WHERE Date >'"+Date1+"' and  Date<'"+Date2+" order by date'";
		return querySql(sql, this);
	}
	public BookList querySum()
	  {
	    String sql = "select count(Book) from BookList";
	    return queryOne(sql, this);
	  }


	}
