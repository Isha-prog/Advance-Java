 System.out.println(" Table created successfully!");
             String query1="insert into student values(?,?)";
             PreparedStatement pst=con.prepareStatement(query1);

             pst.setInt(1,4 );
             pst.setString(2,"isha");
             pst.executeUpdate();