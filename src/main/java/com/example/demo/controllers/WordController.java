package com.example.demo.controllers;


import com.example.demo.mappers.WordMapper;
import com.example.demo.models.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/words")
public class WordController {

  @Autowired
  private WordMapper wordMapper;
  @GetMapping("/all")
  public List<Word> allWords() {
    return wordMapper.findAll();
  }
  @RequestMapping("/{id}")
  public String getById(@PathVariable("id") long id) {
    return wordMapper.findById(id).getValue();
  }

}
