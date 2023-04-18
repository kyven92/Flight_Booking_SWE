/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swe_flight.service;

/**
 *
 * @author venky
 */
public class UserAuthentication {
    
    
    @Autowired
   User user;

   @override   
   public user() {
       this.userID = null;
       this.userName = null;
       this.userEmail = null;
       this.userDOB = null;
       this.userPhone = null;
       this.userAddress = null;
   }


public String get_userID() {
   return this.userID;  
}


public String set_userID(String userID) {
   this.userID = userID;
}


public String get_userName() {
   return this.userID;  
}


public String set_userName(String userName) {
   this.userName = userName;
}


public String get_userEmail() {
   return this.userEmail;  
}


public String set_userEmail(String userEmail) {
   this.userEmail = userEmail;
}


public Date get_userDOB() {
   return this.userDOB;  
}


public Date set_userDOB(Date userDate) {
   this.userDOB = userDOB;
}


public String get_userPhone() {
   return this.userPhone;  
}


public String set_userPhone(String userPhone) {
   this.userPhone = userPhone;
}


public String get_userAddress() {
   return this.userAddress;  
}


public String set_userAddress(String userAddress) {
   this.userAddress = userAddress;
}


public String get_userPassword() {
   return this.userPassword;  
}


public String set_userPassword(String userPassword) {
   this.userPassword = userPassword;
}


public boolean validate(String attemptuserID, String attemptuserPassword) {
   if (attemptuserID.equals(userID) && attemptuserPassword.equals(userPassword)) {
       return true;
   } else {
       return false;
   }
}


//this method fetches the username and userpassword as an array
public String[] fetchCredentials() {
   String[] credentials = new String[3];
   credentials[0] = userID;
   credentials[1] = userPassword;
   credentials[2] = userName;
   return credentials;
}


public String[] encrypt() {
   //this method encrypts the user information to avoid data breach
}


public String[] decrypt() {
   //this method decrypts the user info before retrieving from the database for login, change password options
}

    
}
