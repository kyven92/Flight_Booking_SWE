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
@Document(collection = "BookingDetails")
public class BookingDetails {

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";
    @Id
    private int bookingId;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String phoneNo;
    private Integer requiredSeats;
    private int flightId;
    private Flights flights;
    @CreatedDate
    private LocalDateTime bookedOn;
    @CreatedDate
    private LocalDateTime updatedOn;

    public BookingDetails(BookingDetailsDTO bookingDetailsDTO) {
        this.bookingId = bookingDetailsDTO.getBookingId();
        this.firstName = bookingDetailsDTO.getFirstName();
        this.lastName = bookingDetailsDTO.getLastName();
        this.gender = bookingDetailsDTO.getGender();
        this.email = bookingDetailsDTO.getEmail();
        this.phoneNo = bookingDetailsDTO.getPhoneNo();
        this.requiredSeats = bookingDetailsDTO.getRequiredSeats();
        this.flightId = bookingDetailsDTO.getFlightId();
        this.flights = bookingDetailsDTO.getFlights();

        this.bookedOn = bookingDetailsDTO.getBookedOn();
        this.updatedOn = bookingDetailsDTO.getUpdatedOn();
    }

    public void bookedTime() {
        bookedOn = LocalDateTime.now();
    }

    public void updatedTime() {
        updatedOn = LocalDateTime.now();
    }
}
