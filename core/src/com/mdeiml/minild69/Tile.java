package com.mdeiml.minild69;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Tile {
    
    private final TextureRegion tex;
    private final boolean solid;
    private final int resource;
    
    public Tile(TextureRegion tex, boolean solid, int resource) {
        this.tex = tex;
        this.solid = solid;
        this.resource = resource;
    }
    
    public void render(SpriteBatch batch, int x, int y) {
        batch.draw(tex, x, y);
    }

    public int getResource() {
        return resource;
    }

    public boolean isSolid() {
        return solid;
    }

    public TextureRegion getTex() {
        return tex;
    }
    
}
