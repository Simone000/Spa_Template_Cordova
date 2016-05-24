/*global cordova, module*/

module.exports = {
    greet: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Stimer", "greet", [name]);
    },
    askReadCardData: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Stimer", "askReadCardData", [name]);
    }
};
