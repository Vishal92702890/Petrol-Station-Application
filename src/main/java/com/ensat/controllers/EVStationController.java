package com.ensat.controllers;

import com.ensat.entities.EVModel;
import com.ensat.services.StationService;
import com.ensat.services.welcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EVStationController {
     @Autowired
     private StationService stationService;
     @Autowired
     private com.ensat.services.welcomeService welcomeService;
     @RequestMapping(value="/getWelcomeMessageEndpoint",method= RequestMethod.GET)
     public String getWelcomeMessage() {
         return welcomeService.getWelcomeMessage();
     }

     @RequestMapping(value = "/getAllStations", method = RequestMethod.GET)
     public List<EVModel> getAllStations(){
         return stationService.getAllStations();
     }

    @RequestMapping(value = "/getStation", method = RequestMethod.GET)
    public EVModel getStation(@RequestParam("stationID") Integer station_id){
         return stationService.getStationById(station_id);
     }

    @RequestMapping(value = "/saveStation", method = RequestMethod.POST)
    public void saveStation(@RequestBody EVModel station){
         stationService.saveStation(station);
     }
     @RequestMapping(value= "/updateStation/{id}", method = RequestMethod.PUT)
    public void updateEmployee( @RequestParam("stationID") Integer station_id, @RequestBody EVModel model){
         EVModel existingStation = stationService.getStationById(station_id);
         existingStation.setStation_name(model.getStation_name());
         existingStation.setStation_price(model.getStation_price());
         existingStation.setStation_address(model.getStation_address());
         stationService.saveStation(existingStation);
    }
    @RequestMapping(value = "/deleteStation/{id}", method = RequestMethod.DELETE)
    public void deleteStation( @RequestParam("stationID") Integer station_id){
         stationService.deleteStation(station_id);
     }
}
