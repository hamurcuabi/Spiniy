# Spiniy
The easiest way to use spinner !


![spiniy](https://user-images.githubusercontent.com/23655824/94928501-72c0a780-04cc-11eb-8f21-6fbc0922c988.png)
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
	 implementation 'com.github.hamurcuabi:GenericRCV:CURRENT VERSION'
	 

}
```

## Configuration
```
1-Create your model extending from BaseModel (TestModel)

  public class TestModel extends BaseModel 
```
```
2-Create your item layout for view (I am using databinding and butterknife)

  item_test.xml in layput folder from our sample project you can copy and  past then build it to generate binding classes
  ```
  
  ```
3-Create adapter

public class TestAdapter extends GenericAdapter<TestModel,
        IOnItemClickListener<TestModel>,
        TestViewHolder> implements Filterable ..
     ```
 
4-Create Viewholder   

public class TestViewHolder extends BaseViewHolder<TestModel,
        IOnItemClickListener<TestModel>> ...
```
```
5-Activty or fragment setup your adapter should implements IOnItemClickListener, IOnSwipe

testAdapter = new TestAdapter(this, this, emptyView);
        GRVHelper.setupWithSwipe(testAdapter, recyclerView, this);
```
 
 ```
 I am strongly recommending to you looking for sample project. It is basic and understable   
  ```
[![](https://jitpack.io/v/hamurcuabi/GenericRCV.svg)](https://jitpack.io/#hamurcuabi/GenericRCV)
  ![GenericRCV Demo](https://media.giphy.com/media/gGqTDj6UBMRZsX51CT/giphy.gif)

