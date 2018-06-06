package com.montywu.demo.componentsbasicsample.ui.main;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.montywu.demo.componentsbasicsample.entity.User;

/**
 * @author monty
 */
public class MainViewModel extends ViewModel {
    private MutableLiveData<User> user;

    public MutableLiveData<User> getUser() {
        if (user == null) {
            user = new MutableLiveData<>();
        }
        return user;
    }
}
