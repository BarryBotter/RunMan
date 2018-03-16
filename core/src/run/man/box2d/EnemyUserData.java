package run.man.box2d;

import com.badlogic.gdx.math.Vector2;

import run.man.enums.UserDataType;
import run.man.utils.constants;

/**
 * Created by Katriina on 16.3.2018.
 */

public class EnemyUserData extends UserData{

    private Vector2 linearVelocity;

    public EnemyUserData(float width, float height) {
        super(width, height);
        userDataType = UserDataType.ENEMY;
        linearVelocity = constants.ENEMY_LINEAR_VELOCITY;
    }

    public void setLinearVelocity(Vector2 linearVelocity) {
        this.linearVelocity = linearVelocity;
    }

    public Vector2 getLinearVelocity() {
        return linearVelocity;
    }
}
