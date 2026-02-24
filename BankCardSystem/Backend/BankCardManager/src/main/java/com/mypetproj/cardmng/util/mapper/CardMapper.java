package com.mypetproj.cardmng.util.mapper;

import com.mypetproj.cardmng.domain.card.Card;
import com.mypetproj.cardmng.persistence.entity.CardEntity;

public class CardMapper {

    public static Card toDomain(CardEntity entity) {
        return new Card(
                entity.getId(),
                entity.getLast4(),
                entity.getToken(),
                entity.getOwner().getId(),
                entity.getExpireDate(),
                entity.getStatus(),
                entity.getBalance()
        );
    }
    public static CardEntity toEntity(Card domain) {
   //    OwnerEntity ownerEntity = ownerRepository.findById(domain.getOwnerId())
  //              .orElseThrow(() -> new NotFoundException("Owner not found"));

        return new CardEntity(
                domain.getId(),
                domain.getLast4(),
                domain.getToken(),
                ownerEntity, // Только Entity для JPA
                domain.getExpireDate(),
                domain.getStatus(),
                domain.getBalance()
        );
    }
}
