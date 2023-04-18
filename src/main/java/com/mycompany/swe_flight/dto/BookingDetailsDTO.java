/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swe_flight.dto;

/**
 *
 * @author venky
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingDetailsDTO {

    private int bookingId;
    @NotBlank(message = "First name cannot be blank or null")
    @Size(min = 3, max = 30)
    private String firstName;
    @NotBlank(message = "Last name cannot be blank or null")
    @Size(min = 3, max = 30)
    private String lastName;
    @NotBlank(message = "Gender cannot be blank or null")
    @Size(min = 3, max = 30)
    private String gender;
    @Email(message = "Invalid email", regexp = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$")
    @NotBlank(message = "Email cannot be blank or null")
    private String email;
    @NotBlank(message = "Phone number cannot be blank or null")
    @Size(min = 10, max = 10)
    private String phoneNo;
    @NotNull
    private Integer requiredSeats;
    private int flightId;
    private Flights flights;

    private LocalDateTime bookedOn;
    private LocalDateTime updatedOn;

    public BookingDetailsDTO(BookingDetails bookingDetails) {
        this.bookingId = bookingDetails.getBookingId();
        this.firstName = bookingDetails.getFirstName();
        this.lastName = bookingDetails.getLastName();
        this.gender = bookingDetails.getGender();
        this.email = bookingDetails.getEmail();
        this.phoneNo = bookingDetails.getPhoneNo();
        this.requiredSeats = bookingDetails.getRequiredSeats();
        this.flightId = bookingDetails.getFlightId();
        this.flights = bookingDetails.getFlights();

        this.bookedOn = bookingDetails.getBookedOn();
        this.updatedOn = bookingDetails.getUpdatedOn();
    }
}
