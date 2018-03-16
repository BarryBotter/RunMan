package run.man.box2d;

import run.man.enums.UserDataType;

/**
 * Created by Katriina on 16.3.2018.
 */

public class GroundUserData extends UserData {

    public GroundUserData(float width, float height) {
        super(width, height);
        userDataType = UserDataType.GROUND;
    }
}
