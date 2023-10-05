import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


class jdbc{
    public static void main(String[] args){
     try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro15","root","srinu");


      String sql="create table jdbc_table(id int,name varchar)";

      Statement st=con.createStatement();
      st.executeUpdate(sql);
      System.out.println("table created");
      con.close();
     }
     catch(Exception e){

     }
    }
}