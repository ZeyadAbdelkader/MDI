package com.MDI.Task.utilities;

import java.util.ResourceBundle;

public class Constants {

	private static final ResourceBundle ENVIRONMENT_RN = ResourceBundle.getBundle("environment");
	public static final String ENVIRONMENT_NAME = ENVIRONMENT_RN.getString("env.name");
	public static final String APPLICATION_HOST = ENVIRONMENT_RN.getString("app.host");


}
