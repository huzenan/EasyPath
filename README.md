# EasyPath
Including a light PathParser tool and animated PathView for Android, which is based on vector. PathParser is easy to EXTEND, welcome and have fun!

## ScreenShots
### Normal
![EasyPath](https://github.com/huzenan/EasyPath/blob/master/screenshots/easy_path.gif)
### Dynamic&Repeat
![EasyPathRepeat](https://github.com/huzenan/EasyPath/blob/master/screenshots/easy_path_repeat.gif)

## Usage
### Step 1
Define your string path like this:
```xml
    <string name="your_str_path">
        a61.3,55.2,279.3,273.2,45,359.9
           m244.3,244.3   l332.2,332.2
              m332.2,244.3   l244.3,332.2
    </string>
```
### Step 2
> layout

```xml
    <com.hzn.easypath.EasyPathView
        android:id="@+id/easy_path_view"
        android:layout_width="50dp"
        android:layout_height="50dp"
        custom:epvAnimDurations="500,250,200"
        custom:epvAnimMode="separate"
        custom:epvDynamic="false"
        custom:epvFixedHeight="400"
        custom:epvFixedWidth="400"
        custom:epvPathString="@string/your_str_path"
        custom:epvState="show"
        custom:epvStrokeColor="#ffffff"
        custom:epvStrokeFixedWidth="15"
        custom:epvStrokeIsRound="true"/>
```
> Activity

```java
    easyPathView.starDraw(true); // true if repeat
    ...
    easyPathView.starErase();
    ...
    easyPathView.stopRepeat();
    ...
    easyPathView.setAnimProgress(0.66f);
    ...
    easyPathView.addOnAnimatorListener(new EasyPathView.OnAnimatorListener() {
        @Override
        protected void onAnimStart(int state) {
            // your codes
        }
        
        @Override
        protected void onAnimEnd(int state) {
            // your codes
        }
        
        @Override
        protected void onAnimRepeat(int state) {
            // your codes
        }
    });
```
