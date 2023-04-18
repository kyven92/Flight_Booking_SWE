/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swe_flight.entity;

/**
 *
 * @author venky
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

   private String userID;
   private String userName;
   private String userPassword;
   private String userEmail;
   private Date userDOB;
   private String userPhone;
   private String userAddress;
   private String secretKey = "secretKey"; //for encryption and decryption for data protection
}
