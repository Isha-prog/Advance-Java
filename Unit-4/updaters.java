import java.sql.ResultSet;
import java.sql.Statement;


public class updaters {
    public static void main(String[] args) {
        try{
            Statement st=con.createStament(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery("select * from student");

           rs.absolute(2);
           rs.updateString("name","sita");
           rs.updateRow();

           rs.beforeFirst();
           rs.moveToInsertRow();
           rs.updateInt("id",11);
           rs.updateString("name","friend");
           rs.insertRow();
           rs.absolute(4);
           rs.deleteRow();
           while(rs.next()){
            int r=rs.getInt("id");
            if(r==5){
                rs.updateString("name","isha");
                rs.updateRow();
            }
           }
           

        }
        catch(Exception e)
{
    e.printStackTrace();
}    }
}
