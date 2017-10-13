
# react-native-image-upload

## Getting started

`$ npm install react-native-image-upload --save`

### Mostly automatic installation

`$ react-native link react-native-image-upload`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-image-upload` and add `RNImageUpload.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNImageUpload.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.copart.imageupload.RNImageUploadPackage;` to the imports at the top of the file
  - Add `new RNImageUploadPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-image-upload'
  	project(':react-native-image-upload').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-image-upload/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-image-upload')
  	```


## Usage
```javascript
import RNImageUpload from 'react-native-image-upload';

// TODO: What to do with the module?
RNImageUpload;
```
  # ImageUpload
