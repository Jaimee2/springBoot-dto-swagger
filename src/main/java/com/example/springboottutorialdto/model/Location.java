package com.example.springboottutorialdto.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "locations")
public class Location {
    @Id
    private long id;
    private String place;
    private String description;
    private  double longitude;
    private  double latitude;

}
