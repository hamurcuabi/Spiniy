package com.emrhmrc.spiniy.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.emrhmrc.spiniy.R;
import com.emrhmrc.spiniy.adapter.SpiniyAdapter;
import com.emrhmrc.spiniy.databinding.SpiniyLayoutBinding;
import com.emrhmrc.spiniy.helper.BaseModel;
import com.emrhmrc.spiniy.helper.ISpiniy;
import com.emrhmrc.spiniy.helper.SpiniyMode;

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
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.Spiniy, 0, 0);
        try {
            int background = ta.getColor(R.styleable.Spiniy_spiniy_popbackground, 0);
            SpiniyMode spiniyMode = SpiniyMode.values()[ta.getInt(R.styleable.Spiniy_spiniy_mode, 0)];
            if (background != 0) {
                //TODO
                //  binding.spiniy.setPopupBackgroundResource(background);
            }
        } finally {
            ta.recycle();
        }
    }

    public void initialSpiniy(SpiniyAdapter adapter) {
        binding.spiniy.setAdapter(adapter);
        binding.spiniy.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if (iSpiniy != null)
            iSpiniy.onSpiniySelectedItem((BaseModel) adapterView.getSelectedItem(), i);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setISpiniy(ISpiniy iSpiniy) {
        this.iSpiniy = iSpiniy;
    }


}
