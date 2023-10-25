package com.example.SFRANCH.Packages_Offered;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Packages_Offered_Services {
    public List<Packages_Offered> getPackagesOffered(){
        return List.of(
                new Packages_Offered(
                        1L,
                        "Sunset_Ride",
                        "Trail Ride occuring at sunset",
                        20
                )
        );
    }
}
