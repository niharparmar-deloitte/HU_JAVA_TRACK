import java.sql.*;
import java.util.Scanner;


public class employee_manage {
    public void employee_info() {
        Scanner sc = new Scanner(System.in);
        String jdbcURL = "jdbc:mysql://localhost:3306/sampledbase";
        String username = "root";
        String password = "nih862862";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            //System.out.println("Connection Established Successfully");
            Statement st = connection.createStatement();
            int b = 0;
            while (b != -1) {
                System.out.println("Select the action to perform:\n" + "1. Insert\n" + "2. Update\n" + "3. Read\n" + "4. Delete\n" + "5. Exit\n");
                int input = sc.nextInt();

                if (input == 1) {
                    System.out.println("Enter User ID: ");
                    int id = sc.nextInt();
                    System.out.println("Enter Name: ");
                    String name = sc.next();
                    System.out.println("Enter Age: ");
                    int age = sc.nextInt();
                    if (age < 18 || age > 90) {
                        System.out.println("You are not allowed to enter data");
                        return;
                    }
                    System.out.println("Enter Company Name: ");
                    String cname = sc.next();
                    System.out.println("Enter Designation: ");
                    String desig = sc.next();
                    System.out.println("Enter Salary: ");
                    int sal = sc.nextInt();
                    if(sal<=0){
                        System.out.println("Please enter a valid Salary");
                    }
                    System.out.println("Enter Address: ");
                    String addrs = sc.next();
                    System.out.println("Enter Phone Number: ");
                    String pnum = sc.next();
                    st.executeUpdate("insert into employee_details value('" + id + "','" + name + "','" + age + "','" + cname + "','" + desig + "','" + sal + "','" + addrs + "','" + pnum + "')");
                    System.out.println("Employee details added successfully!");
                    st.close();
                }
                else if (input == 2) {
                    String sql = "update employee_details set username=? where userId=?";
                    PreparedStatement stmt = connection.prepareStatement(sql);
                    System.out.println("Enter new Username");
                    String nname = sc.next();
                    stmt.setString(1,nname);
                    System.out.println("Enter the UserID");
                    int uid = sc.nextInt();
                    stmt.setInt(2,uid);
                    stmt.executeUpdate();
                    System.out.println("The user information is updated successfully");
                }
                else if (input == 3) {
                    String sql = "SELECT * from employee_details";
                    Statement stmt = connection.createStatement();
                    ResultSet rs = stmt.executeQuery(sql);

                    while (rs.next()) {
                        int id = rs.getInt(1);
                        String name = rs.getString(2);
                        int Age = rs.getInt(3);
                        String cname = rs.getString(4);
                        String desig = rs.getString(5);
                        String salary = rs.getString(6);
                        String address = rs.getString(7);
                        String pnum = rs.getString(8);
                        System.out.println(id + ":" + name + "," + Age + "," + cname + "," + desig + "," + salary + "," + address + "," + pnum);
                    }
                }
                else if (input == 4) {
                    System.out.println("Enter UserID you want to delete: ");
                    int uid = sc.nextInt();
                    String sql = "DELETE from employee_details WHERE userId='"+uid+"'";
                    Statement stmt = connection.createStatement();

                    int rows = stmt.executeUpdate(sql);

                    if (rows > 0) {
                        System.out.println("The employee's information is deleted");
                    }
                    stmt.close();
                }
                else if (input==5){
                    break;
                }
                System.out.println("If user wants to continue with CRUD Operations press 1 or for exit press -1");
                int inputv = sc.nextInt();
                b = inputv;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}
