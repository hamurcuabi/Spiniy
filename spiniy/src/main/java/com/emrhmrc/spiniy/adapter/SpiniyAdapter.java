package com.emrhmrc.spiniy.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.viewbinding.ViewBinding;

import com.emrhmrc.spiniy.helper.BaseModel;

import java.util.ArrayList;

/**
 * Created by hamurcuabi on 02,October,2020
 **/
public abstract class SpiniyAdapter<T extends BaseModel> extends ArrayAdapter<T> {

    public SpiniyAdapter(Context context, ArrayList<T> list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView, ViewGroup parent) {

        ViewBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(getContext()),
                setItemLayout(),
                parent,
                false);

        T item = getItem(position);
        bindItem(item, binding);
        return binding.getRoot();
    }


    public abstract int setItemLayout();

    public abstract void bindItem(T item, ViewBinding convertView);

}
