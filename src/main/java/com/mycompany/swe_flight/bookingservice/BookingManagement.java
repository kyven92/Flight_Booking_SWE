/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swe_flight.bookingservice;

/**
 *
 * @author venky
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.mycompany.swe_flight.entity")
@ComponentScan(basePackages = "com.mycompany.swe_flight.controller")
@ComponentScan(basePackages = "com.capg.service")
@ComponentScan(basePackages = "com.mycompany.swe_flight.dto")
@EnableMongoRepositories("com.mycompany.swe_flight.utilities")
public class BookingManagement {
    
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
            HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
            clientHttpRequestFactory.setConnectTimeout(3000);
            return new RestTemplate(clientHttpRequestFactory);
    }
    public static void main(String[] args) {
            SpringApplication.run(BookingServiceApplication.class, args);
    }
    
}
