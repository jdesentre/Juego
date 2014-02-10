package org.sfsoft.drop;

import org.sfsoft.drop.Drop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/**
 * Clase principal de la versión de escritorio (PC) del juego
 * @author Santiago Faci
 *
 */
public class DesktopDrop {

	public static void main(String[] args) {
		LwjglApplicationConfiguration configuracion = new LwjglApplicationConfiguration();
		configuracion.title = "Drop";
		configuracion.width = 1024;
		configuracion.height = 768;
		configuracion.useGL20 = true; //Permite que utilicemos dimensiones que no sean potencias de 2
		
		new LwjglApplication(new Drop(), configuracion);
	}
}
