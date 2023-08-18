package org.example;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private List<String> songs = List.of("Tango", "Opera", "Some class music");

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
