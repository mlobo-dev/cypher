package com.dev4abyss.cypher.modules.ceasar.service;

import com.dev4abyss.cypher.modules.ceasar.dto.MessageDTO;
import org.springframework.stereotype.Service;

@Service
public class CeasarService {


    public MessageDTO encode(MessageDTO dto) {
        return dto;
    }
}
