

In MainActivity i commended the following lines. These are the depricated one 

###  The following things are deprecated  with the newer facebook sdk
  ####     The Facebook SDK is now auto initialized on Application start.
  ####      If you are using the Facebook SDK in the main process and don't need a callback on SDK initialization completion you can now remove calls to FacebookSDK.sdkInitialize.
    ###  If you do need a callback, you should manually invoke the callback in your code.
   ####     Refer to: https://developers.facebook.com/docs/android/upgrading-4x
      

//        FacebookSdk.sdkInitialize(getApplicationContext());
//        AppEventsLogger.activateApp(this);

###     This method is using to get KeyHash which will be used in facebook developer account creation
        // once you register this method is no use further
//        getKeyHash();
