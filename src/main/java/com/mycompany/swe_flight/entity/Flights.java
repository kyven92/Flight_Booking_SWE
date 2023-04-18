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
public class Flights {

    private int flightId;
    private String flightName;
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private Integer seats;
    private Integer fare;
}
