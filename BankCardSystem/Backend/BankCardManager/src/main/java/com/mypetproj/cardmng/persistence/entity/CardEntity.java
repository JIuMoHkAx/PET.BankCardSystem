package com.mypetproj.cardmng.persistence.entity;

import com.mypetproj.cardmng.domain.card.CardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "cards")
public class CardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "last4", nullable = false, length = 4)
    private String last4;

    @Column(name = "token", unique = true)
    private String token;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "owner_id", nullable = false)
    private OwnerEntity owner;

    @Column(name = "expire_date", nullable = false)
    private LocalDate expireDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    CardStatus status;

    @Column(name = "balance", nullable = false, precision = 19, scale = 2)
    private BigDecimal balance;
}
