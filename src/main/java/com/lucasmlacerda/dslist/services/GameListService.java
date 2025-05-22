package com.lucasmlacerda.dslist.services;

import com.lucasmlacerda.dslist.dto.GameListDTO;
import com.lucasmlacerda.dslist.dto.GameMinDTO;
import com.lucasmlacerda.dslist.entities.GameList;
import com.lucasmlacerda.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }
}
