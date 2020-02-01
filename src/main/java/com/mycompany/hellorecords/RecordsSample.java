package com.mycompany.hellorecords;

import java.util.Set;

public class RecordsSample {

    public Beer drinkBeer(Beer beer, Beer dist) {
        return new Beer(beer.x() + dist.x(), beer.y() + dist.y());
    }

    public void checkNoCollissions(Set<Beer> seenBeer, Beer b) {
        if (!seenBeer.add(b)) {
            throw new AssertionError("Collision!");
        }
    }

    public record Beer(int x, int y) {
        
    }
    
}



