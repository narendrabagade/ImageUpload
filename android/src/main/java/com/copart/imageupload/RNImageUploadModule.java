
package com.copart.imageupload;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNImageUploadModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNImageUploadModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNImageUpload";
  }
  /*
  *Create hidden Directory .MCAS in mobile device SD card
  */
  @ReactMethod
  public File createDirectory(){
    String imagePath = Environment.getExternalStorageDirectory().getAbsolutePath()+"/.MCAS";
    File picFolder = new File(imagePath);
    boolean success = true;
    if(!picFolder.exists()){
      success=picFolder.mkdirs();
    }
    if(success) {
      return picFolder;
    } else {
      return null;
    }
  }
}
