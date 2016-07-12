package com.mdeiml.minild69;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Building {
    
    private final int X;
    private final int Y;
    private final int WIDTH;
    private final int HEIGHT;
    
    public Building(int x, int y, int width, int height){
        this.X = x;
        this.Y = y;
        this.WIDTH = width;
        this.HEIGHT = height;
    }
    
    public void update(float delta) {}
    
    public void render(SpriteBatch batch) {
        batch.draw(getTexture(), X, Y);
    }
    
    public abstract TextureRegion getTexture();
    
}
