package com.ensat.services;

import com.ensat.entities.EVModel;
import com.ensat.repositories.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationServiceImpl implements StationService {
     @Autowired
     private StationRepository StationRepository;

    @Override
    public List<EVModel> getAllStations() {
        return StationRepository.findAll();
    }

    @Override
    public EVModel getStationById(Integer id) {
        return StationRepository.findById(id).get();
    }

    @Override
    public EVModel saveStation(EVModel Station) {
        return StationRepository.save(Station);
    }

    @Override
    public void deleteStation(Integer id) {
        StationRepository.deleteById(id);
    }

}
