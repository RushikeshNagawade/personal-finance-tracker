package com.personal.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
@Setter
@Getter
@NoArgsConstructor
public class UserModel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer UserId;

    @Column
    private String UserName;

    @Column
    @Temporal(value = TemporalType.DATE)
    private Date CurrentDate;




}