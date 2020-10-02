package com.emrhmrc.spiniy.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.emrhmrc.spiniy.helper.BaseModel;
import com.emrhmrc.spiniy.helper.ISpiniy;
import com.emrhmrc.spiniy.adapter.SpiniyAdapter;
import com.emrhmrc.spiniy.databinding.SpiniyLayoutBinding;

/**
 * Created by hamurcuabi on 02,October,2020
 **/
public class Spiniy extends BaseWidget implements AdapterView.OnItemSelectedListener {

    private SpiniyLayoutBinding binding;
    private Context context;
    private ISpiniy iSpiniy;


    public Spiniy(@NonNull Context context) {
        super(context);
    }

    public Spiniy(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Spiniy(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Spiniy(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void initView(Context context) {
        this.context = context;
        binding = SpiniyLayoutBinding.inflate(LayoutInflater.from(getContext()), this, true);
    }

    @Override
    public void initView(Context context, AttributeSet attrs) {
        this.context = context;
        binding = SpiniyLayoutBinding.inflate(LayoutInflater.from(getContext()), this, true);
    }

    public void initialSpiniy(SpiniyAdapter adapter) {
        binding.spiniy.setAdapter(adapter);
        binding.spiniy.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(iSpiniy!=null)
        iSpiniy.onSpiniySelectedItem((BaseModel) adapterView.getSelectedItem(),i);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void setISpiniy(ISpiniy iSpiniy) {
        this.iSpiniy = iSpiniy;
    }
}
