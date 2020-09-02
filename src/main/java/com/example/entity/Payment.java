package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //defining relationship for spring
@Table(name = "PAYMENT_TB") //defining table storing these entities
@Data //essentially handles @Getter, @Setter, @ToString, @EqualsAndHashCode for entity
@AllArgsConstructor //automatically generates a constructor with a parameter for each field in your class (unless that field is a *defined* final var)
@NoArgsConstructor //generates a default constructor with no parameters
public class Payment {

    @Id //Specifies the primary key of an entity
    @GeneratedValue //automatically generates value for this field, can use strategy to generate value (just for this example purpose)
    private int paymentId;
    private String paymentStatus;
    private String transactionId;
}
