package com.example.demo.dao;

import com.example.demo.model.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bus on 2018/6/6.
 */
public interface GirlRep extends JpaRepository<Girl,Integer> {
}
