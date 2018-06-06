package com.montywu.demo.componentsbasicsample.ui.main;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.montywu.demo.componentsbasicsample.entity.User;

/**
 * @author monty wm_8800@163.com
 * @date 2018/6/6  上午10:08
 * 作用: 处理点击事件
 */
public class MyHandlers {
    private Context context;

    public MyHandlers(Context context) {
        this.context = context;
    }

    public void onClick(View view, User user) {

        Toast.makeText(context, "点击了按钮,UserName->" + user.getLastName(), Toast.LENGTH_LONG).show();
    }
}
