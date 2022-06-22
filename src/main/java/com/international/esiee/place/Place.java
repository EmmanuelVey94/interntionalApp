package com.international.esiee.place;

import com.international.esiee.user.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Table(name = "place")
public class Place {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;

    @Column(name = "content")
    private String content;

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "latitude")
    private double latitude;
    @ManyToOne
    private User author;

}
