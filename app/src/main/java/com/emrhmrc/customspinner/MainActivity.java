package com.emrhmrc.customspinner;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.emrhmrc.customspinner.databinding.ActivityMainBinding;
import com.emrhmrc.spiniy.helper.ISpiniy;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ISpiniy<Test> {

    private static final String TAG = "MainActivity";
    private ActivityMainBinding binding;
    private ArrayList<Test> testArrayList;
    private TestAdapter testAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        testArrayList = new ArrayList<>();
        testArrayList.add(new Test("Selam", 1));
        testArrayList.add(new Test("Hello", 2));
        testArrayList.add(new Test("Hi", 3));
        testArrayList.add(new Test("Hola", 4));

        testAdapter = new TestAdapter(this, testArrayList);
        binding.spiniy.initialSpiniy(testAdapter);
        binding.spiniy.setISpiniy(this);

    }

    @Override
    public void onSpiniySelectedItem(Test item, int position) {
        Log.d(TAG, "onSpiniySelectedItem: " + item.toString());

    }

}