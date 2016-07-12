package com.mdeiml.minild69;
import java.util.ArrayList;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Map {
    
    private final int WIDTH;
    private final int HEIGHT;
    
    private Tile[][] tiles;
    private ArrayList<Building> buildings;
    
    public Map(int w, int h) {
        WIDTH = w;
        HEIGHT = h;
    }
    
    public void render(SpriteBatch batch) {
        for(int x = 0; x < WIDTH; x++) {
            for(int y = 0; y < HEIGHT; y++) {
                tiles[x][y].render(batch, x, y);
            }
        }
        for(int i = 0; i < buildings.size(); i++) {
            buildings.get(i).render(batch);
        }
    }
    
}
