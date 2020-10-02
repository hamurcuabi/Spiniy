package com.emrhmrc.customspinner;


import android.content.Context;

import androidx.viewbinding.ViewBinding;

import com.emrhmrc.customspinner.databinding.TestSpiniyItemBinding;
import com.emrhmrc.spiniy.adapter.SpiniyAdapter;

import java.util.ArrayList;

/**
 * Created by hamurcuabi on 02,October,2020
 **/
public class TestAdapter extends SpiniyAdapter<Test> {

    public TestAdapter(Context context, ArrayList<Test> list) {
        super(context, list);
    }

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
