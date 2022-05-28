package com.ballon;

import com.badlogic.gdx.Game;

public class BalloonGame extends Game {
    @Override
    public void create() {
        BalloonLevel z = new BalloonLevel(this) {
            @Override
            public boolean scrolled(float amountX, float amountY) {
                return false;
            }
        };
        setScreen(z);

    }
}
