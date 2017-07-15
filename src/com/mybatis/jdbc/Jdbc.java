package com.mybatis.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * MyBatis����ϰʹ��
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
//    ���ݿ�ĳ�ʼ������
    public Jdbc(String sql,String where) {
		// TODO Auto-generated constructor stub
        try {  
            Class.forName(name);//ָ����������  
            conn = DriverManager.getConnection(url, user, password);//��ȡ����  
            pst = conn.prepareStatement(sql);//׼��ִ�����  
            pst.setString(1,where);
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
	}
    
//    ���ش������ݽ��
    public ResultSet  CheckDate(){
    	
    	try {
			ret=pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//ִ����䣬�õ������  
		return ret;
		
	}
    
//    ���ݿ�Ĺرղ���
    public void close() {  
        try {  
            this.conn.close();  
            this.pst.close();  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    }  
}
