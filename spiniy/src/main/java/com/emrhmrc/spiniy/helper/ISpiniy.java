package com.emrhmrc.spiniy.helper;

/**
 * Created by hamurcuabi on 02,October,2020
 **/
public interface ISpiniy<T extends BaseModel> {
    void onSpiniySelectedItem(T item, int position);
}
