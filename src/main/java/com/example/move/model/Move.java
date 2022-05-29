package com.example.move.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

@Table(name ="id")


public class Move {
    @NotNull(message = "can not be null ")
    @Size(min =3)
    @Column( name ="id ", nullable =false,unique = true )
    private String id ;
    //----------------------------------------
    @NotNull(message = "can not be null ")
    @Size(min =2)
    @Column( name ="name ", nullable =false,unique = true )
    private String name ;
    //-------------------------------------
    @NotNull(message = "can not be null ")
    @Pattern(regexp = "(Drama, Action , Comedy)")
    private String genre;
    //----------------------------------------------
    @NotNull(message = "can not be null ")
    @Digits(message = "only number", integer = 0, fraction = 10)
    @Size(min=1, max=5, message = "must be between 1 - 5")
    private Integer rating ;
    //------------------------------------------------
    @NotNull(message = "can not be null ")
    @Digits(message = "only number", integer = 0, fraction = 10)
    @Size(min=60)

    private String duration;
    //-------------------------------------
    @NotNull(message = "can not be null ")
    @Pattern (regexp= ("yyyy-MM-dd"))
    private  Integer launchDate;


}
