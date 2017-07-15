package com.mybatis.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * MyBatis的练习使用
 * @author Administrator
 *
 */
public class Jdbc {
    public static final String url = "jdbc:mysql://127.0.0.1/mybatis";  
    public static final String name = "com.mysql.jdbc.Driver";  
    public static final String user = "root";  
    public static final String password = "";  
    static ResultSet ret = null;
    public Connection conn = null;  
    public PreparedStatement pst = null; 
//    数据库的初始化操作
    public Jdbc(String sql,String where) {
		// TODO Auto-generated constructor stub
        try {  
            Class.forName(name);//指定连接类型  
            conn = DriverManager.getConnection(url, user, password);//获取连接  
            pst = conn.prepareStatement(sql);//准备执行语句  
            pst.setString(1,where);
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
	}
    
//    返回处理数据结果
    public ResultSet  CheckDate(){
    	
    	try {
			ret=pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//执行语句，得到结果集  
		return ret;
		
	}
    
//    数据库的关闭操作
    public void close() {  
        try {  
            this.conn.close();  
            this.pst.close();  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    }  
}
