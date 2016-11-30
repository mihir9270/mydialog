var exec = require('cordova/exec');

var myDialog = {
    coolMethod: function(arg0, success, error) {
    exec(success, error, "myDialog", "coolMethod", [arg0]);
    },

    openSampleDialog: function(arg0, success, error) {
    exec(success, error, "myDialog", openSampleDialog, [arg0]);
    }
};


module.exports  = myDialog;



