# EasyPath
Including a light PathParser tool and animated PathView for Android, which is based on vector. PathParser is easy to EXTEND, welcome and have fun!

## ScreenShots
### Icons
![icon1](https://github.com/huzenan/EasyPath/blob/master/screenshots/icons1.gif)

![icon2](https://github.com/huzenan/EasyPath/blob/master/screenshots/icons2.gif)
### Separate
![EasyPathSeparate](https://github.com/huzenan/EasyPath/blob/master/screenshots/easy_path_separate.gif)
### Together
![EasyPathTogether](https://github.com/huzenan/EasyPath/blob/master/screenshots/easy_path_together.gif)
### Dynamic&Repeat
![EasyPathRepeat](https://github.com/huzenan/EasyPath/blob/master/screenshots/easy_path_repeat.gif)

## Usage
### Step 1
Define your path string like this:
```xml
    <string name="path_string_android">
        m100,300    c130,20,470,20,500,300    m500,300
            l500,525  100,525  100,300  500,300
                m200,180  o215,180,10,1    m400,180  o385,180,10,2
                    m200,105  l175,75    m400,105  l425,75
    </string>
```
### Step 2
> layout

```xml
    <com.hzn.easypath.EasyPathView
        android:id="@+id/easy_path_view"
        android:layout_width="50dp"
        android:layout_height="50dp"
        custom:epvAnimDurations="250,350,150,150,150,150"
        custom:epvAnimMode="separate"
        custom:epvDynamic="false"
        custom:epvFixedHeight="600"
        custom:epvFixedWidth="600"
        custom:epvPathString="@string/path_string_android"
        custom:epvState="show"
        custom:epvStrokeColor="#09991c"
        custom:epvStrokeFixedWidth="20"
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
