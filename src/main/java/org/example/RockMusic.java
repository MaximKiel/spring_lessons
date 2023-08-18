package org.example;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> songs = List.of("Enter", "Unfor", "Wolf");

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
