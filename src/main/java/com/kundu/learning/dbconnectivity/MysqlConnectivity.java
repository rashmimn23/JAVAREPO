package com.kundu.learning.dbconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * MysqlConnectivity
 */
public class MysqlConnectivity {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/randr","root","123456789");
            Statement stmt=con.createStatement();
            ResultSet result=stmt.executeQuery("Select * from pointsvalue");
            while(result.next()){
                System.out.println(result.getString("REWARD_TYPE")+"="+result.getInt("POINTS"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
