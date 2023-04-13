package com.ensat.services;

import com.ensat.entities.EVModel;

import java.util.List;

public interface StationService {
    public List<EVModel> getAllStations();
    public EVModel getStationById(Integer id);
    public EVModel saveStation(EVModel Station);
    public void deleteStation(Integer id);
}
