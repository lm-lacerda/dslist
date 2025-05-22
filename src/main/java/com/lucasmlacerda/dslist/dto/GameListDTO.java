package com.lucasmlacerda.dslist.dto;

import com.lucasmlacerda.dslist.entities.GameList;
import org.springframework.beans.BeanUtils;

public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO() {
    }

    public GameListDTO(GameList entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
