package run.man.actors;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.scenes.scene2d.Actor;

import java.awt.Rectangle;

import run.man.box2d.UserData;
import run.man.utils.constants;


/**
 * Created by Katriina on 15.3.2018.
 */

public abstract class GameActor extends Actor {

    protected Body body;
    protected UserData userData;
    protected Rectangle screenRectangle;

    public GameActor() {
        screenRectangle = new Rectangle();
    }

    public GameActor(Body body) {
        this.body = body;
        this.userData = (UserData) body.getUserData();
    }


    @Override
    public void act(float delta) {
        super.act(delta);

        if (body.getUserData() != null) {
            //updateRectangle();
        } else {
            // This means the world destroyed the body (enemy or runner went out of bounds)
            remove();
        }

    }

    public abstract UserData getUserData();

    private void updateRectangle() {
        float sX = screenRectangle.x;
        float sY = screenRectangle.y;
        float sW= screenRectangle.width;
        float sH = screenRectangle.height;
        sX = transformToScreen(body.getPosition().x - userData.getWidth() / 2);
        sY = transformToScreen(body.getPosition().y - userData.getHeight() / 2);
        sW = transformToScreen(userData.getWidth());
        sH = transformToScreen(userData.getHeight());
    }

    protected float transformToScreen(float n) {
        return constants.WORLD_TO_SCREEN * n;
    }

    }

