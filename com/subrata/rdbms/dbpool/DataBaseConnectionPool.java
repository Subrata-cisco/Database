package com.subrata.rdbms.dbpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 * Actual DB connection pool which shall be wrapped by Manager class and should not expose to client
 * to do only restricted operation on Connection object.
 * 
 * @author Subrata Saha.
 *
 */
public class DataBaseConnectionPool {
	
	int maxConnection;
	ArrayList<Connection> list ;
	
	public DataBaseConnectionPool(int max){
		maxConnection = max;
		list = new ArrayList<>(max);
	}
	
	public Connection getConnection(){
		Connection conn = null;
		while(list.size() == maxConnection){
			synchronized (list) {
				try {
					list.wait();
				} catch (InterruptedException e) {
					// do nothing
					return null;
				}
			}
		}
		
		synchronized (list) {
			if(list.size() == 0){
				conn = newConnection();
			}else{
				conn = list.remove(0);
				try {
					if(conn.isClosed()){
						conn = getConnection();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			list.notifyAll();
		}
		return conn;
	}
	
	public void releaseConnection(Connection con){
		synchronized (list) {
			try {
				if(con == null || con.isClosed()){
					// nothing forget it.
				}else{
					list.add(con);
				}
			} catch (SQLException e) {
				//
			}
			list.notifyAll();
		}
	}
	
	public void releaseAllConnection(){
		synchronized (list) {
			while(list != null && !list.isEmpty()){
				Connection conn = list.remove(0);
				try {
					if(conn != null && !conn.isClosed()){
					 conn.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			list.notifyAll();
		}
	}
	
	private Connection newConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("URL", "user", "password");
		} catch (SQLException e) {
			return null;
		}
		return con;
	}

}
