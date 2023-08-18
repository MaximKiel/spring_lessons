package org.example;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JazzMusic implements Music{
    private List<String> songs = List.of("Caravan", "Whiplash", "City of stars");

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
