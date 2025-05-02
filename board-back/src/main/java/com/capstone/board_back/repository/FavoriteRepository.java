package com.capstone.board_back.repository;

import com.capstone.board_back.entity.FavoriteEntity;
import com.capstone.board_back.entity.primaryKey.FavoritePk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoriteRepository extends JpaRepository<FavoriteEntity, FavoritePk> {

}
