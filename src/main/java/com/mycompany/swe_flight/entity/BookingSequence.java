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
@Document(collection = "booking_sequence")
public class BookingSequence {

    @Id
    private String id;
    private int sequence;
}
