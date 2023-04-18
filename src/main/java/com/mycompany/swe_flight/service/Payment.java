/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swe_flight.service;

/**
 *
 * @author venky
 */
public class Payment Extends PaymentConfig {
    
    public class Payment {

    public string paymentId;
    public string ticketId;
    public string status;

    public boolean sendDetails()
    {
        // data will be taken from user, stored in database and then sent to third party for verification after which card details are validated
    }

    public boolean validateCardDetails(int cardNumber, string cardHolderName, string cardExpiry, int cvv)
    {
        if (this.cardNumber == cardNumber && this.cardHolderName == cardHolderName && this.cardExpiry == cardExpiry && this.cvv == cvv)
        {
            return true;
        }

    }

    public boolean processPayment()
    {
        //after card details are validated payment is processed through a third party software and finally receipt and confirmation is sent to user
    }
}
    
}
