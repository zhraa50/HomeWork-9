package com.example.move.service;

import com.example.move.ResponseEntity.UserRepository;
import com.example.move.model.Move;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor




   public class MoveService {
    private final UserRepository userRepository;


    ArrayList<Move> move = new ArrayList();

    public  List <Move> getMove()
       {
           return userRepository.findAll();


       }

    public  void AddMove(Move move) {
           userRepository.save(move);

    }


    public void UpdateMove(Move newMove, Integer id) {
       Move oldMove =userRepository.findById(id).get();
        oldMove.setId(newMove.getId());
        oldMove.setName(newMove.getName());
        oldMove.setRating (newMove.getRating());
        userRepository.save(oldMove);

    }


    public void DeletMove(String id) {
        userRepository.delete(id);


    }
}


       //------------------------------------------------
