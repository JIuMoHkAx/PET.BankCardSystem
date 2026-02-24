package com.mypetproj.cardmng.domain.card;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Card {

    private long id;

    private String last4;

    private String token;

    private Long ownerId;

    private LocalDate expireDate;

    CardStatus status;

    private BigDecimal balance;

    public String  getNumber(){
        String NUM_MASK = "**** **** ****";
        return NUM_MASK + last4;
    }

    @Override
    public String toString() {
        return "Card{" +
                "\nnumber=" + getNumber() +
                ", \nowner='" + ownerId + '\'' +
                ", \nexpireDate=" + expireDate +
                ", \nstatus=" + status +
                ", \nbalance=" + balance +
                '}';
    }
}
