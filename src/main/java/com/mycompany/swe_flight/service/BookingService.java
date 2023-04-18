/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swe_flight.service;

/**
 *
 * @author venky
 */
public interface BookingService {

    List<BookingDetailsDTO> getBookingDetails();
    BookingDetailsDTO getBookingDetailsById(Integer id);
    BookingDetailsDTO newBooking(BookingDetailsDTO bookingDetailsDTO);
    BookingDetailsDTO updateBookingDetails(Integer id, BookingDetailsDTO bookingDetailsDTO);
    void deleteBookingDetailsById(Integer id);
    void deleteAll();
}