package run.man.utils;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;

import run.man.box2d.EnemyUserData;
import run.man.box2d.GroundUserData;
import run.man.box2d.RunnerUserData;
import run.man.enums.EnemyType;

/**
 * Created by Katriina on 14.3.2018.
 */

public class WorldUtils {

    public static World createWorld() {
        return new World(constants.WORLD_GRAVITY, true);
    }

    public static Body createGround(World world) {
        BodyDef bodyDef = new BodyDef();
        bodyDef.position.set(new Vector2(constants.GROUND_X, constants.GROUND_Y));
        Body body = world.createBody(bodyDef);
        PolygonShape shape = new PolygonShape();
        shape.setAsBox(constants.GROUND_WIDTH / 2, constants.GROUND_HEIGHT / 2);
        body.createFixture(shape, constants.GROUND_DENSITY);
        body.setUserData(new GroundUserData());
        shape.dispose();
        return body;
    }

    public static Body createRunner(World world) {
        BodyDef bodyDef = new BodyDef();
        bodyDef.type = BodyDef.BodyType.DynamicBody;
        bodyDef.position.set(new Vector2(constants.RUNNER_X, constants.RUNNER_Y));
        PolygonShape shape = new PolygonShape();
        shape.setAsBox(constants.RUNNER_WIDTH / 2, constants.RUNNER_HEIGHT / 2);
        Body body = world.createBody(bodyDef);
        body.setGravityScale(constants.RUNNER_GRAVITY_SCALE);
        body.createFixture(shape, constants.RUNNER_DENSITY);
        body.resetMassData();
        body.setUserData(new RunnerUserData(constants.RUNNER_WIDTH, constants.RUNNER_HEIGHT));
        shape.dispose();
        return body;
    }

    public static Body createEnemy(World world) {
        EnemyType enemyType = RandomUtils.getRandomEnemyType();
        BodyDef bodyDef = new BodyDef();
        bodyDef.type = BodyDef.BodyType.KinematicBody;
        bodyDef.position.set(new Vector2(enemyType.getX(), enemyType.getY()));
        PolygonShape shape = new PolygonShape();
        shape.setAsBox(enemyType.getWidth() / 2, enemyType.getHeight() / 2);
        Body body = world.createBody(bodyDef);
        body.createFixture(shape, enemyType.getDensity());
        body.resetMassData();
        EnemyUserData userData = new EnemyUserData(enemyType.getWidth(), enemyType.getHeight());
        body.setUserData(userData);
        shape.dispose();
        return body;
    }
}