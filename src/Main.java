import java.sql.*;

import java.util.Scanner;
public class Main {
//   private static final String url="jdbc:mysql://localhost:3306/mydb";
//   private static final String username="root";
//   private static final String password="rootmanya_29";
//
//   public static void main(String[] args) {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");   //drives load
//        }
//        catch(ClassNotFoundException e){
//            System.out.println(e.getMessage());
//        }
//
//        try{  //niche JDBC components mention hai
//            Connection connection=DriverManager.getConnection(url,username,password);
//            //ye yaha tak JDBC ka Boilerplate hai
//
//            Statement statement=connection.createStatement();
//            String query= "select * from student"; //printing the initial table data (data retrieve)
//
//
//           ResultSet resultset= statement.executeQuery(query); //retrieve
//
//
//
//           while(resultset.next()){  //data retrieve mai chalega
//               int id=resultset.getInt("id");
//               String name=resultset.getString("name");
//               int age=resultset.getInt("age");
//               double marks=resultset.getDouble("marks");
//               System.out.println("ID: "+id);
//               System.out.println("NAME: "+name);
//               System.out.println("AGE: "+age);
//               System.out.println("MARKS: "+marks);
//           }
//
//        }catch(SQLException e){
//            System.out.println(e.getMessage());
//       }
//    }
//}


//insert the data

//private static final String url="jdbc:mysql://localhost:3306/mydb";
//private static final String username="root";
//private static final String password="rootmanya_29";
//
//public static void main(String[] args) {
//    try {
//        Class.forName("com.mysql.cj.jdbc.Driver");   //drives load
//    }
//    catch(ClassNotFoundException e){
//        System.out.println(e.getMessage());
//    }
//
//    try{  //niche JDBC components mention hai
//        Connection connection=DriverManager.getConnection(url,username,password);
//
//        Statement statement=connection.createStatement();
//
//        String query= String.format("Insert into student(name,age,marks) values('%s' ,%o, %f)" ,"riya",23,74.5);
//
//
//        int rowsAffected= statement.executeUpdate(query);
//
//        if(rowsAffected>0){
//            System.out.println("Data inserted successfully!");
//        }
//        else{
//            System.out.println("Data not inserted");
//        }
//
//    }catch(SQLException e){
//        System.out.println(e.getMessage());
//    }
//}
//}


//update the data
//
//private static final String url="jdbc:mysql://localhost:3306/mydb";
//private static final String username="root";
//private static final String password="rootmanya_29";
//
//public static void main(String[] args) {
//    try {
//        Class.forName("com.mysql.cj.jdbc.Driver");   //drives load
//    }
//    catch(ClassNotFoundException e){
//        System.out.println(e.getMessage());
//    }
//
//    try{  //niche JDBC components mention hai
//        Connection connection=DriverManager.getConnection(url,username,password);
//
//        Statement statement=connection.createStatement();
//
//        String query= String.format("update student set marks =%f where id=%d" , 89.5, 2);
//
//
//        int rowsAffected= statement.executeUpdate(query);
//
//        if(rowsAffected>0){
//            System.out.println("Data updated successfully!");
//        }
//        else{
//            System.out.println("Data not updated");
//        }
//
//    }catch(SQLException e){
//        System.out.println(e.getMessage());
//    }
//}
//}


//delete

//    private static final String url="jdbc:mysql://localhost:3306/mydb";
//    private static final String username="root";
//    private static final String password="rootmanya_29";
//
//    public static void main(String[] args) {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");   //drives load
//        }
//        catch(ClassNotFoundException e){
//            System.out.println(e.getMessage());
//        }
//
//        try{  //niche JDBC components mention hai
//            Connection connection=DriverManager.getConnection(url,username,password);
//
//            Statement statement=connection.createStatement();
//
//            String query= "delete from student where id=2";
//
//            int rowsAffected= statement.executeUpdate(query);
//
//            if(rowsAffected>0){
//                System.out.println("Data deleted successfully!");
//            }
//            else{
//                System.out.println("Data not deleted");
//            }
//
//        }catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
//    }
//}

//*****************************************************************************************************************************
//PreparedStatement

    //insert data

//    private static final String url="jdbc:mysql://localhost:3306/mydb";
//    private static final String username="root";
//    private static final String password="rootmanya_29";
//
//    public static void main(String[] args) {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");   //drives load
//        }
//        catch(ClassNotFoundException e){
//            System.out.println(e.getMessage());
//        }
//
//        try{  //niche JDBC components mention hai
//            Connection connection=DriverManager.getConnection(url,username,password);
//
//
//            String query= "insert into student(name,age,marks) values(?, ?, ?)";
//            PreparedStatement preparedstatement = connection.prepareStatement(query); //yaha tak query compile hui hai
//
//            preparedstatement.setString(1,"ankita"); //isse values set hui hai
//            preparedstatement.setInt(2,25);
//            preparedstatement.setInt(3,86);
//
//            int rowsAffected= preparedstatement.executeUpdate(); //execute
//
//            if(rowsAffected>0){
//                System.out.println("Data inserted successfully!");
//            }
//            else{
//                System.out.println("Data not inserted");
//            }
//
//        }catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
//    }
//}


//data retrieve

//private static final String url="jdbc:mysql://localhost:3306/mydb";
//private static final String username="root";
//private static final String password="rootmanya_29";
//
//public static void main(String[] args) {
//    try {
//        Class.forName("com.mysql.cj.jdbc.Driver");   //drives load
//    }
//    catch(ClassNotFoundException e){
//        System.out.println(e.getMessage());
//    }
//
//    try{  //niche JDBC components mention hai
//        Connection connection=DriverManager.getConnection(url,username,password);
//
//        Statement statement=connection.createStatement();
//
//        String query= "select marks from student where id=?";
//        PreparedStatement preparedstatement = connection.prepareStatement(query); //yaha tak query compile hui hai
//        preparedstatement.setInt(1,1);
//
//        ResultSet resultset=preparedstatement.executeQuery(); //isme result store karengy
//        if(resultset.next()){
//            double marks =resultset.getDouble("marks");
//            System.out.println("Marks: "+marks);
//        }
//        else{
//            System.out.println("marks not found");
//        }
//
//    }catch(SQLException e){
//        System.out.println(e.getMessage());
//    }
//}
//}


//update

//private static final String url="jdbc:mysql://localhost:3306/mydb";
//private static final String username="root";
//private static final String password="rootmanya_29";
//
//public static void main(String[] args) {
//    try {
//        Class.forName("com.mysql.cj.jdbc.Driver");   //drives load
//    }
//    catch(ClassNotFoundException e){
//        System.out.println(e.getMessage());
//    }
//
//    try{  //niche JDBC components mention hai
//        Connection connection=DriverManager.getConnection(url,username,password);
//
//
//        String query= "update student set marks=? where id=?";
//
//
//        PreparedStatement preparedstatement = connection.prepareStatement(query);
//        preparedstatement.setDouble(1,88);
//        preparedstatement.setDouble(2,3);
//
//        int rowsAffected =preparedstatement.executeUpdate();
//        if(rowsAffected>0){
//            System.out.println("Data updated successfully!");
//        }
//        else{
//            System.out.println("Data not updated");
//        }
//
//    }catch(SQLException e){
//        System.out.println(e.getMessage());
//    }
//}
//}

//delete
//
//    private static final String url="jdbc:mysql://localhost:3306/mydb";
//    private static final String username="root";
//    private static final String password="rootmanya_29";
//
//    public static void main(String[] args) {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");   //drives load
//        }
//        catch(ClassNotFoundException e){
//            System.out.println(e.getMessage());
//        }
//
//        try{  //niche JDBC components mention hai
//            Connection connection=DriverManager.getConnection(url,username,password);
//
//
//            String query= "delete from student where id=?";
//
//
//            PreparedStatement preparedstatement = connection.prepareStatement(query);
//            preparedstatement.setInt(1,3);
//
//            int rowsAffected =preparedstatement.executeUpdate();
//            if(rowsAffected>0){
//                System.out.println("Data deleted successfully!");
//            }
//            else{
//                System.out.println("Data not deleted");
//            }
//
//        }catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
//    }
//}


//*************************************************************************************************************************


//BATCH PROCESSSING


//by statement interface

//
//private static final String url="jdbc:mysql://localhost:3306/mydb";
//private static final String username="root";
//private static final String password="rootmanya_29";
//
//public static void main(String[] args) {
//    try {
//        Class.forName("com.mysql.cj.jdbc.Driver");   //drives load
//    }
//    catch(ClassNotFoundException e){
//        System.out.println(e.getMessage());
//    }
//
//    try{  //niche JDBC components mention hai
//        Connection connection=DriverManager.getConnection(url,username,password);
//        Statement statement=connection.createStatement();
//        Scanner sc=new Scanner(System.in);
//        while(true){
//            System.out.println("Enter the name: ");
//            String name=sc.next();
//            System.out.println("Enter the age :");
//            int age=sc.nextInt();
//            System.out.println("Enter the marks: ");
//            double marks=sc.nextDouble();
//            System.out.println("Enter more data(Y/N): ");
//            String choice=sc.next();
//            String query=String.format("insert into student(name,age,marks) values('%s', %d, %f)", name,age,marks);
//            statement.addBatch(query);
//            if(choice.toUpperCase().equals("N")){
//                break;
//            }
//        }
//        int[]arr=statement.executeBatch();
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i] ==0){  //isse konsi query execute nhi hui vo pata chal jaayega
//                System.out.println("Query: " +i+ "not executed successfully");
//            }
//        }
//
//    }catch(SQLException e){
//        System.out.println(e.getMessage());
//    }
//}
//}


//preparedstatement se

//    private static final String url="jdbc:mysql://localhost:3306/mydb";
//    private static final String username="root";
//    private static final String password="rootmanya_29";
//
//    public static void main(String[] args) {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");   //drives load
//        }
//        catch(ClassNotFoundException e){
//            System.out.println(e.getMessage());
//        }
//
//        try{  //niche JDBC components mention hai
//            Connection connection=DriverManager.getConnection(url,username,password);
//            String query="insert into student(name,age,marks) values(?,?,?)"; //niche query pass karni hai to usse upar likho
//            PreparedStatement preparedstatement=connection.prepareStatement(query);
//            Scanner sc=new Scanner(System.in);
//            while(true){
//                System.out.print("Enter the name: ");
//                String name=sc.next();
//                System.out.print("Enter the age :");
//                int age=sc.nextInt();
//                System.out.print("Enter the marks: ");
//                double marks=sc.nextDouble();
//                System.out.print("Enter more data(Y/N): ");
//                String choice=sc.next();
//                //placeholder value pass
//                preparedstatement.setString(1,name);
//                preparedstatement.setInt(2,age);
//                preparedstatement.setDouble(3,marks);
//
//                preparedstatement.addBatch(); //preparedstatement ke case mai yaha argument mai quesry pass nahi karengey
//                if(choice.toUpperCase().equals("N")){
//                    break;
//                }
//            }
//            int[]arr=preparedstatement.executeBatch();
//
//            for(int i=0;i<arr.length;i++){
//                if(arr[i] ==0){  //isse konsi query execute nhi hui vo pata chal jaayega
//                    System.out.println("Query: " +i+ "not executed successfully");
//                }
//            }
//
//        }catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
//    }
//}


//*****************************************************************************************************************************


//TRANSACTION HANDLING


    private static final String url = "jdbc:mysql://localhost:3306/hellodb";
    private static final String username = "root";
    private static final String password = "rootmanya_29";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   //drives load
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {  //niche JDBC components mention hai
            Connection connection = DriverManager.getConnection(url, username, password);
            connection.setAutoCommit(false); //jab manually check karke karengey
            String debit_query = "update accounts set balance =balance - ? where account_number = ?";
            String credit_query = "update accounts set balance =balance + ? where account_number = ?";
            PreparedStatement debitpreparedstatement = connection.prepareStatement(debit_query);
            PreparedStatement creditpreparedstatement = connection.prepareStatement(credit_query);

            //user se hi balance le rahe hai
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Account Number: ");
            int account_number = sc.nextInt();
            System.out.println("Enter Amount: ");
            double amount = sc.nextDouble();

            //set the placeholder values
//            debitpreparedstatement.setDouble(1,500);
//            debitpreparedstatement.setInt(2,101);
//            creditpreparedstatement.setDouble(1,500);
//            creditpreparedstatement.setInt(2,102);


//            int affectedRows1=debitpreparedstatement.executeUpdate();
//            int affectedRows2=creditpreparedstatement.executeUpdate();


            //user se daala hua balance ko check kar rahe hai current_balance se (catch se pehle tak jab user balance prompt kar raha hai)
            debitpreparedstatement.setDouble(1, amount);
            debitpreparedstatement.setInt(2, account_number);
            creditpreparedstatement.setDouble(1, amount);
            creditpreparedstatement.setInt(2, 102);

            int affectedRows1 = debitpreparedstatement.executeUpdate();  //jab aurocommit false par set hai tab if mai nhi daalenegy
            int affectedRows2 = creditpreparedstatement.executeUpdate();

            if (isSufficient(connection, account_number, amount)) {  //ye jab autocommit ko false set kar rhe hai tab kaam aayega

//                int affectedRows1 = debitpreparedstatement.executeUpdate();  //jab aurocommit
//                int affectedRows2 = creditpreparedstatement.executeUpdate();

                connection.commit();
                System.out.println("Transaction successful");
            } else {
                connection.rollback();
                System.out.println("Transaction unsuccessful");
            }

            debitpreparedstatement.executeUpdate();
            creditpreparedstatement.executeUpdate();


            //try mai bane hai jo instances try block mai hi close hongey
            debitpreparedstatement.close();
            creditpreparedstatement.close();
            sc.close();
            connection.close();


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //creating function checking the current amount is not less than the debit amount

    static boolean isSufficient(Connection connection, int account_number, double amount) {

        try {
            String query = "select balance from accounts where account_number =?";
            PreparedStatement preparedstatement = connection.prepareStatement(query);

            preparedstatement.setInt(1, account_number);
            ResultSet resultSet = preparedstatement.executeQuery();
            if (resultSet.next()) {
                double current_balance = resultSet.getDouble("balance");
                if (amount > current_balance) {
                    return false;
                } else {
                    return true;
                }
            }
            resultSet.close();  //resultSet instance is closed to maintain security

        } catch (SQLException e) {
            System.out.println("exception occured");
        }
        return false;
    }
}



































