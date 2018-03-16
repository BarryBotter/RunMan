package run.man.actors;

import com.badlogic.gdx.physics.box2d.Body;

import run.man.box2d.EnemyUserData;
import run.man.box2d.UserData;

/**
 * Created by Katriina on 16.3.2018.
 */

public class Enemy extends GameActor {


    public Enemy(Body body) {
        super(body);
    }

    @Override
    public EnemyUserData getUserData() {
        return (EnemyUserData) userData;
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        body.setLinearVelocity(getUserData().getLinearVelocity());
    }
}
