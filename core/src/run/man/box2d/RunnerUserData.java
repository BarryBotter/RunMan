package run.man.box2d;

import com.badlogic.gdx.math.Vector2;

import run.man.enums.UserDataType;
import run.man.utils.constants;

/**
 * Created by Katriina on 16.3.2018.
 */

public class RunnerUserData extends UserData {

    private final Vector2 runningPosition = new Vector2(constants.RUNNER_X, constants.RUNNER_Y);
    private final Vector2 dodgePosition = new Vector2(constants.RUNNER_DODGE_X, constants.RUNNER_DODGE_Y);
    private Vector2 jumpingLinearImpulse;

    public RunnerUserData(float width, float height) {
        super(width, height);
        jumpingLinearImpulse = constants.RUNNER_JUMPING_LINEAR_IMPULSE;
        userDataType = UserDataType.RUNNER;
    }

    public Vector2 getJumpingLinearImpulse() {
        return jumpingLinearImpulse;
    }

    public void setJumpingLinearImpulse(Vector2 jumpingLinearImpulse) {
        this.jumpingLinearImpulse = jumpingLinearImpulse;
    }

    public float getHitAngularImpulse() {
        return constants.RUNNER_HIT_ANGULAR_IMPULSE;
    }

    public float getDodgeAngle() {
        return (float) (-90f * (Math.PI / 180f));
    }

    public Vector2 getRunningPosition() {
        return runningPosition;
    }

    public Vector2 getDodgePosition() {
        return dodgePosition;

    }
}