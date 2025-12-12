package com.etech.Census.dto;

import lombok.Data;
import java.util.List;

@Data
public class CensusDTO {

    private HouseholdDTO household;
    private List<MemberDTO> members;

    @Data
    public static class HouseholdDTO {

        private String householdId;
        private String headName;
        private String aadharno;
        private String age;

        private String state;
        private String district;
        private String subdistrict;
        private String villageTown;
        private String wardBlock;
        private String pincode;
        private String houseNo;
        private String street;

        private String houseType;
        private String ownership;
        private String numRooms;
        private String toiletType;
        private String waterSource;
        private String electricity;
        private String kitchen;
        private String cookingFuel;

        private String fridge;
        private String tv;
        private String internet;
        private String vehicle;
    }

    @Data
    public static class MemberDTO {

        private String name;
        private String relation;
        private String gender;
        private String age;
        private String marital;
        private String language;
        private String education;
        private String employment;
        private String disability;
    }
}
