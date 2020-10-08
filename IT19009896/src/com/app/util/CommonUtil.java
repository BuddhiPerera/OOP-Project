/* 
 * IT19009896
 * Perera K.B.N
 * SLIIT
 */
package com.app.util;

import java.io.IOException;
import java.util.Properties;

public class CommonUtil {
	public static final Properties property = new Properties();
	
	static {
		try {
			property.load(DBConnectionUtil.class.getResourceAsStream(CommonConstants.PROPERTY_FILE_NAME));
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
