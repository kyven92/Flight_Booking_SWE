/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swe_flight.controller;

/**
 *
 * @author venky
 */
public class WebController {
    
    

    public static final String SUCCESS_URL = "pay/success";
    public static final String CANCEL_URL = "pay/cancel";

    @Autowired
    PaymentService paymentService;
        
        
     @Autowired
    private BookingService bookingService;

    @PostMapping("/book")
    public ResponseEntity<BookingDetailsDTO> bookFlight(@Valid @RequestBody BookingDetailsDTO bookingDetailsDTO) {
        return new ResponseEntity<BookingDetailsDTO>(bookingService.newBooking(bookingDetailsDTO), HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public List<BookingDetailsDTO> bookingDetails() {
        return bookingService.getBookingDetails();
    }

    @GetMapping("/get/{id}")
    public BookingDetailsDTO bookingDetailsById(@PathVariable Integer id) {
        return bookingService.getBookingDetailsById(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<BookingDetailsDTO> update(@PathVariable Integer id, @Valid @RequestBody BookingDetailsDTO bookingDetailsDTO) {
        return new ResponseEntity<BookingDetailsDTO>(bookingService.updateBookingDetails(id, bookingDetailsDTO), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        bookingService.deleteBookingDetailsById(id);
        return "Booking details with ID: " + id + " was deleted successfully";
    }

    @DeleteMapping("/deleteAll")
    public String deleteAll() {
        bookingService.deleteAll();
        return "All booking data was deleted successfully";
    }
    
    
    @PostMapping("/pay")
    public String payment(@ModelAttribute("Order") Order order) {
        try {
            Payment payment = paymentService.createPayment(order.getPrice(),
                    order.getCurrency(), order.getMethod(), order.getIntent(),
                    order.getDescription(), "http://localhost:8085" + CANCEL_URL,
                    "http://localhost:8085" + SUCCESS_URL);

            for (Links link: payment.getLinks()) {
                if (link.getRel().equals("approval_url")) {
                    return "redirect:" + link.getHref();
                }
            }
        } catch (PayPalRESTException e) {
            e.printStackTrace();
        }
        return "redirect:/";
    }

    @GetMapping(value = CANCEL_URL)
    public String cancelPay() {
        return "Cancel";
    }

    @GetMapping(value = SUCCESS_URL)
    public String successPay(@RequestParam("paymentId") String paymentId, @RequestParam("payerId") String payerId) {
        try {
            Payment payment = paymentService.executePayment(paymentId, payerId);
            System.out.println(payment.toJSON());
            if (payment.getState().equals("approved")) {
                return "Success";
            }
        } catch (PayPalRESTException e) {
            System.out.println(e.getMessage());
        }
        return "redirect:/";
    }
}
