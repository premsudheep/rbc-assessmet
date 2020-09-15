package com.r.b.c.dj.djapp.controller;

import com.r.b.c.dj.djapp.model.StockIndex;
import com.r.b.c.dj.djapp.service.StockRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApplicationController {

    @Autowired
    private StockRepositoryService service;

    @RequestMapping(value="/add/record", method= RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> addWeeklyIndex(@RequestBody StockIndex stockIndex) {
        int i = service.addWeeklyIndex(stockIndex);
        return i==1 ? ResponseEntity.ok("Record has been added"): (ResponseEntity<Object>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @RequestMapping(value="/get/all", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StockIndex>> getAllWeeklyIndex() {
        return new ResponseEntity<>(service.getAllWeeklyIndex(), HttpStatus.OK);
    }

    @RequestMapping(value="/get", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StockIndex>> getAllSelectedIndices(@RequestParam String stockName) {
        return new ResponseEntity<>(service.getSelectedIndices(stockName), HttpStatus.OK);
    }

    @RequestMapping(value="/delete/all", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> deleteCollection() {
        service.deleteCollection();
        return new ResponseEntity<Object>("Collection dropped", HttpStatus.OK);
    }



}
