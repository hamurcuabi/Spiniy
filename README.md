
## Spiniy   
![spiniy](https://user-images.githubusercontent.com/23655824/94928501-72c0a780-04cc-11eb-8f21-6fbc0922c988.png)
[![](https://jitpack.io/v/hamurcuabi/Spiniy.svg)](https://jitpack.io/#hamurcuabi/Spiniy)


 The easiest way to use custom spinner !
 You can use your own classes and item layouts with databinding!


## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	implementation 'com.github.hamurcuabi:Spiniy:Tag'
	 

}
```

## Configuration
```
1-Create your model implements BaseModel (TestModel)

 public class Test implements BaseModel
```
```
2-Create your spinner item layout for view (I am using databinding and viewbinding)

  test_spiniy_item in layout folder from our sample project you can copy and paste then build it

  ```
  ```
3-Create adapter extends from SpiniyAdapter

public class TestAdapter extends SpiniyAdapter<Test> {

    public TestAdapter(Context context, ArrayList<Test> list) {
        super(context, list);
    }

    //id of your layout
    @Override
    public int setItemLayout() {
        return R.layout.test_spiniy_item;
    }

    @Override
    public void bindItem(Test item, ViewBinding convertView) {
        //Cast to your binding
        ((TestSpiniyItemBinding) convertView).setTest(item);
    }


}

  ```
  ```
 4-In your acitivity or fragment implements ISpiniy<Test> than initialize it
 
    private ArrayList<Test> testArrayList;
    private TestAdapter testAdapter;
    
    //List of array
   testArrayList = new ArrayList<>();
        testArrayList.add(new Test("Selam", 1));
        testArrayList.add(new Test("Hello", 2));
        testArrayList.add(new Test("Hi", 3));
        testArrayList.add(new Test("Hola", 4));

     // set adapter
        testAdapter = new TestAdapter(this, testArrayList);
        binding.spiniy.initialSpiniy(testAdapter);
        binding.spiniy.setISpiniy(this);

```
  ```

//This methode will be triggered after selection
   @Override
    public void onSpiniySelectedItem(Test item, int position) {
        Log.d(TAG, "onSpiniySelectedItem: " + item.toString());

    }
    ```
  ```
## Features

You can set background and spinner mode from xml attr
```
app:spiniy_popbackground="@drawable/ic_launcher_background"
        app:spiniy_mode="Popup"

  ```
 You have to use Databinding in your spiner item layout like below
   ```
 <?xml version="1.0" encoding="utf-8"?>
<layout xmlns:android="http://schemas.android.com/apk/res/android">

    <data>

        <variable
            name="test"
            type="com.emrhmrc.customspinner.Test" />

    </data>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="match_parent"
            android:text="@{String.valueOf(test.id)}"
            android:textColor="@color/colorPrimaryDark"
            android:textSize="18sp" />
	  
```
## Warning

! Use viewbinding, databinding , Java 1.8
```
compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }

    viewBinding {
        enabled = true
    }
    dataBinding {
        enabled = true
    }
