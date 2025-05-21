package com.lucasmlacerda.dslist.repositories;

import com.lucasmlacerda.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
