package com.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Prepared {



public static void main(String[] args) {
{
String url= "jdbc:sqlserver://ec2-54-191-44-79.us-west-2.compute.amazonaws.com;databaseName=TrainingApril22";
String user = "logup";
String password = "Logu@123";
Connection connection = null;
try
{
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
connection = DriverManager.getConnection("jdbc:sqlserver://ec2-54-191-44-79.us-west-2.compute.amazonaws.com;databaseName=TrainingApril22;integratedSecurity=false;encrypt=false;trustServerCertificate=false","logup","Logu@123");
Statement preparedStatement = connection.createStatement();
ResultSet resultSet = preparedStatement.executeQuery("select * from Employees WHERE Title = 'marketing'");
while(resultSet.next())
{
System.out.println(resultSet.getString("FirstName")+ ""+resultSet.getString("LastName"));

}
resultSet.close();
preparedStatement.close();
connection.close();
}catch (Exception e) {
System.out.println("catch block");
e.printStackTrace();
}




}



}



}