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

    public GameActor(Body body) {
        this.body = body;
        this.userData = (UserData) body.getUserData();
    }


    public abstract UserData getUserData();


}
