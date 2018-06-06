package com.montywu.demo.componentsbasicsample.entity;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * @author monty wm_8800@163.com
 * @date 2018/6/6  上午10:12
 * 作用: 使用ObservableFields实现数据与UI绑定
 */
public class Student {
    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableInt score = new ObservableInt();
}
