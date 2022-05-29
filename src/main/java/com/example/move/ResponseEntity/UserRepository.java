package com.example.move.ResponseEntity;

import com.example.move.ResponseEntity.UserRepository;
import com.example.move.model.Move;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <Move,Integer>
{


}

