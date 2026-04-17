

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestConnection {
    public static void main(String[] args) {

        try {
            // Load Oracle Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

           
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String username = "system";
            String password = "isha04@";

            
            Connection con = DriverManager.getConnection(url, username, password);

            if (con != null) {
                System.out.println(" Connected to Oracle Database successfully!");
            }
            Statement stmt = con.createStatement();

            
            String query = "CREATE TABLE student (" +
                           "id NUMBER PRIMARY KEY, " +
                           "name VARCHAR2(50))";

            // Execute
            stmt.executeUpdate(query);

            System.out.println(" Table created successfully!");
             String query1="insert into student values(?,?)";
             PreparedStatement pst=con.prepareStatement(query1);

             pst.setInt(1,4 );
             pst.setString(2,"isha");
             pst.executeUpdate();

             pst.setInt(1,3);
             pst.setString(2,"alice");
             pst.executeUpdate();

             String query2="update student set name=? where id=?";
             PreparedStatement pst1=con.prepareStatement(query2);
             pst1.setString(1,"sita");
             pst.setInt(2,2);
             pst.executeUpdate();

             String query3="select * from student";
             PreparedStatement pst3=con.prepareStatement(query3);
             ResultSet rs=pst3.executeQuery();

             while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString("name"));
             }
              
             Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet);
             ResultSet rs=st.executeQuery("select * from sudent");

             while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));

             }
             System.out.println("--------backward-----------");
             rs.afterLast();
             while(rs.previous()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
             }
             rs.absolute(5);
             System.out.println("name at 5th row= "+rs.getString("name"));
            


            
            con.close();

        } catch (Exception e) {
           
            e.printStackTrace();
        }
    }
}