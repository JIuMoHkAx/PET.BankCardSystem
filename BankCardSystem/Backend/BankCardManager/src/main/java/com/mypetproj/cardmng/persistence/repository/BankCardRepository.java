package com.mypetproj.cardmng.persistence.repository;

import com.mypetproj.cardmng.persistence.entity.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BankCardRepository extends JpaRepository<CardEntity, Long> {
}
