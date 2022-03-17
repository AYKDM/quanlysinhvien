/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quanlysinhvien;

import java.sql.DriverManager;

/**
 *
 * @author ADMIN
 */
public class Connection {
    public Connection GetConnection() throws ClassNotFoundException{
                Connection con = null;
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysinhvien","root","");
        if(con != null){
            System.out.println("Ket noi thanh cong");
        }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
