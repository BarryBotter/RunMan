package run.man.box2d;

import run.man.enums.UserDataType;

/**
 * Created by Katriina on 16.3.2018.
 */

public abstract class UserData {

    protected UserDataType userDataType;
    protected float width;
    protected float height;


    public UserData() {

    }

    public UserData(float width, float height) {
        this.width = this.width;
        this.height = this.height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public UserDataType getUserDataType () {

        return userDataType;
    }
}
