package com.example.move.controller;

import com.example.move.model.Move;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.move.service.MoveService;

public class MoveCntroller {


    private MoveService moveService;

    @GetMapping
    public ResponseEntity getMove() {
        return ResponseEntity.status(200).body(moveService.getMove());


    }

    @PostMapping
    public ResponseEntity AddMove(@RequestBody Move move) {
        moveService.AddMove(move);

        return ResponseEntity.status(200).body("move add ");
    }


    @PutMapping("/{/id}")
    public ResponseEntity UpdatMove(@RequestBody Move move, @RequestBody Integer id) {
        moveService.UpdateMove(move, id);

        return ResponseEntity.status(200).body("move update ");


    }
    @DeleteMapping("/{id}")

    public ResponseEntity DeletMove(@RequestBody String id){
        moveService.DeletMove(id);

        return ResponseEntity.status (200).body("move delet ");

    }

}