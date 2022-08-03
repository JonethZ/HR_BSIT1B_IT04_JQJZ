/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr_bsit1b_it04_jqjz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
/**
 *
 * @author JLZapanta;
 */
public class getUserInfoJQJZ {
    public Vector getUser() throws Exception {
        Vector<Vector<String>>UserVector = new Vector<Vector<String>>();
        
        jqjzConnect c = new jqjzConnect ();
        Connection conn = c.makeConnection();
        PreparedStatement pre = conn.prepareStatement("SELECT*FROM tbljqjz_user");
        
        ResultSet rs = pre.executeQuery();
        
        while(rs.next()) {
            Vector<String>user = new Vector<String>();
            user.add(rs.getString(1));
            user.add(rs.getString(2));
            user.add(rs.getString(3));
            user.add(rs.getString(4));
            user.add(rs.getString(5));
            user.add(rs.getString(6));
            user.add(rs.getString(7));
            user.add(rs.getString(8));
            UserVector.add(user);
        }
        
        /*Close the connection after use (MUST)*/
        if(conn!=null)
            conn.close();
        
        return UserVector;
    }
}