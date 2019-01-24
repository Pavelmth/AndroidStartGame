package ru.pavel.base;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import ru.pavel.math.Rect;

public class Sprite extends Rect {
    private float angele;
    private float scale = 1f;
    protected TextureRegion[] regions;
    protected int frame;

    public Sprite(TextureRegion region) {
        if (region == null) {
            throw  new NullPointerException("Create Sprite with null region");
        }
        regions = new TextureRegion[1];
        regions[0] = region;
    }

    public void setHeightProportion(float height) {
        setHeight(height);
        float aspect = regions[frame].getRegionWidth() / (float) regions[frame].getRegionHeight();
        setWidth(height * aspect);
    }

    public void resize(Rect wolldBounds) {

    }

    public void update(float delta) {

    }

    public boolean touchDown(Vector2 touch, int button) {
        return false;
    }

    public boolean touchUp(Vector2 touch, int button) {
        return false;
    }

    public void draw(SpriteBatch batch) {
        batch.draw(
                regions[frame], // current region
                getLeft(), getBottom(), // alignment
                halfWidth, halfWidth, // rotation point
                getWidth(), getHeight(), //
                scale, scale, // scale x and y
                angele // rotation angel
                );
    }

    public float getAngele() {
        return angele;
    }

    public void setAngele(float angele) {
        this.angele = angele;
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }
}
