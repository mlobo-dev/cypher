package com.dev4abyss.cypher.modules.ceasar.controller;

import com.dev4abyss.cypher.modules.ceasar.dto.MessageDTO;
import com.dev4abyss.cypher.modules.ceasar.service.CeasarService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Ceaser Cipher",tags = "Ceasar")
@RequestMapping("/ceasar")
@RequiredArgsConstructor
@RestController
public class CeasarController {

    private final CeasarService service;

    @PostMapping("/encode")
    public ResponseEntity<MessageDTO> encodeMessage(@RequestBody MessageDTO dto) {
        return ResponseEntity.ok(service.encode(dto));
    }

}
