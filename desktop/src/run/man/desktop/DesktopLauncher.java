package run.man.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import run.man.RunManRun;
import run.man.utils.constants;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = constants.APP_WIDTH;
		config.height = constants.APP_HEIGHT;
		new LwjglApplication(new RunManRun(), config);
	}
}
