/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meditch;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ravi
 */
public class ConnectionClss {
    public Connection connect() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException
    {
        File f=new File("Pass.txt");

            FileInputStream fs=new FileInputStream(f);
            DataInputStream ds=new DataInputStream(fs);
            BufferedReader rd=new   BufferedReader(new InputStreamReader(ds));
           String pass = rd.readLine();
           Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/std","root",""+pass);
           return con;
  
    }
}
