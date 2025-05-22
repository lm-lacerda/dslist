package com.lucasmlacerda.dslist.services;

import com.lucasmlacerda.dslist.dto.GameDTO;
import com.lucasmlacerda.dslist.dto.GameMinDTO;
import com.lucasmlacerda.dslist.entities.Game;
import com.lucasmlacerda.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get(); // Lacks appropriate treatment for non-existent IDs.
        GameDTO dto = new GameDTO(result);
        return dto;
    }
}
