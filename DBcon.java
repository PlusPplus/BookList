package com.Data;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Plus
 * @date 2019年7月18日
 * @param <T>
 */
public class DBcon<T> {
	
	
	private Connection getCon() {

		Connection con = null;

		try {
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		      String url = "jdbc:sqlserver://localhost:1433;databaseName=Book";
		      String username = "sa";
		      String password = "123456";
		      con = DriverManager.getConnection(url, username, password);
			
		} catch (Exception e) {
			
		}

		return con;
	}
	
	
	public int upSql(String sql) {
		Connection con = getCon();	
		java.sql.Statement stmt = null;
		int update = 0;
		try {
			stmt = con.createStatement();
			update = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					 stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
	
				e.printStackTrace();
			}
		}
		return update;
	}
	
	
	public List<T>  querysql(String sql,Ientity<T> ie){
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		int result=0;
		con=this.getCon();
		List<T> list=null;
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);			
			list=new ArrayList<T>();			
			while(rs.next()){			
			 T t=ie.getentity(rs);
			 list.add(t);				
			}					
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return list;
	}
	
	

	public T  queryOne(String sql,Ientity<T> ie){
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;		
		con=this.getCon();
		T t=null;
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);						
			if(rs.next()){						
			 t=ie.getentity(rs);						
			}					
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return t;
	}
	
	
	
	
	
	
	public List<T> querySql(String sql,Ientity<T> ie){
		ResultSet result = null;
		Connection con = getCon();
		java.sql.Statement stmt = null;
		List<T> list = null;
		try {
			stmt = con.createStatement();
			result = stmt.executeQuery(sql);
			list = new ArrayList<T>();
			while(result.next()){
				T t = ie.getentity(result);
				list.add(t);
//				System.out.println(t);
			}
			
			
			

			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(result != null){
					result.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	

	
	
	
	
}