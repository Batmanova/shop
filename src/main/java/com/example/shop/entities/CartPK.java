package com.example.shop.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable //part of another entity
public class CartPK implements Serializable {

    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "byer")
    private Byer byer;


    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "good")
    private Good good;
}
