package com.etech.Census.service;

import com.etech.Census.dto.CensusDTO;

public interface CensusService {
	
	long getAdminCount();
    long getHouseholdCount();
    long getMemberCount();
    long getUserCount();
    
    void saveCensusData(CensusDTO dto);

	String saveCensus(CensusDTO dto);
}

