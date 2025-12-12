package com.etech.Census.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etech.Census.dto.CensusDTO;
import com.etech.Census.entity.Household;
import com.etech.Census.entity.Member;
import com.etech.Census.repository.AdminRepo;
import com.etech.Census.repository.HouseholdRepository;
import com.etech.Census.repository.MemberRepository;
import com.etech.Census.repository.UserRepository;

@Service
public class CensusServiceImpl implements CensusService {

    @Autowired
    private HouseholdRepository householdRepository;
    
    @Autowired
    private AdminRepo adminRepo;


    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private UserRepository userRepository;
    
    @Override
    public long getTotalHouseholds() {
        return householdRepository.count();
    }

    @Override
    public long getTotalMembers() {
        return memberRepository.count();
    }


    @Override
    public String saveCensus(CensusDTO dto) {

        Household house = new Household();

        // household mapping
        house.setHouseholdId(dto.getHousehold().getHouseholdId());
        house.setHeadName(dto.getHousehold().getHeadName());
        house.setAadharno(dto.getHousehold().getAadharno());
        house.setAge(dto.getHousehold().getAge());

        house.setState(dto.getHousehold().getState());
        house.setDistrict(dto.getHousehold().getDistrict());
        house.setSubdistrict(dto.getHousehold().getSubdistrict());
        house.setVillageTown(dto.getHousehold().getVillageTown());
        house.setWardBlock(dto.getHousehold().getWardBlock());
        house.setPincode(dto.getHousehold().getPincode());
        house.setHouseNo(dto.getHousehold().getHouseNo());
        house.setStreet(dto.getHousehold().getStreet());

        house.setHouseType(dto.getHousehold().getHouseType());
        house.setOwnership(dto.getHousehold().getOwnership());
        house.setNumRooms(dto.getHousehold().getNumRooms());
        house.setToiletType(dto.getHousehold().getToiletType());
        house.setWaterSource(dto.getHousehold().getWaterSource());
        house.setElectricity(dto.getHousehold().getElectricity());
        house.setKitchen(dto.getHousehold().getKitchen());
        house.setCookingFuel(dto.getHousehold().getCookingFuel());

        house.setFridge(dto.getHousehold().getFridge());
        house.setTv(dto.getHousehold().getTv());
        house.setInternet(dto.getHousehold().getInternet());
        house.setVehicle(dto.getHousehold().getVehicle());

        List<Member> members = new ArrayList<>();

        for (CensusDTO.MemberDTO m : dto.getMembers()) {

            Member member = new Member();
            member.setName(m.getName());
            member.setRelation(m.getRelation());
            member.setGender(m.getGender());
            member.setAge(m.getAge());
            member.setMarital(m.getMarital());
            member.setLanguage(m.getLanguage());
            member.setEducation(m.getEducation());
            member.setEmployment(m.getEmployment());
            member.setDisability(m.getDisability());
            member.setHousehold(house);

            members.add(member);
        }

        house.setMembers(members);
        householdRepository.save(house);

        return "Success";
    }

	@Override
	public void saveCensusData(CensusDTO dto) {
		// TODO Auto-generated method stub
		
	}
	

    //@Override
    public long getAdminCount() {
        return adminRepo.count();
    }

   // @Override
    public long getHouseholdCount() {
        return householdRepository.count();
    }

    //@Override
    public long getMemberCount() {
        return memberRepository.count();
    }

   // @Override
    public long getUserCount() {
        return userRepository.count();
    }
}

