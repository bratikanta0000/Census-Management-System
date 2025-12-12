package com.etech.Census.service;

import com.etech.Census.dto.CensusDTO;

public interface CensusService {
	 void saveCensusData(CensusDTO dto);

	String saveCensus(CensusDTO dto);
	
	long getTotalHouseholds();
    long getTotalMembers();
	
}

