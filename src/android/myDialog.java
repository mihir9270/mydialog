package cordova-plugin-mydialog;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import android.app.AlertDialog;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class myDialog extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("coolMethod")) {
            String message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        }
        return false;
    }

    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

    private void openSampleDialog() {
        new AlertDialog.Builder(context)
            .setTitle("Sample Dialog")
             .setMessage("This is a Sample Dialog")
            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialog, int which) { 
            // continue with delete
            this.dimiss();
        }
     })
     .show();
    }
}
