package com.lucasmlacerda.dslist.repositories;

import com.lucasmlacerda.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}