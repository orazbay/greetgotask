package com.example.demo.mappers;


import com.example.demo.models.Word;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface WordMapper {
    @Select("SELECT * FROM WORDS")
    List<Word> findAll();

    @Select("SELECT * FROM WORDS WHERE id=#{id}")
    Word findById(@Param("id") long id);

}
