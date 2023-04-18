/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swe_flight.service;

/**
 *
 * @author venky
 */
@Service
// Flight.java
public class FlightInfo Extends Flights {
   @Autowired
   Flights flights;

   @override
   public FlightInfo (String flightNumber, String origin, String destination, String departureTime, String arrivalTime, int capacity) {
       this.flightNumber = flightNumber;
       this.origin = origin;
       this.destination = destination;
       this.departureTime = departureTime;
       this.arrivalTime = arrivalTime;
       this.seats = new Seats(capacity);
   }




   public int getCapacity() {
       return seats.getCapacity();
   }


   public int getNumPassengers() {
       return seats.getNumPassengers();
   }


   public void bookFlight() {
       seats.bookSeat();
   }


   public boolean isFull() {
       return seats.isFull();
   }


   // defining getters and setters to access and modify the values of instance variables


   public String getflightNumber() {
       return flightNumber;
       
   }
   
public void setflightNumber(String flightNumber) {
       this.flightNumber = flightNumber;
   }
 
   public String getorigin() {
       return origin;
   }
  
   public void setorigin(String origin) {
       this.origin = origin;
   }


   public String getDestination() {
       return destination;
   }
  
   public void setDestination(String destination) {
       this.destination = destination;
   }


   public String getdepartureTime() {
       return departureTime;
   }
  
   public void setdepartureTime(String departureTime) {
       this.departureTime = departureTime;
   }


   public String getarrivalTime() {
       return arrivalTime;
   }
  
   public void setarrivalTime(String arrivalTime) {
       this.arrivalTime = arrivalTime;
   }


   public Seats getSeats() {
       return seats;
   }
  
   public void setSeats(Seats seats) {
       this.seats = seats;
   }
}