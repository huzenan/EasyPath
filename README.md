# EasyPath
Including a light PathParser tool and animated PathView for Android, which is based on vector. PathParser is easy to EXTEND, welcome and have fun!

## ScreenShots
### Normal
![EasyPath](https://github.com/huzenan/EasyPath/blob/master/screenshots/easy_path.gif)
### Dynamic&Repeat
![EasyPathRepeat](https://github.com/huzenan/EasyPath/blob/master/screenshots/easy_path_repeat.gif)

## Usage
> layout

```xml
    <com.hzn.easypath.EasyPathView
        android:id="@+id/easy_path_view"
        android:layout_width="50dp"
        android:layout_height="50dp"
        custom:epvAnimDurations="500,250"
        custom:epvAnimMode="separate"
        custom:epvDynamic="false"
        custom:epvFixedHeight="100"
        custom:epvFixedWidth="100"
        custom:epvPathString="m25,50 l50,75 m50,75 l75,25"
        custom:epvState="show"
        custom:epvStrokeColor="#ffffff"
        custom:epvStrokeFixedWidth="5"
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
        protected void onAnimEnd(int state) {
            // your codes
        }

        @Override
        protected void onAnimStart(int state) {
            // your codes
        }

        @Override
        protected void onAnimCancel(int state) {
            // your codes
        }

        @Override
        protected void onAnimRepeat(int state) {
            // your codes
        }
    });
```
