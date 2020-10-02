
# Spiniy 
![spiniy](https://user-images.githubusercontent.com/23655824/94928501-72c0a780-04cc-11eb-8f21-6fbc0922c988.png)

# The easiest way to use custom spinner !
# You can use your own classes and item layouts with databinding!


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
    
 I am strongly recommending to you looking for sample project. It is basic and understable   
  ```
