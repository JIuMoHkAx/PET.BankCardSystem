package com.mypetproj.cardmng.api.controller;

import com.mypetproj.cardmng.api.dto.CardCreateRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cards")
public class CardCRUDController {

    @GetMapping
    @RequestMapping("/myCard")
    public void getById(@RequestBody CardCreateRequest req){

    }

    @GetMapping
    public void getAll(){

    }

    public void create(){

    }

    public void update(){

    }
}
