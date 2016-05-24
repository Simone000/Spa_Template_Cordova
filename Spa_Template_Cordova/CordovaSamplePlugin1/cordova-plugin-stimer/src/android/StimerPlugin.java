package org.cosi.cordova.stimer;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class StimerPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
        if (action.equals("greet")) {
            String name = data.getString(0);
            String message = "Hello, " + name;
            callbackContext.success(message);

			//callbackContext.error("Errore");

            return true;
        }
		else if(action.equals("askReadCardData"))
		{
			String cardSerial = "50003545";
			callbackContext.success(cardSerial);

			//callbackContext.error("Errore");

			return true;
		}
		else {
            return false;
        }
    }
}
