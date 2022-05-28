package com.ballon;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.graphics.Texture;

public class Balloon extends BaseActor
{
    public float speed;
    public float frequency;
    public float amplitude;
    public float initialY;
    public float time;

    public Balloon()
    {
        speed     = 80 * MathUtils.random(0.5f, 2.0f);
        frequency  = 1 * MathUtils.random(0.5f, 2.0f);
        amplitude = 50 * MathUtils.random(0.5f, 2.0f);
        initialY = 120 * MathUtils.random(0.5f, 2.0f);
        time = 0;
        setTexture( new Texture( Gdx.files.internal("red-balloon.png")) );

        // initial spawn location off-screen
        setPosition(-100, -100);
    }

    public void act(float dt)
    {
        super.act(dt);
        time += dt;
        // set starting location to before left boundary
        float xPos = speed * time - 100;
        float yPos = initialY + amplitude * MathUtils.sin(frequency * xPos * 6.28f / 640);
        setPosition( xPos, yPos );
    }
}
