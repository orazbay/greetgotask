package com.example.demo.models;

public class Word {
    private long id;
    private String value;
    public Word(){

    }
    public Word(String value){
        this.value=value;
    }

    public long getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("id:%d,value:%s",getId(), getValue());
    }
}
