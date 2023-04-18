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
public class SequenceGeneratorService {
    @Autowired
    private MongoOperations mongoOperations;

    public int getSequenceNumber(String sequenceName) {

        BookingSequence counter = mongoOperations.findAndModify(Query.query(where("_id").is(sequenceName)),
                new Update().inc("sequence", 1),
                options().returnNew(true).upsert(true),
                BookingSequence.class);

        return !Objects.isNull(counter) ? counter.getSequence() : 1;
    }
}